package com.techdevbrazil.pedidosdivein.dto.request;

import com.techdevbrazil.pedidosdivein.enums.RoleEnum;

public record RegisterRequest(
        String nome,
        String email,
        String senha,
        RoleEnum role
) {}
