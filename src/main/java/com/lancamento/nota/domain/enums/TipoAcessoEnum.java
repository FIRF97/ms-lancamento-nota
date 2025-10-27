package com.lancamento.nota.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.lancamento.nota.domain.config.TipoEnumerado;

public enum TipoAcessoEnum implements TipoEnumerado {
    ESTUDANTE(1, "Estudante"),
    PROFESSOR(2, "Professor"),
    COORDENADOR_CURSO(3, "Coordenador de curso"),
    DIRETOR_PEDAGOGICO(4, "Diretor pedagógico");

    private final int codigo;
    private final String descricao;

    TipoAcessoEnum(int codigo, String descricao) {
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
