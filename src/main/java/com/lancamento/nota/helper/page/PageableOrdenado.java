package com.lancamento.nota.helper.page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class PageableOrdenado {
    public static Pageable getPageableOrdenado(Pageable pageable){
        return PageRequest.of(
                pageable.getPageNumber(),
                pageable.getPageSize(),
                Sort.by("nome").ascending()
        );
    }

}
