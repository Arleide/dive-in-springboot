package com.techdevbrazil.pedidosdivein.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "itens_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pprodutos_id")
    private  Produto produto;

    @ManyToOne
    @JoinColumn(name = "pedidos_id")
    private Pedido pedido;

    private BigDecimal valor;
    private Integer quantidade;
    private BigDecimal desconto;


    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    private  LocalDateTime dataAtualizacao;

}
