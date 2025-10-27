package com.lancamento.nota.domain.config;

public class EnumUtils {
    private EnumUtils() {}

    public static <E extends Enum<E> & TipoEnumerado> E fromCodigo(Class<E> enumType, int codigo) {
        for (E e : enumType.getEnumConstants()) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        throw new IllegalArgumentException(
                "Código inválido: " + codigo + " para enum " + enumType.getSimpleName());
    }
}
