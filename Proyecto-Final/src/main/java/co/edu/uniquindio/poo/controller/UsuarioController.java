package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Usuario;
import co.edu.uniquindio.poo.service.IUsuarioService;

import java.util.List;

public class UsuarioController {
    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public boolean registrarUsuario(Usuario usuario) {
        return usuarioService.registrarUsuario(usuario);
    }

    public Usuario buscarUsuario(String id) {
        return usuarioService.buscarUsuarioPorId(id);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    public boolean eliminarUsuario(String id) {
        return usuarioService.eliminarUsuario(id);
    }
}