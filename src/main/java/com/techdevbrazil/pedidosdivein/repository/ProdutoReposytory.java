package com.techdevbrazil.pedidosdivein.repository;

import com.techdevbrazil.pedidosdivein.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoReposytory extends JpaRepository<Produto, Long> {


    @Query("""
        select p from Produto p where p.nome = :nome
    """)
    public List<Produto> buscarPorNomeJPQL(String nome);

    @Query(value = "select * from public.produtos where nome = :nome",
            nativeQuery = true)
    public List<Produto> buscarPorNomeSQLNativo(String nome);

    public List<Produto> findByNome(String nome);

    public List<Produto> findByNomeContainingIgnoreCase(String nome);

    public List<Produto> findByPreco(BigDecimal preco);

    @Modifying
    @Query("update Produto p set p.preco = :preco where p.id = :id")
    public void atualizarPreco(Long id, BigDecimal preco);

}
