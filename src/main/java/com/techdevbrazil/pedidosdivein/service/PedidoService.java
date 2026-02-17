package com.techdevbrazil.pedidosdivein.service;

import com.techdevbrazil.pedidosdivein.entity.Pedido;
import com.techdevbrazil.pedidosdivein.entity.Usuario;
import com.techdevbrazil.pedidosdivein.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final UsuarioService usuarioService;

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Pedido findById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido save(Pedido pedido) {

        Usuario usuario = usuarioService.findById(pedido.getUsuario().getId());

        if (usuario == null) {
            throw new RuntimeException("Usuario nao existe");
        }

        return pedidoRepository.save(pedido);
    }

}
