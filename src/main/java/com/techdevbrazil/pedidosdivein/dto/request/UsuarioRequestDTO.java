package com.techdevbrazil.pedidosdivein.dto.request;

import com.techdevbrazil.pedidosdivein.entity.Usuario;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequestDTO {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Boolean ativo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public static Usuario paraUsuario(UsuarioRequestDTO usuario) {
        return Usuario.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .senha(usuario.getSenha())
                .build();
    }

}
