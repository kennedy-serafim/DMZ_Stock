package com.dmz.stock.controller;

import com.dmz.stock.dao.FornecedorDAO;
import com.dmz.stock.model.Fornecedor;
import java.util.List;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public class FornecedorController {

    private final FornecedorDAO fornecedorDAO = new FornecedorDAO();

    /**
     *
     * @param fornecedor
     * @return
     */
    public long criarFornecedorController(Fornecedor fornecedor) {
        return fornecedorDAO.criarFornecedorDAO(fornecedor);
    }

    /**
     *
     * @param fornecedor
     * @return
     */
    public int atualizarDadosFornecedorController(Fornecedor fornecedor) {
        return fornecedorDAO.atualizarDadosFornecedorDAO(fornecedor);
    }

    /**
     *
     * @return
     */
    public static List<Fornecedor> retornarTodosFornecedoresController() {
        return FornecedorDAO.retornarTodosFornecedoresDAO();
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public static Fornecedor retornarFornecedoresPorIdController(long idFornecedor) {
        return FornecedorDAO.retornarFornecedoresPorIdDAO(idFornecedor);
    }

    /**
     *
     * @param nome
     * @return
     */
    public static List<Fornecedor> retornarTodosFornecedoresNomeController(String nome) {
        return FornecedorDAO.retornarTodosFornecedoresNomeDAO(nome);
    }

    /**
     *
     * @param nome
     * @return
     */
    public static Fornecedor retornarTodosFornecedoresPorNomeController(String nome) {
        return FornecedorDAO.retornarTodosFornecedoresPorNomeDAO(nome);
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public int apagarRegisto(int idFornecedor) {
        return fornecedorDAO.apagarRegisto(idFornecedor);
    }

    /**
     *
     * @param nuit
     * @return
     */
    public static boolean verificarNuitController(String nuit) {
        return FornecedorDAO.verificarNuitDAO(nuit);
    }
}
