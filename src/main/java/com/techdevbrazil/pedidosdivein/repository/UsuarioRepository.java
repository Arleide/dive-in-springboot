package com.techdevbrazil.pedidosdivein.repository;

import com.techdevbrazil.pedidosdivein.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);

}
