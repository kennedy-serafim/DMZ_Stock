package com.dmz.stock.controller;

import com.dmz.stock.dao.AutenticadorDAO;

/**
 *
 * @author seraf
 */
public class AutenticadorController {

    private final AutenticadorDAO autenticadorDAO = new AutenticadorDAO();

    /**
     * 
     * @param username
     * @param password
     * @return 
     */
    public int autenticacao(String username, String password) {
        return autenticadorDAO.autenticacao(username, password);
    }
}
