package com.dmz.stock.dao;

import com.dmz.stock.connection.ConnectionFactory;
import com.dmz.stock.model.ContactoEmail;
import com.dmz.stock.model.ContactoTelefone;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public final class ContactoFornecedorDAO {

    private static final Connection CONNECTION = ConnectionFactory.getConnection();

    /**
     *
     * @param phones
     * @return
     */
    public boolean criarFornecedorListaTelefonicaDAO(List<ContactoTelefone> phones) {
        String SQL = "INSERT INTO fornecedor_telefone VALUES(?, ?);";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));

            for (ContactoTelefone phone : phones) {
                ConnectionFactory.getPreparedStatement().setLong(1, phone.getId());
                ConnectionFactory.getPreparedStatement().setString(2, phone.getTelefone());
                ConnectionFactory.getPreparedStatement().executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return false;
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public boolean atualizarFornecedorListaTelefonicaDAO(long idFornecedor) {
        return deletePhone(idFornecedor);
    }

    /**
     *
     * @param emails
     * @return
     */
    public boolean criarFornecedorListaElectronicaDAO(List<ContactoEmail> emails) {
        String SQL = "INSERT INTO fornecedor_email VALUES(?, ?);";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));

            for (ContactoEmail email : emails) {
                ConnectionFactory.getPreparedStatement().setLong(1, email.getId());
                ConnectionFactory.getPreparedStatement().setString(2, email.getEmail());
                ConnectionFactory.getPreparedStatement().executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return false;
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public boolean atualizarFornecedorListaElectronicaDAO(long idFornecedor) {
        return deleteEmail(idFornecedor);
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public static List<ContactoTelefone> retornarTodosContactosTelefonicosFornecedorDAO(long idFornecedor) {
        ContactoTelefone phone;
        List<ContactoTelefone> phones = new ArrayList<>();
        String SQL = "SELECT * FROM fornecedor_telefone WHERE id_fornecedor = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setLong(1, idFornecedor);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                phone = new ContactoTelefone(ConnectionFactory.getResultSet().getString(2));
                phones.add(phone);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return phones;
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public static List<ContactoEmail> retornarTodosContactosElectronicosFornecedorDAO(long idFornecedor) {

        ContactoEmail phone;
        List<ContactoEmail> phones = new ArrayList<>();
        String SQL = "SELECT * FROM fornecedor_email WHERE id_fornecedor = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setLong(1, idFornecedor);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                phone = new ContactoEmail(ConnectionFactory.getResultSet().getString(2));
                phones.add(phone);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return phones;
    }

    /**
     *
     * @param phone
     * @return
     */
    public static boolean verificarExistenciaTelefoneFornecedorDAO(String phone) {
        String SQL = "SELECT * FROM fornecedor_telefone WHERE telefone = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, phone);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            return ConnectionFactory.getResultSet().next();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection();
        }
    }

    /**
     *
     * @param email
     * @return
     */
    public static boolean verificarExistenciaEmailFornecedorDAO(String email) {
        String SQL = "SELECT * FROM fornecedor_email WHERE email = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, email);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            return ConnectionFactory.getResultSet().next();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection();
        }
    }

    /**
     *
     * @param idFuncionario
     * @return
     */
    private boolean deletePhone(long idFuncionario) {
        String SQL = "DELETE FROM fornecedor_telefone WHERE fornecedor_telefone.id_fornecedor = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setLong(1, idFuncionario);
            return ConnectionFactory.getPreparedStatement().execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection();
        }
    }

    /**
     *
     * @param idFuncionario
     * @return
     */
    private boolean deleteEmail(long idFuncionario) {
        String SQL = "DELETE FROM fornecedor_email WHERE fornecedor_email.id_fornecedor = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setLong(1, idFuncionario);
            return ConnectionFactory.getPreparedStatement().execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection();
        }
    }

}
