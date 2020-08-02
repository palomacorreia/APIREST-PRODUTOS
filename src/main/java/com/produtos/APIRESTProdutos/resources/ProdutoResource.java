package com.produtos.APIRESTProdutos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.produtos.APIRESTProdutos.models.Produto;
import com.produtos.APIRESTProdutos.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Produto listaProdutoUnico(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping("/produtos")
    public Produto salvaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    @DeleteMapping("/produtos")
    public void deletaProduto(@RequestBody  Produto produto) {
        produtoRepository.delete(produto);
    }
    @PutMapping("/produtos")
    public Produto atualizaProduto(@RequestBody  Produto produto) {
        return produtoRepository.save(produto);
    }
}
