package com.dmz.stock.auxiliar;

import configuracoes.SystemMessage;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author seraf
 */
public class GeradorPassword {

    /**
     *
     * @param password
     * @return
     */
    public static final String encrypt(String password) {
        //SHA-256
        //MD5
        try {

            //Escolhendo o tipo de hash
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            //Configurando o caracter
            byte messageDigestPassword[] = messageDigest.digest(password.getBytes("UTF-8"));

            StringBuilder hexaPass = new StringBuilder();

            //Convertendento para hexadecimal
            //Usou-se a mascara para evitar números negativos 
            for (byte b : messageDigestPassword) {
                hexaPass.append(String.format("%02X", 0xFF & b));
            }

            return hexaPass.toString();

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            System.err.println(ex.getMessage());
        }

        return password;
    }
}
