package com.dmz.stock.controller;

import com.dmz.stock.dao.UsuarioDAO;
import com.dmz.stock.model.Usuario;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seraf
 */
public class UsuarioController {

    private final UsuarioDAO usuarioDAO = new UsuarioDAO();

    /**
     *
     * @param usuario
     * @return
     */
    public int criarUsuario(Usuario usuario) {
        try {
            return usuarioDAO.criarUsuario(usuario);
        } catch (ParseException ex) {
            return 0;
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public Usuario pesquisarUsuarioPorIDDAO(int id) {
        return usuarioDAO.pesquisarUsuarioPorIDDAO(id);
    }

    /**
     *
     * @return
     */
    public List<Usuario> retornaTodosUsuarios() {
        return usuarioDAO.retornaTodosUsuarios();
    }

    /**
     *
     * @param nomeUsuario
     * @return
     */
    public List<Usuario> retornarUsuarioPeloNome(String nomeUsuario) {
        return usuarioDAO.retornarUsuarioPeloNome(nomeUsuario);
    }

    /**
     *
     * @param perfil
     * @return
     */
    public List<Usuario> retornarUsuarioPeloPerfil(String perfil) {
        return usuarioDAO.retornarUsuarioPeloPerfil(perfil);
    }
}
