package com.techdevbrazil.pedidosdivein.entity;

import com.techdevbrazil.pedidosdivein.enums.SituacaoPedidoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataPedido;

    @Enumerated(EnumType.STRING)
    private SituacaoPedidoEnum situacao;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    private  Usuario usuario;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    private  LocalDateTime dataAtualizacao;

}
