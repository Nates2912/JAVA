package br.com.apivscode.produtos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ProdutoControle {

    @GetMapping ("")
    public String rota(){
        return "api de produtos funcionando!";
    }
}
