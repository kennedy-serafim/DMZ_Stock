package com.dmz.stock.dao;

import com.dmz.stock.connection.ConnectionFactory;
import com.dmz.stock.model.Funcionario;
import com.dmz.stock.model.SoftDelete;
import com.dmz.stock.model.TipoUsuario;
import com.dmz.stock.model.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seraf
 */
public class UsuarioDAO {

    private final Connection connection = ConnectionFactory.getConnection();

    /**
     *
     * @param usuario
     * @return
     * @throws java.text.ParseException
     */
    public int criarUsuario(Usuario usuario) throws ParseException {

        String SQL = "INSERT INTO [dbo].[usuario] ([id_funcionario] ,[username] ,[password] ,[tipo_usuario] ,[status])"
                + "     VALUES (?, ?, ?, ?, ?)";

        usuario.setId(new FuncionarioDAO().criarFuncionario(usuario));

        try {
            if (usuario.getId() > 0) {
                ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
                ConnectionFactory.getPreparedStatement().setInt(1, usuario.getId());
                ConnectionFactory.getPreparedStatement().setString(2, usuario.getUsername());
                ConnectionFactory.getPreparedStatement().setString(3, usuario.getPassword());
                ConnectionFactory.getPreparedStatement().setString(4, usuario.getTipoUsuario().toString());
                ConnectionFactory.getPreparedStatement().setString(5, usuario.getStatus());

                if (ConnectionFactory.getPreparedStatement().executeUpdate() > 0) {
                    return usuario.getId();
                }
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            usuario.setId(0);
        } finally {
            ConnectionFactory.closeConnection();
        }

        return usuario.getId();
    }

    /**
     *
     * @param id
     * @return
     */
    public Usuario pesquisarUsuarioPorIDDAO(int id) {
        Usuario usuario = null;
        String SQL = "SELECT * FROM usuario u "
                + " INNER JOIN funcionario f ON f.id = u.id_funcionario "
                + " WHERE u.id_funcionario = ? AND f.soft_delete NOT IN(?);";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setInt(1, id);
            ConnectionFactory.getPreparedStatement().setString(2, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                usuario = new Usuario();
                usuario.setId(ConnectionFactory.getResultSet().getInt(1));
                usuario.setUsername(ConnectionFactory.getResultSet().getString(2));
                usuario.setPassword(ConnectionFactory.getResultSet().getString(3));
                usuario.setTipoUsuario(TipoUsuario.valueOf(ConnectionFactory.getResultSet().getString(4)));
                usuario.setStatus(ConnectionFactory.getResultSet().getString(5));
                usuario.setNome(ConnectionFactory.getResultSet().getString(7));
                usuario.setApelido(ConnectionFactory.getResultSet().getString(8));
                usuario.setOutroNome(ConnectionFactory.getResultSet().getString(9));
                usuario.setNascimento(ConnectionFactory.getResultSet().getDate(10));
                usuario.setGenero(ConnectionFactory.getResultSet().getString(11));
                usuario.setbIdentidade(ConnectionFactory.getResultSet().getString(12));
                usuario.setNuit(ConnectionFactory.getResultSet().getString(13));
                usuario.setNacionalidade(ConnectionFactory.getResultSet().getString(14));
                usuario.setCreatedAt(ConnectionFactory.getResultSet().getDate(15));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return usuario;
    }

    /**
     *
     * @return
     */
    public List<Usuario> retornaTodosUsuarios() {
        Usuario usuario;
        List<Usuario> usuarios = new ArrayList<>();
        String SQL = "SELECT * FROM usuario u "
                + " INNER JOIN funcionario f ON f.id = u.id_funcionario "
                + " WHERE f.soft_delete NOT IN(?);";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                usuario = new Usuario();
                usuario.setId(ConnectionFactory.getResultSet().getInt(1));
                usuario.setUsername(ConnectionFactory.getResultSet().getString(2));
                usuario.setPassword(ConnectionFactory.getResultSet().getString(3));
                usuario.setTipoUsuario(TipoUsuario.valueOf(ConnectionFactory.getResultSet().getString(4)));
                usuario.setStatus(ConnectionFactory.getResultSet().getString(5));
                usuario.setNome(ConnectionFactory.getResultSet().getString(7));
                usuario.setApelido(ConnectionFactory.getResultSet().getString(8));
                usuario.setOutroNome(ConnectionFactory.getResultSet().getString(9));
                usuario.setNascimento(ConnectionFactory.getResultSet().getDate(10));
                usuario.setGenero(ConnectionFactory.getResultSet().getString(11));
                usuario.setbIdentidade(ConnectionFactory.getResultSet().getString(12));
                usuario.setNuit(ConnectionFactory.getResultSet().getString(13));
                usuario.setNacionalidade(ConnectionFactory.getResultSet().getString(14));
                usuario.setCreatedAt(ConnectionFactory.getResultSet().getDate(15));

                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return usuarios;
    }

    /**
     *
     * @param nomeUsuario
     * @return
     */
    public List<Usuario> retornarUsuarioPeloNome(String nomeUsuario) {
        Usuario usuario;
        List<Usuario> usuarios = new ArrayList<>();
        String SQL = "SELECT * FROM usuario u "
                + " INNER JOIN funcionario f ON f.id = u.id_funcionario "
                + " WHERE f.soft_delete NOT IN(?) AND f.nome LIKE ?;";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, nomeUsuario + "%");
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                usuario = new Usuario();
                usuario.setId(ConnectionFactory.getResultSet().getInt(1));
                usuario.setUsername(ConnectionFactory.getResultSet().getString(2));
                usuario.setPassword(ConnectionFactory.getResultSet().getString(3));
                usuario.setTipoUsuario(TipoUsuario.valueOf(ConnectionFactory.getResultSet().getString(4)));
                usuario.setStatus(ConnectionFactory.getResultSet().getString(5));
                usuario.setNome(ConnectionFactory.getResultSet().getString(7));
                usuario.setApelido(ConnectionFactory.getResultSet().getString(8));
                usuario.setOutroNome(ConnectionFactory.getResultSet().getString(9));
                usuario.setNascimento(ConnectionFactory.getResultSet().getDate(10));
                usuario.setGenero(ConnectionFactory.getResultSet().getString(11));
                usuario.setbIdentidade(ConnectionFactory.getResultSet().getString(12));
                usuario.setNuit(ConnectionFactory.getResultSet().getString(13));
                usuario.setNacionalidade(ConnectionFactory.getResultSet().getString(14));
                usuario.setCreatedAt(ConnectionFactory.getResultSet().getDate(15));

                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return usuarios;
    }

    /**
     *
     * @param perfil
     * @return
     */
    public List<Usuario> retornarUsuarioPeloPerfil(String perfil) {
        Usuario usuario;
        List<Usuario> usuarios = new ArrayList<>();
        String SQL = "SELECT * FROM usuario u "
                + " INNER JOIN funcionario f ON f.id = u.id_funcionario "
                + " WHERE f.soft_delete NOT IN(?) AND u.tipo_usuario = ?;";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, perfil);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                usuario = new Usuario();
                usuario.setId(ConnectionFactory.getResultSet().getInt(1));
                usuario.setUsername(ConnectionFactory.getResultSet().getString(2));
                usuario.setPassword(ConnectionFactory.getResultSet().getString(3));
                usuario.setTipoUsuario(TipoUsuario.valueOf(ConnectionFactory.getResultSet().getString(4)));
                usuario.setStatus(ConnectionFactory.getResultSet().getString(5));
                usuario.setNome(ConnectionFactory.getResultSet().getString(7));
                usuario.setApelido(ConnectionFactory.getResultSet().getString(8));
                usuario.setOutroNome(ConnectionFactory.getResultSet().getString(9));
                usuario.setNascimento(ConnectionFactory.getResultSet().getDate(10));
                usuario.setGenero(ConnectionFactory.getResultSet().getString(11));
                usuario.setbIdentidade(ConnectionFactory.getResultSet().getString(12));
                usuario.setNuit(ConnectionFactory.getResultSet().getString(13));
                usuario.setNacionalidade(ConnectionFactory.getResultSet().getString(14));
                usuario.setCreatedAt(ConnectionFactory.getResultSet().getDate(15));

                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return usuarios;
    }

}
