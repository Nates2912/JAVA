package br.com.apivscode.produtos.servico;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.apivscode.produtos.modelo.ProdutoModelo;
import br.com.apivscode.produtos.repositorio.ProdutoRepositorio;

@Service 
public class ProdutoServico {
    
    private final ProdutoRepositorio repositorio;

    //construtor
    public ProdutoServico(ProdutoRepositorio repositorio){
        this.repositorio=repositorio;
    }

    //Iterabel - jeito de retornar metodos de consulta

    public  Iterable<ProdutoModelo> listar(){
        return repositorio.findAll();
    }

    public ResponseEntity <?> cadastrarAlterar(ProdutoModelo produto, String acao){
        if (produto.getNome() == null || produto.getNome().isBlank()){
            return ResponseEntity.badRequest().body(criarResposta("O nome do produto é obrigatório"));
        }
        if (produto.getMarca()==null||produto.getMarca().isBlank()){
            return ResponseEntity.badRequest().body(criarResposta("O nome da marca e obrigatório"))
        }
    }
}
