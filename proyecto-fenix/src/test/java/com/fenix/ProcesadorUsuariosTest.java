package com.fenix;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para ProcesadorUsuarios.
 */
class ProcesadorUsuariosTest {

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

//Archivo Renombrado: ProcesadorUsuariosTest.java