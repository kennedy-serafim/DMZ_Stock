package com.dmz.stock.dao;

import com.dmz.stock.connection.ConnectionFactory;
import com.dmz.stock.model.Fornecedor;
import com.dmz.stock.model.SoftDelete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public class FornecedorDAO {

    private static final Connection CONNECTION = ConnectionFactory.getConnection();

    /**
     *
     * @param fornecedor
     * @return
     */
    public long criarFornecedorDAO(Fornecedor fornecedor) {
        String SQL = "INSERT INTO fornecedor (nuit, cidade_fornecedor, "
                + "nome_fornecedor, pais, tipo_produto) VALUES(?, ?, ?, ?, ?);";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS));
            ConnectionFactory.getPreparedStatement().setString(1, fornecedor.getNUIT());
            ConnectionFactory.getPreparedStatement().setString(2, fornecedor.getCidadeFornecedor());
            ConnectionFactory.getPreparedStatement().setString(3, fornecedor.getNomeFornecedor());
            ConnectionFactory.getPreparedStatement().setString(4, fornecedor.getPais());
            ConnectionFactory.getPreparedStatement().setString(5, fornecedor.getTipoProduto());

            ConnectionFactory.getPreparedStatement().executeUpdate();

            fornecedor.setIdFornecedor(ConnectionFactory.getLastInsertID(
                    ConnectionFactory.getPreparedStatement()));
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return fornecedor.getIdFornecedor();
    }

    /**
     *
     * @param fornecedor
     * @return
     */
    public int atualizarDadosFornecedorDAO(Fornecedor fornecedor) {
        String SQL = "UPDATE fornecedor SET nuit = ?, "
                + "cidade_fornecedor = ?, "
                + "nome_fornecedor = ?, pais = ?, tipo_produto = ?"
                + " WHERE id  = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
          ConnectionFactory.getPreparedStatement().setString(1, fornecedor.getNUIT());
            ConnectionFactory.getPreparedStatement().setString(2, fornecedor.getCidadeFornecedor());
            ConnectionFactory.getPreparedStatement().setString(3, fornecedor.getNomeFornecedor());
            ConnectionFactory.getPreparedStatement().setString(4, fornecedor.getPais());
            ConnectionFactory.getPreparedStatement().setString(5, fornecedor.getTipoProduto());
            ConnectionFactory.getPreparedStatement().setLong(6, fornecedor.getIdFornecedor());

            return ConnectionFactory.getPreparedStatement().executeUpdate();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        } finally {
            ConnectionFactory.closeConnection();
        }

    }

    /**
     *
     * @return
     */
    public static List<Fornecedor> retornarTodosFornecedoresDAO() {
        List<Fornecedor> fornecedors = new ArrayList<>();
        Fornecedor fornecedor;
        String SQL = SQL_SELECT + " ORDER BY nome_fornecedor";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                fornecedor = new Fornecedor();
                fornecedor.setIdFornecedor(ConnectionFactory.getResultSet().getLong(1));
                fornecedor.setNomeFornecedor(ConnectionFactory.getResultSet().getString(2));
                fornecedor.setTipoProduto(ConnectionFactory.getResultSet().getString(3));
                fornecedor.setPais(ConnectionFactory.getResultSet().getString(4));
                fornecedor.setNUIT(ConnectionFactory.getResultSet().getString(5));
                fornecedor.setCidadeFornecedor(ConnectionFactory.getResultSet().getString(6));
                fornecedor.setAvenidaFornecedor(ConnectionFactory.getResultSet().getString(7));

                fornecedors.add(fornecedor);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return fornecedors;
    }

    /**
     *
     * @param nuit
     * @return
     */
    public static boolean verificarNuitDAO(String nuit) {
        String SQL = "SELECT * FROM fornecedor WHERE nuit = ?";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, nuit);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());
            return ConnectionFactory.getResultSet().next();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
    public static Fornecedor retornarFornecedoresPorIdDAO(long idFornecedor) {
        Fornecedor fornecedor = null;
        String SQL = SQL_SELECT + "AND id = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setLong(2, idFornecedor);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                fornecedor = new Fornecedor();
               fornecedor.setIdFornecedor(ConnectionFactory.getResultSet().getLong(1));
                fornecedor.setNomeFornecedor(ConnectionFactory.getResultSet().getString(2));
                fornecedor.setTipoProduto(ConnectionFactory.getResultSet().getString(3));
                fornecedor.setPais(ConnectionFactory.getResultSet().getString(4));
                fornecedor.setNUIT(ConnectionFactory.getResultSet().getString(5));
                fornecedor.setCidadeFornecedor(ConnectionFactory.getResultSet().getString(6));
                fornecedor.setAvenidaFornecedor(ConnectionFactory.getResultSet().getString(7));

            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return fornecedor;
    }

    /**
     *
     * @param nome
     * @return
     */
    public static List<Fornecedor> retornarTodosFornecedoresNomeDAO(String nome) {
        List<Fornecedor> fornecedors = new ArrayList<>();
        Fornecedor fornecedor;
        String SQL = SQL_SELECT + " AND nome_fornecedor LIKE ? ORDER BY nome_fornecedor";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, nome + "%");
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                fornecedor = new Fornecedor();
                fornecedor.setIdFornecedor(ConnectionFactory.getResultSet().getLong(1));
                fornecedor.setNomeFornecedor(ConnectionFactory.getResultSet().getString(2));
                fornecedor.setTipoProduto(ConnectionFactory.getResultSet().getString(3));
                fornecedor.setPais(ConnectionFactory.getResultSet().getString(4));
                fornecedor.setNUIT(ConnectionFactory.getResultSet().getString(5));
                fornecedor.setCidadeFornecedor(ConnectionFactory.getResultSet().getString(6));
                fornecedor.setAvenidaFornecedor(ConnectionFactory.getResultSet().getString(7));
                fornecedors.add(fornecedor);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return fornecedors;
    }

    /**
     *
     * @param nome
     * @return
     */
    public static Fornecedor retornarTodosFornecedoresPorNomeDAO(String nome) {
        Fornecedor fornecedor = null;
        String SQL = SQL_SELECT + "AND nome_fornecedor = ? ORDER BY nome_fornecedor";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, nome);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                fornecedor = new Fornecedor();
              fornecedor.setIdFornecedor(ConnectionFactory.getResultSet().getLong(1));
                fornecedor.setNomeFornecedor(ConnectionFactory.getResultSet().getString(2));
                fornecedor.setTipoProduto(ConnectionFactory.getResultSet().getString(3));
                fornecedor.setPais(ConnectionFactory.getResultSet().getString(4));
                fornecedor.setNUIT(ConnectionFactory.getResultSet().getString(5));
                fornecedor.setCidadeFornecedor(ConnectionFactory.getResultSet().getString(6));
                fornecedor.setAvenidaFornecedor(ConnectionFactory.getResultSet().getString(7));

            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return fornecedor;
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public int apagarRegisto(int idFornecedor) {
        String SQL = "UPDATE fornecedor SET soft_delete = ?, deleted_at = getdate() "
                + " WHERE id = ?;";

        try {
            ConnectionFactory.setPreparedStatement(CONNECTION.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setInt(2, idFornecedor);

            return ConnectionFactory.getPreparedStatement().executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        } finally {
            ConnectionFactory.closeConnection();
        }
    }

    private static final String SQL_SELECT = "SELECT * FROM fornecedor WHERE soft_delete NOT IN(?) ";
}
