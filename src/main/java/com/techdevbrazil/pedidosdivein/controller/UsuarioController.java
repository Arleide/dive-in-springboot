package com.techdevbrazil.pedidosdivein.controller;

import com.techdevbrazil.pedidosdivein.dto.esponse.UsuarioResponseDTO;
import com.techdevbrazil.pedidosdivein.dto.request.UsuarioRequestDTO;
import com.techdevbrazil.pedidosdivein.entity.Usuario;
import com.techdevbrazil.pedidosdivein.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Usuarios")
@RequiredArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> findAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> save(@RequestBody UsuarioRequestDTO usuarioRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuarioRequest));
    }


}


