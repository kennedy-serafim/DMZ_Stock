package com.dmz.stock.dao;

import com.dmz.stock.auxiliar.ConversorDateTime;
import com.dmz.stock.connection.ConnectionFactory;
import com.dmz.stock.model.Produto;
import com.dmz.stock.model.SoftDelete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author seraf
 */
public class ProdutoDAO {

    private final Connection connection = ConnectionFactory.getConnection();

    String SQL_SELECT = "SELECT * FROM produto WHERE soft_delete NOT IN(?) ";

    /**
     *
     * @param produto
     * @return
     * @throws ParseException
     */
    public int registarProduto(Produto produto) throws ParseException {
        produto.setId(0);
        String SQL = "INSERT INTO [dbo].[produto] ("
                + "[codigo_barras], [nome], [categoria], [descricao], [quantidade_caixa], [quantidade_unidade], [quantidade_minima], [valor_total], [valor_unidade],"
                + " [data_validade], [data_compra])"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS));
            ConnectionFactory.getPreparedStatement().setString(1, produto.getCodigoBarras());
            ConnectionFactory.getPreparedStatement().setString(2, produto.getNome());
            ConnectionFactory.getPreparedStatement().setString(3, produto.getCategoria());
            ConnectionFactory.getPreparedStatement().setString(4, produto.getDescricao());
            ConnectionFactory.getPreparedStatement().setInt(5, produto.getQuantidade());
            ConnectionFactory.getPreparedStatement().setInt(6, produto.getQuantidadePorCaixa());
            ConnectionFactory.getPreparedStatement().setInt(7, produto.getQuantidadeMinima());
            ConnectionFactory.getPreparedStatement().setDouble(8, produto.getValorTotal());
            ConnectionFactory.getPreparedStatement().setDouble(9, produto.getValorPorUnidade());
            ConnectionFactory.getPreparedStatement().setDate(10, ConversorDateTime.utilDateToSQLDate(produto.getDataValidade()));
            ConnectionFactory.getPreparedStatement().setDate(11, ConversorDateTime.utilDateToSQLDate(produto.getDataCompra()));

            ConnectionFactory.getPreparedStatement().executeUpdate();

            produto.setId(ConnectionFactory.getLastInsertID(ConnectionFactory.getPreparedStatement()));
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produto.getId();
    }

    /**
     *
     * @return
     */
    public List<Produto> retornarTodosProdutos() {
        String SQL = SQL_SELECT + "";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @param nomeProduto
     * @return
     */
    public List<Produto> retornarProdutoPeloNome(String nomeProduto) {
        String SQL = SQL_SELECT + " AND nome LIKE ?";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, nomeProduto + "%");
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @param dataEntrada
     * @return
     * @throws ParseException
     */
    public List<Produto> retornarProdutoPelaDataEntrada(Date dataEntrada) throws ParseException {
        String SQL = SQL_SELECT + " AND created_at = ?";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setDate(2, ConversorDateTime.utilDateToSQLDate(dataEntrada));
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @param dataCompra
     * @return
     * @throws ParseException
     */
    public List<Produto> retornarProdutoPelaDataCompra(Date dataCompra) throws ParseException {
        String SQL = SQL_SELECT + " AND data_compra = ?";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setDate(2, ConversorDateTime.utilDateToSQLDate(dataCompra));
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @param quantidade
     * @return
     */
    public List<Produto> retornarProdutoPelaQuantidade(int quantidade) {
        String SQL = SQL_SELECT + " AND quantidade_caixa = ?";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setInt(2, quantidade);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @return
     */
    public List<Produto> retornarProdutoPorEstoqueMinimo() {
        String SQL = SQL_SELECT + " AND quantidade_caixa <= quantidade_minima";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @param mes
     * @return
     */
    public List<Produto> retornarProdutoPeloMesEntrada(int mes) {
        String SQL = SQL_SELECT + " AND MONTH(created_at) = ?";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setInt(2, mes);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @param mes
     * @return
     */
    public List<Produto> retornarProdutoPeloMesCompra(int mes) {
        String SQL = SQL_SELECT + " AND MONTH(data_compra) = ?";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setInt(2, mes);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @return
     */
    public List<Produto> retornarProdutoPelaValidade() {
        String SQL = SQL_SELECT + " AND data_validade < getdate();";
        List<Produto> produtos = new ArrayList<>();
        Produto produto;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produtos;
    }

    /**
     *
     * @param idProduto
     * @return
     */
    public Produto retornarProdutoPeloId(int idProduto) {
        String SQL = SQL_SELECT + " AND id = ?";
        Produto produto = null;

        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setInt(2, idProduto);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());

            while (ConnectionFactory.getResultSet().next()) {
                produto = new Produto();
                produto.setId(ConnectionFactory.getResultSet().getInt(1));
                produto.setCodigoBarras(ConnectionFactory.getResultSet().getString(2));
                produto.setNome(ConnectionFactory.getResultSet().getString(3));
                produto.setCategoria(ConnectionFactory.getResultSet().getString(4));
                produto.setDescricao(ConnectionFactory.getResultSet().getString(5));
                produto.setQuantidade(ConnectionFactory.getResultSet().getInt(6));
                produto.setQuantidadeMinima(ConnectionFactory.getResultSet().getInt(7));
                produto.setQuantidadePorCaixa(ConnectionFactory.getResultSet().getInt(8));
                produto.setValorTotal(ConnectionFactory.getResultSet().getDouble(9));
                produto.setValorPorUnidade(ConnectionFactory.getResultSet().getDouble(10));
                produto.setDataValidade(ConnectionFactory.getResultSet().getDate(11));
                produto.setDataCompra(ConnectionFactory.getResultSet().getDate(12));
                produto.setDataEntrada(ConnectionFactory.getResultSet().getDate(13));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return produto;
    }

//    public static void main(String[] args) throws ParseException {
//        ProdutoDAO produtoDAO = new ProdutoDAO();
//
//        Produto produto = new Produto();
//        produto.setCodigoBarras("6009649710a350");
//        produto.setNome("Farinha top score 10Kg");
//        produto.setCategoria("Alimento");
//        produto.setDescricao("Arroz fino");
//        produto.setQuantidade(5);
//        produto.setQuantidadeMinima(5);
//        produto.setQuantidadePorCaixa(1);
//        produto.setValorTotal(12000);
//        produto.setValorPorUnidade(1200);
//        produto.setDataValidade(new Date());
//        produto.setDataCompra(new Date());
//
//        //  System.err.println(produtoDAO.registarProduto(produto));
//        System.out.println(produtoDAO.retornarTodosProdutos());
//        System.out.println(produtoDAO.retornarProdutoPeloNome("B"));
//        System.out.println(produtoDAO.retornarProdutoPelaDataCompra(new Date()));
//        System.out.println(produtoDAO.retornarProdutoPorEstoqueMinimo());
//        System.out.println(produtoDAO.retornarProdutoPeloId(2));
//        System.out.println(produtoDAO.retornarProdutoPelaValidade());
//    }
}
