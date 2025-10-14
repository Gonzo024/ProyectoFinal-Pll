package co.edu.uniquindio.poo.Service;

import co.edu.uniquindio.poo.Model.Usuario;

public interface IUsuarioService {
    Usuario registrarUsuario(String nombre, String correo, String telefono);
    Usuario buscarUsuarioPorId(String id);
}
