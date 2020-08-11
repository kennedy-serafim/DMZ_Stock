package com.dmz.stock.dao;

import com.dmz.stock.connection.ConnectionFactory;
import com.dmz.stock.model.Fornecedor;
import com.dmz.stock.model.Produto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seraf
 */
public class FornecedorProdutoDAO {

    private final Connection connection = ConnectionFactory.getConnection();

    /**
     *
     * @param idFornecedor
     * @param idProduto
     * @return
     */
    public int criarFornecedorProduto(int idFornecedor, int idProduto) {
        String SQL = "INSERT INTO [dbo].[fornecedor_produto] ([id_fornecedor] ,[id_produto]) "
                + " VALUES(?, ?);";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setInt(1, idFornecedor);
            ConnectionFactory.getPreparedStatement().setInt(2, idProduto);

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
     * @param idProduto
     * @return
     */
    public Fornecedor retornarFornecedorPorProduto(int idProduto) {
        Fornecedor fornecedor = null;
        String SQL = "SELECT * FROM fornecedor_produto fp "
                + " INNER JOIN fornecedor f ON fp.id_fornecedor = f.id "
                + " WHERE fp.id_produto = ?;";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setInt(1, idProduto);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                fornecedor = new Fornecedor();
                fornecedor.setIdFornecedor(ConnectionFactory.getResultSet().getLong(3));
                fornecedor.setNomeFornecedor(ConnectionFactory.getResultSet().getString(4));
                fornecedor.setTipoProduto(ConnectionFactory.getResultSet().getString(5));
                fornecedor.setPais(ConnectionFactory.getResultSet().getString(6));
                fornecedor.setNUIT(ConnectionFactory.getResultSet().getString(7));
                fornecedor.setCidadeFornecedor(ConnectionFactory.getResultSet().getString(8));
                fornecedor.setAvenidaFornecedor(ConnectionFactory.getResultSet().getString(9));
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
    public List<Produto> retornarProdutosPorFornecedorId(int idFornecedor) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto;
        String SQL = "SELECT * FROM fornecedor_produto INNER JOIN produto ON fornecedor_produto.id_produto = produto.id"
                + " WHERE fornecedor_produto.id_fornecedor = ?;";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setInt(1, idFornecedor);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();

                produto.setId(ConnectionFactory.getResultSet().getInt(3));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(4));
                produto.setNome(ConnectionFactory.getResultSet().getString(5));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(6));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(7));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(8));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(9));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(10));
                produto.setValorTotal(ConnectionFactory.getResultSet().getBigDecimal(11));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getBigDecimal(12));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(13));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(14));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(15));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }
}
