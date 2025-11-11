package co.edu.uniquindio.poo.service.impl;

import co.edu.uniquindio.poo.model.Usuario;
import co.edu.uniquindio.poo.service.IUsuarioService;
import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService {
    // Usa la base de datos Singleton
    private final Database db = Database.getInstance();

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        if (usuario == null || db.findUsuarioById(usuario.getIdUsuario()) != null) {
            return false; 
        }
        db.getUsuarios().add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
        return true;
    }

    @Override
    public Usuario buscarUsuarioPorId(String id) {
        return db.findUsuarioById(id);
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return db.getUsuarios();
    }

    @Override
    public boolean eliminarUsuario(String id) {
        Usuario u = db.findUsuarioById(id);
        if (u != null) {
            db.getUsuarios().remove(u);
            return true;
        }
        return false;
    }
}
