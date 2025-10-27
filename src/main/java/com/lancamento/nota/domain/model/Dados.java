package com.lancamento.nota.domain.model;

import com.lancamento.nota.contract.TableName;
import com.lancamento.nota.domain.enums.TipoIdentificacaoEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = TableName.DADOS)
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Dados extends BaseEntity{
    private String nome;
    private String contatoPrincipal;
    private String contatoSecundario;

    private String morada;

    private String nomePai;

    private String nomeMae;

    @Enumerated(EnumType.ORDINAL)
    private TipoIdentificacaoEnum tipoIdentificacaoEnum;

    @Column(unique = true, name = "numero_documento")
    private String numeroDocumento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
