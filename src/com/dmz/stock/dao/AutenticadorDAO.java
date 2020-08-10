package com.dmz.stock.dao;

import com.dmz.stock.connection.ConnectionFactory;
import com.dmz.stock.model.SoftDelete;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author seraf
 */
public class AutenticadorDAO {

    private static final Connection CONNECTION = ConnectionFactory.getConnection();

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public int autenticacao(String username, String password) {
        int idUsuario = 0;
        String SQL = "SELECT * FROM usuario u "
                + " INNER JOIN funcionario f ON f.id = u.id_funcionario "
                + " WHERE u.username = ? AND u.password = ?  AND f.soft_delete NOT IN (?)";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, username);
            ConnectionFactory.getPreparedStatement().setString(2, password);
            ConnectionFactory.getPreparedStatement().setString(3, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                idUsuario = ConnectionFactory.getResultSet().getInt(1);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            idUsuario = 0;
        } finally {
            ConnectionFactory.closeConnection();
        }
        return idUsuario;
    }

}
