package com.techdevbrazil.pedidosdivein.controller;

import com.techdevbrazil.pedidosdivein.entity.Produto;
import com.techdevbrazil.pedidosdivein.service.ProdutoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Produtos")
@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private  final ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<Page<Produto>> listarProdutos(){
        return  ResponseEntity.ok(produtoService.findAll());
    }

    @PostMapping
    public  ResponseEntity<Produto> save(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(produtoService.save(produto));
    }

}
