package com.techdevbrazil.pedidosdivein.service;

import com.techdevbrazil.pedidosdivein.entity.Produto;
import com.techdevbrazil.pedidosdivein.repository.ProdutoReposytory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoReposytory produtoReposytory;

    public Produto findById(Long id) {
        return produtoReposytory.findById(id).get();
    }

    public Page<Produto> findAll() {

        int pageNumber = 0;
        int pageSize = 10;

        Pageable pageable = PageRequest.of(
                pageNumber,
                pageSize
        );

        return produtoReposytory.findAll(pageable);
    }

    public Produto save(Produto produto) {
        return produtoReposytory.save(produto);
    }

    @Transactional
    public void atualizarPreco(Long id, BigDecimal preco) {
        produtoReposytory.atualizarPreco(id, preco);

    }

}
