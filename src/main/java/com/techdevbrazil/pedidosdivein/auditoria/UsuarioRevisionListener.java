package com.techdevbrazil.pedidosdivein.auditoria;

import com.techdevbrazil.pedidosdivein.entity.CustomRevision;
import com.techdevbrazil.pedidosdivein.security.CustomUserDetails;
import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UsuarioRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {

        CustomRevision customRevision = (CustomRevision) revisionEntity;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {
            CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();

            customRevision.setUsuarioId(userDetails.getId());
        }

    }
}
