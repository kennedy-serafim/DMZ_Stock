package com.dmz.stock.model;

/**
 *
 * @author seraf
 */
public class UsuarioSessao {

    private static long idFuncionario;
    private static String nomeFuncionario;
    private static String apelidoFuncionario;

    private static String password;
    private static String login;
    private static String tipoUsuario;

    public static long getIdFuncionario() {
        return idFuncionario;
    }

    public static void setIdFuncionario(long idFuncionario) {
        UsuarioSessao.idFuncionario = idFuncionario;
    }

    public static String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public static void setNomeFuncionario(String nomeFuncionario) {
        UsuarioSessao.nomeFuncionario = nomeFuncionario;
    }

    public static String getApelidoFuncionario() {
        return apelidoFuncionario;
    }

    public static void setApelidoFuncionario(String apelidoFuncionario) {
        UsuarioSessao.apelidoFuncionario = apelidoFuncionario;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UsuarioSessao.password = password;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UsuarioSessao.login = login;
    }

    public static String getTipoUsuario() {
        return tipoUsuario;
    }

    public static void setTipoUsuario(String tipoUsuario) {
        UsuarioSessao.tipoUsuario = tipoUsuario;
    }

}
