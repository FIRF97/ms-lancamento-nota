package com.lancamento.nota.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.lancamento.nota.domain.config.TipoEnumerado;

public enum TipoIdentificacaoEnum implements TipoEnumerado{
    BI(1, "Bilhete de identidade"),
    CEDULA(2,"Cédula"),
    OUTROS(3, "Outros");

    private final int codigo;
    private final String descricao;

    TipoIdentificacaoEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @JsonValue
    public int toValue() {
        return this.codigo;
    }

    @JsonCreator
    public static TipoAcessoEnum fromCodigo(int codigo) {
        return TipoEnumerado.fromCodigo(TipoAcessoEnum.class, codigo);
    }
}
