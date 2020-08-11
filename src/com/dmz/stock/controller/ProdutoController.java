package com.dmz.stock.controller;

import com.dmz.stock.dao.ProdutoDAO;
import com.dmz.stock.model.Produto;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author seraf
 */
public class ProdutoController {

    private final ProdutoDAO produtoDAO = new ProdutoDAO();

    /**
     *
     * @param produto
     * @return
     */
    public int registarProduto(Produto produto) {
        try {
            return produtoDAO.registarProduto(produto);
        } catch (ParseException ex) {
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public List<Produto> retornarTodosProdutos() {
        return produtoDAO.retornarTodosProdutos();
    }

    /**
     *
     * @param codigoBarras
     * @return
     */
    public Produto retornarProdutoPeloCodigoBarras(String codigoBarras) {
        return produtoDAO.retornarProdutoPeloCodigoBarras(codigoBarras);
    }

    /**
     *
     * @param idProduto
     * @return
     */
    public List<Produto> retornarProdutosPeloId(int idProduto) {
        return produtoDAO.retornarProdutosPeloId(idProduto);
    }

    /**
     *
     * @param codigoBarras
     * @return
     */
    public List<Produto> retornarProdutosPeloCodigoBarras(String codigoBarras) {
        return produtoDAO.retornarProdutosPeloCodigoBarras(codigoBarras);
    }

    /**
     *
     * @param nomeProduto
     * @return
     */
    public List<Produto> retornarProdutoPeloNome(String nomeProduto) {
        return produtoDAO.retornarProdutoPeloNome(nomeProduto);
    }

    /**
     *
     * @param dataEntrada
     * @return
     */
    public List<Produto> retornarProdutoPelaDataEntrada(Date dataEntrada) {
        try {
            return produtoDAO.retornarProdutoPelaDataEntrada(dataEntrada);
        } catch (ParseException ex) {
            return null;
        }
    }

    /**
     *
     * @param dataCompra
     * @return
     */
    public List<Produto> retornarProdutoPelaDataCompra(Date dataCompra) {
        try {
            return produtoDAO.retornarProdutoPelaDataCompra(dataCompra);
        } catch (ParseException ex) {
            return null;
        }
    }

    /**
     *
     * @param quantidade
     * @return
     */
    public List<Produto> retornarProdutoPelaQuantidade(int quantidade) {
        return produtoDAO.retornarProdutoPelaQuantidade(quantidade);
    }

    /**
     *
     * @return
     */
    public List<Produto> retornarProdutoPorEstoqueMinimo() {
        return produtoDAO.retornarProdutoPorEstoqueMinimo();
    }

    /**
     *
     * @param mes
     * @return
     */
    public List<Produto> retornarProdutoPeloMesEntrada(int mes) {
        return produtoDAO.retornarProdutoPeloMesEntrada(mes);
    }

    /**
     *
     * @param mes
     * @return
     */
    public List<Produto> retornarProdutoPeloMesCompra(int mes) {
        return produtoDAO.retornarProdutoPeloMesCompra(mes);
    }

    /**
     *
     * @return
     */
    public List<Produto> retornarProdutoPelaValidade() {
        return produtoDAO.retornarProdutoPelaValidade();
    }

    /**
     *
     * @param idProduto
     * @return
     */
    public Produto retornarProdutoPeloId(int idProduto) {
        return produtoDAO.retornarProdutoPeloId(idProduto);
    }
}
