package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Usuario;
import co.edu.uniquindio.poo.service.IUsuarioService;

public class UsuarioController {
    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario registrarUsuario(String nombre, String correo, String telefono) {
        return usuarioService.registrarUsuario(nombre, correo, telefono);
    }

    public Usuario buscarUsuarioPorId(String id) {
        return usuarioService.buscarUsuarioPorId(id);
    }
}
