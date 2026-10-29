package br.com.example.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.example.controle.ProdutoControle;
import br.com.example.modelo.Produto;

public class ProdutoView {
    private Scanner sc = new Scanner(System.in);
    private ProdutoControle controle = new ProdutoControle();

    public void menu(){
        int opcao;

        do {
            System.out.println("Sistema de produtos\n1-Cadastrar\n2-Listar\n3-Buscar\n4-Alterar\n5-Remover\n0-Sair");
            System.out.println("Escolha a opção:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> buscar();
                case 4 -> alterar();
                case 5 -> remover();
                case 0 -> System.err.println("Sistema encerrado.");
                default -> System.err.println("Opção Inválda! Digite um número entre 0 e 5.");
            }
        } while (opcao!=0);
        sc.close();
    }
    private void cadastrar(){
        System.out.println("\n---CADASTRO---\nCódigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        if (controle.cadastrar(codigo, nome, preco)){
            System.out.println("Produto cadastrado com sucesso!");
        }else{
            System.err.println("Não é possivel cadastrar");
        }
    }
    private void listar (){
        System.out.println("\n---LISTAR---\n");
        ArrayList<Produto> produtos = controle.listar();
        if (produtos.isEmpty()){
            System.err.println("Nenhum produto cadastrado!");
        }else{
            for (Produto produto : produtos) {
                System.out.println("Código: "+produto.getCodigo()+"\nNome: "+produto.getNome()+"\nPreço: "+produto.getPreco());

            }
        }
    }
    private void buscar(){
        System.out.println("Digite o código: ");
        int codigo = sc.nextInt();
        Produto produto = controle.buscar(codigo);

        if (produto!=null){
            System.out.println("Código: "+produto.getCodigo()+"\nNome: "+produto.getNome()+"\nPreço: "+produto.getPreco());
        }else{
            System.err.println("Produto não encontrado.");
        }
    }
    private void alterar(){
        System.out.println("Código do produto: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        Produto produto = controle.buscar(codigo);
        if (produto == null){
            System.err.println("Produto não encontrado!");
            return;
        }
        System.out.println("Novo nome: ");
        String nome = sc.nextLine();
        System.out.println("Novo preço: ");
        double preco = sc.nextDouble();

        if (controle.alterar(codigo, nome, preco)){
            System.out.println("Produto alterado");
        }else{
            System.out.println("Não foi possivel alterar");
        }
    }
    private void remover(){
        System.out.println("Código do produto: ");
        int codigo = sc.nextInt();
        if(controle.remover(codigo)) {
            System.out.println("Produto removido");
        }else{
            System.err.println("Produto não encontrado");
        }
    }
}