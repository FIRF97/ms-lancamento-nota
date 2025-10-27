package com.lancamento.nota.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    private UUID id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataRegistro;

    @Column(nullable = false)
    private boolean activo;

    @Column
    private LocalDateTime dataAtualizacao;

    @PrePersist
    public void aoCriar() {
        this.dataRegistro = LocalDateTime.now();
        this.activo = true;
    }

    @PreUpdate
    public void aoAtualizar() {
        this.dataAtualizacao = LocalDateTime.now();
    }
}
