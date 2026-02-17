package com.techdevbrazil.pedidosdivein.repository.dao;

import com.techdevbrazil.pedidosdivein.entity.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Produto> buscarPorFiltro(Produto produto){

        StringBuilder sql = new StringBuilder();

        sql.append("select p from Produto p where 1=1");

        if (produto.getNome() != null && !produto.getNome().isEmpty()){
            sql.append(" and p.nome = :nome");
        }

        if (produto.getPreco() != null){
            sql.append(" and p.preco = :preco");
        }

        TypedQuery<Produto> query = em.createQuery(sql.toString(), Produto.class);

        if (produto.getNome() != null && !produto.getNome().isEmpty()){
            query.setParameter("nome", produto.getNome());
        }

        if (produto.getPreco() != null){
            query.setParameter("preco", produto.getPreco());
        }

        return query.getResultList();
    }
}
