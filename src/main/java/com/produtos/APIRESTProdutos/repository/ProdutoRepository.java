package com.produtos.APIRESTProdutos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.APIRESTProdutos.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById(long id);

}