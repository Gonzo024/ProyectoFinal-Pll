package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    boolean registrarUsuario(Usuario usuario);
    Usuario buscarUsuarioPorId(String id);
    List<Usuario> obtenerUsuarios();
    boolean eliminarUsuario(String id);
}
