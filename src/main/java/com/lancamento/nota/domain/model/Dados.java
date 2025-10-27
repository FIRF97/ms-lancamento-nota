package com.lancamento.nota.domain.model;

import com.lancamento.nota.contract.TableName;
import com.lancamento.nota.domain.enums.TipoAcessoEnum;
import com.lancamento.nota.domain.enums.TipoIdentificacaoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    private TipoAcessoEnum tipoAcessoEnum;
    private String morada;
    private String nomePai;
    private String nomeMae;
    private TipoIdentificacaoEnum tipoIdentificacaoEnum;
    private String numeroDocumento;
    private String email;
    private User user;
}
