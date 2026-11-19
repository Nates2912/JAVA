package br.com.apivscode.produtos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apivscode.produtos.modelo.UserModelo;


public interface UserRepositorio extends JpaRepository<UserModelo, Long>{
    
    UserModelo findByUsuario(String usuario);
}
