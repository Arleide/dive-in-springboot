package com.techdevbrazil.pedidosdivein.entity;

import com.techdevbrazil.pedidosdivein.auditoria.BaseEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.time.LocalDateTime;

@Getter
@Setter
@Audited
@MappedSuperclass
@EntityListeners(BaseEntityListener.class)
public abstract class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private Long createdBy;

    private LocalDateTime updatedAt;

    private Long updatedBy;
}