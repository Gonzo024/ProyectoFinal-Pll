package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Usuario;

public interface IUsuarioService {
    Usuario registrarUsuario(String nombre, String correo, String telefono);
    Usuario buscarUsuarioPorId(String id);
}
