package co.edu.uniquindio.poo.Controller;

import co.edu.uniquindio.poo.Model.Usuario;
import co.edu.uniquindio.poo.Service.IUsuarioService;

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
