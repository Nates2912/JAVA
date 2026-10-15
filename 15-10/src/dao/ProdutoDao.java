package dao;

import java.util.ArrayList;
import modelo.Produto;



public class ProdutoDao {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto produto){
        //void nao retorna nada
        produtos.add(produto);
    }

    public ArrayList<Produto>listar(){
        //quando nao ter void, tem que usar return
        return produtos;
    }

    public Produto buscar(int codigo){
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public boolean  alterar(int codigo, String nome, double preco){
        Produto produto = buscar(codigo);

        if (produto != null) {
            produto.setNome(nome);
            produto.setPreco(preco);

            return true;
        }
        return false;
    }

    public boolean  remover (int codigo){
        Produto produto = buscar(codigo);

        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return  false;
    }
}
