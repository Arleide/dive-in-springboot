package com.techdevbrazil.pedidosdivein.service;

import com.techdevbrazil.pedidosdivein.dto.converter.DtoMapper;
import com.techdevbrazil.pedidosdivein.dto.esponse.UsuarioResponseDTO;
import com.techdevbrazil.pedidosdivein.dto.request.UsuarioRequestDTO;
import com.techdevbrazil.pedidosdivein.entity.Usuario;
import com.techdevbrazil.pedidosdivein.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<UsuarioResponseDTO> findAll() {
        return usuarioRepository.findAll()
                .stream().map(UsuarioResponseDTO::deUsuario).collect(Collectors.toList());
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public UsuarioResponseDTO save(UsuarioRequestDTO usuarioRequest) {
        Usuario usuariosalvo = usuarioRepository.save(UsuarioRequestDTO.paraUsuario(usuarioRequest));
        return DtoMapper.converter(usuariosalvo, UsuarioResponseDTO.class);
    }

    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }


}
