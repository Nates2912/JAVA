package br.com.apivscode.produtos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apivscode.produtos.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends JpaRepository<ProdutoModelo, Long>{
    
}
