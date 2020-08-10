package com.dmz.stock.connection;

import configuracoes.Application;
import configuracoes.SystemMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author seraf
 */
public class ConnectionFactory {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement;
    private static Statement statement;
    private static ResultSet resultSet;

    public static final Connection getConnection() {

        if (connection == null) {

            try {
                String server = Application.getProperties().getProperty("prop.server.host");
                String database = Application.getProperties().getProperty("prop.server.data");
                String user = Application.getProperties().getProperty("prop.server.user");
                String password = Application.getProperties().getProperty("prop.server.password");
                String port = Application.getProperties().getProperty("prop.server.port");

                String serverUrl = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + database;

                connection = DriverManager.getConnection(serverUrl, user, password);
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        SystemMessage.CONNECTION_ERROR,
                        SystemMessage.SYSTEM_NAME,
                        JOptionPane.ERROR_MESSAGE,
                        SystemMessage.setIconDatabaseJOptionPane()
                );

                System.err.println(ex.getMessage());

                System.exit(0);
            }
        }
        return connection;
    }

    public static PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public static void setPreparedStatement(PreparedStatement preparedStatement) {
        ConnectionFactory.preparedStatement = preparedStatement;
    }

    public static Statement getStatement() {
        return statement;
    }

    public static void setStatement(Statement statement) {
        ConnectionFactory.statement = statement;
    }

    public static ResultSet getResultSet() {
        return resultSet;
    }

    public static void setResultSet(ResultSet resultSet) {
        ConnectionFactory.resultSet = resultSet;
    }

    public final static void closeConnection() {
        try {

            if (getResultSet() != null) {
                /* Fechando o ResultSet */

                getResultSet().close();
            }

            if (getStatement() != null) {
                /* Fechando o Statement */

                getStatement().close();
            }

            if (getPreparedStatement() != null) {
                /* Fechando o PreparedStatement */

                getPreparedStatement().close();
            }

        } catch (SQLException | NullPointerException e) {
        }
    }

}
