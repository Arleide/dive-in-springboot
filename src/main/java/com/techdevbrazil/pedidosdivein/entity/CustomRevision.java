package com.techdevbrazil.pedidosdivein.entity;

import com.techdevbrazil.pedidosdivein.auditoria.UsuarioRevisionListener;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@Getter
@Setter
@Entity
@RevisionEntity(UsuarioRevisionListener.class)
@Table(name = "revinfo")
public class CustomRevision extends DefaultRevisionEntity {

    private Long usuarioId;
}
