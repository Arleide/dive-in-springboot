package com.techdevbrazil.pedidosdivein.repository;

import com.techdevbrazil.pedidosdivein.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
