package com.dmz.stock.controller;

import com.dmz.stock.dao.ContactoFornecedorDAO;
import com.dmz.stock.model.ContactoEmail;
import com.dmz.stock.model.ContactoTelefone;
import java.util.List;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public class ControllerContactoFornecedor {

    private final ContactoFornecedorDAO contactoFornecedorDAO = new ContactoFornecedorDAO();

    /**
     *
     * @param phones
     * @return
     */
    public boolean criarFornecedorListaTelefonicaController(List<ContactoTelefone> phones) {
        return contactoFornecedorDAO.criarFornecedorListaTelefonicaDAO(phones);
    }

    /**
     *
     * @param phone
     * @return
     */
    public static boolean verificarExistenciaTelefoneFornecedorController(String phone) {
        return ContactoFornecedorDAO.verificarExistenciaTelefoneFornecedorDAO(phone);
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public boolean atualizarFornecedorListaTelefonicaController(long idFornecedor) {
        return contactoFornecedorDAO.atualizarFornecedorListaTelefonicaDAO(idFornecedor);
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public static List<ContactoTelefone> retornarTodosContactosTelefonicosFornecedorController(long idFornecedor) {
        return ContactoFornecedorDAO.retornarTodosContactosTelefonicosFornecedorDAO(idFornecedor);
    }

    /**
     *
     * @param emails
     * @return
     */
    public boolean criarFornecedorListaElectronicaController(List<ContactoEmail> emails) {
        return contactoFornecedorDAO.criarFornecedorListaElectronicaDAO(emails);
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public boolean atualizarFornecedorListaElectronicaController(long idFornecedor) {
        return contactoFornecedorDAO.atualizarFornecedorListaElectronicaDAO(idFornecedor);
    }

    /**
     *
     * @param idFornecedor
     * @return
     */
    public static List<ContactoEmail> retornarTodosContactosElectronicosFornecedorController(long idFornecedor) {
        return ContactoFornecedorDAO.retornarTodosContactosElectronicosFornecedorDAO(idFornecedor);
    }

    /**
     *
     * @param email
     * @return
     */
    public static boolean verificarExistenciaEmailFornecedorController(String email) {
        return ContactoFornecedorDAO.verificarExistenciaEmailFornecedorDAO(email);
    }
}
