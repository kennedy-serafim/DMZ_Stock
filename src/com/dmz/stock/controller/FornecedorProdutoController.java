package com.dmz.stock.controller;

import com.dmz.stock.dao.FornecedorProdutoDAO;
import com.dmz.stock.model.Fornecedor;
import com.dmz.stock.model.Produto;
import java.util.List;

/**
 *
 * @author seraf
 */
public class FornecedorProdutoController {

    private final FornecedorProdutoDAO fornecedorProdutoDAO = new FornecedorProdutoDAO();

    /**
     *
     * @param idFornecedor
     * @param idProduto
     * @return
     */
    public int criarFornecedorProduto(int idFornecedor, int idProduto) {
        return fornecedorProdutoDAO.criarFornecedorProduto(idFornecedor, idProduto);
    }

    /**
     *
     * @param idProduto
     * @return
     */
    public Fornecedor retornarFornecedorPorProduto(int idProduto) {
        return fornecedorProdutoDAO.retornarFornecedorPorProduto(idProduto);
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public List<Produto> retornarProdutosPorFornecedorId(int idFornecedor) {
        return fornecedorProdutoDAO.retornarProdutosPorFornecedorId(idFornecedor);
    }

}
