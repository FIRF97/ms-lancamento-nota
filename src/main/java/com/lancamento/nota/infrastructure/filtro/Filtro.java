package com.lancamento.nota.infrastructure.filtro;

import org.springframework.data.jpa.domain.Specification;

public class Filtro<T>  {

    public Specification<T> buildFilter() {
        Specification<T> spec = null;
        return spec;
    }

}
