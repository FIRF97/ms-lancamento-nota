package com.lancamento.nota.helper.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Collection;

@Getter
@Setter
public class ApiResponse {
    private final int status;
    private final String mensagem;
    private Integer totalPaginado;
    private final Integer totalRegistro;
    private final Object dados;

    public ApiResponse(HttpStatus status, String mensagem, Object dados, Integer totalRegisto) {
        this.status = status.value();
        this.mensagem = mensagem;
        this.dados = dados;
        this.totalPaginado = calcularTotalPaginado(dados);
        this.totalRegistro = totalRegisto;
    }

    public ApiResponse(HttpStatus status, String mensagem, Integer totalRegistro) {
        this(status, mensagem, null, totalRegistro);
    }

    private Integer calcularTotalPaginado(Object dados) {
        if (dados instanceof Collection<?>) {
            return ((Collection<?>) dados).size();
        } else if (dados != null && dados.getClass().isArray()) {
            return java.lang.reflect.Array.getLength(dados);
        }
        return null;
    }
}
