package com.fenix;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas unitarias para ProcesadorUsuarios.
 */
class EjemploPrueba {

    @Test
    void testProcesarListaComportamientoCorrecto() {
        ProcesadorUsuarios procesador = new ProcesadorUsuarios();

        List<String> lista = List.of(
                "Ana:1",
                "Luis:2",
                "Eva:1",
                "Juan:99"
        );

        String resultado = procesador.procesarLista(lista);

        assertEquals(
                "Admins: Ana,Eva | Invitados: Luis",
                resultado
        );
    }
}