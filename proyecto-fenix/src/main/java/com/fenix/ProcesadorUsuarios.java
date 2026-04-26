package com.fenix;

import java.util.List;

/**
 * Clase encargada de procesar listas de usuarios
 * separando administradores e invitados.
 */
public class ProcesadorUsuarios {

    private static final int ROL_ADMIN = 1;
    private static final int ROL_INVITADO = 2;

    /**
     * Procesa una lista de usuarios y los clasifica por rol.
     *
     * @param listaUsuarios lista en formato "nombre:rol"
     * @return resultado formateado
     */
    public String procesarLista(List<String> listaUsuarios) {
        StringBuilder admins = new StringBuilder();
        StringBuilder invitados = new StringBuilder();

        for (String usuario : listaUsuarios) {
            procesarUsuario(usuario, admins, invitados);
        }

        return "Admins: " + admins + " | Invitados: " + invitados;
    }

    private void procesarUsuario(String usuario, StringBuilder admins, StringBuilder invitados) {
        String[] partes = usuario.split(":");

        if (partes.length != 2) return;

        String nombre = partes[0];
        int rol = Integer.parseInt(partes[1]);

        if (rol == ROL_ADMIN) {
            agregarNombre(admins, nombre);
        } else if (rol == ROL_INVITADO) {
            agregarNombre(invitados, nombre);
        }
    }

    private void agregarNombre(StringBuilder lista, String nombre) {
        if (lista.length() > 0) {
            lista.append(",");
        }
        lista.append(nombre);
    }
}


//Autor: Valentin Fuentes