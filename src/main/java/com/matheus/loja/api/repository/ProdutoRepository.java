package com.matheus.loja.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.loja.api.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}