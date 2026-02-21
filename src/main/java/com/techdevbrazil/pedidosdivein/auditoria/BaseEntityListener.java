package com.techdevbrazil.pedidosdivein.auditoria;

import com.techdevbrazil.pedidosdivein.entity.BaseEntity;
import com.techdevbrazil.pedidosdivein.security.CustomUserDetails;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.LocalDateTime;

public class BaseEntityListener {

    @PrePersist
    public void prePersist(BaseEntity baseEntity) {
        baseEntity.setCreatedAt(LocalDateTime.now());
        baseEntity.setCreatedBy(getUsuarioIdToken());
        baseEntity.setUpdatedAt(LocalDateTime.now());
        baseEntity.setUpdatedBy(getUsuarioIdToken());
    }

    @PreUpdate
    public void preUpdate(BaseEntity baseEntity) {
        baseEntity.setUpdatedAt(LocalDateTime.now());
        baseEntity.setUpdatedBy(getUsuarioIdToken());
    }

    private Long getUsuarioIdToken() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication == null || !authentication.isAuthenticated()) {
            return null;
        }

        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();

        return userDetails.getId();
    }

}
