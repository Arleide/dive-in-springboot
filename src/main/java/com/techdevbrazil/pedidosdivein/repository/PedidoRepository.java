package com.techdevbrazil.pedidosdivein.repository;

import com.techdevbrazil.pedidosdivein.entity.Pedido;
import com.techdevbrazil.pedidosdivein.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository
        extends JpaRepository<Pedido,Long> {

}
