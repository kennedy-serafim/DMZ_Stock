package com.dmz.stock.controller;

import com.dmz.stock.dao.FuncionarioDAO;
import com.dmz.stock.model.Funcionario;
import configuracoes.SystemMessage;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author seraf
 */
public class FuncionarioController {

    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public int criarFuncionario(Funcionario funcionario) {
        try {
            return funcionarioDAO.criarFuncionario(funcionario);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "A Data não está no formato correto", SystemMessage.SYSTEM_NAME, JOptionPane.WARNING_MESSAGE);
            return 0;
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public Funcionario pesquisarFuncionarioPorIDDAO(int id) {
        return funcionarioDAO.pesquisarFuncionarioPorIDDAO(id);
    }

    /**
     *
     * @return
     */
    public List<Funcionario> retornaTodosFuncionarios() {
        return funcionarioDAO.retornaTodosFuncionarios();
    }

    /**
     *
     * @param nomeFuncionario
     * @return
     */
    public List<Funcionario> retornarFuncionarioPeloNome(String nomeFuncionario) {
        return funcionarioDAO.retornarFuncionarioPeloNome(nomeFuncionario);
    }

    /**
     *
     * @param idFuncionario
     * @return
     */
    public int apagarFuncionario(int idFuncionario) {
        return funcionarioDAO.apagarFuncionario(idFuncionario);
    }

    /**
     *
     * @param nuit
     * @return
     */
    public boolean getFuncionarioByNuitDAO(String nuit) {
        return funcionarioDAO.getFuncionarioByNuitDAO(nuit);
    }

    /**
     *
     * @param bilheteI
     * @return
     */
    public boolean getFuncionarioByBilheteIdentidadeController(String bilheteI) {
        return funcionarioDAO.getFuncionarioByBilheteIdentidadeController(bilheteI);
    }
}
