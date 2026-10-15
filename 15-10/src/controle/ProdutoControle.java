package controle;

import dao.ProdutoDao;
import java.util.ArrayList;
import modelo.Produto;

public class ProdutoControle {
    //vai no dao, solicita o que o cliente que

        private ProdutoDao dao;

        public ProdutoControle(){
            dao = new ProdutoDao();
        }

        //cria um produto e envia para o dao cadastrar
        public void cadastrar (int codigo, String nome, double preco){
            Produto produto = new Produto(codigo, nome, preco);
            dao.cadastrar(produto);
        }

        //solicitar ao dao a lista de produtos
        public ArrayList<Produto> listar (){
            return dao.listar();
        }

        public Produto buscar (int codigo){
            return  dao.buscar(codigo);
        }

        public boolean  alterar (int codigo, String nome, double preco){
            return dao.alterar(codigo, nome, preco);
        }

        public boolean remover (int codigo){
            return dao.remover(codigo);
        }
    
}
