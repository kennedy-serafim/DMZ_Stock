package com.dmz.stock.auxiliar;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Kennedy
 */
public final class ConversorValores {

    /**
     * Converte uma virgula para ponto
     *
     * @param pString
     * @return String
     */
    public static String converterVirgulaParaPonto(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    /**
     * Remove ponto
     *
     * @param pString
     * @return String
     */
    public static String removerPontos(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == '.') {
                retorno += "";
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    /**
     * Remove Virgula
     *
     * @param pString
     * @return String
     */
    public static String removerVirgula(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == ',') {
                retorno += "";
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    /**
     * adiciona um ponto a string
     *
     * @param pString
     * @return String
     */
    public static String addPonto(String pString) {
        int pontoConter = 0;
        for (int i = 0; i < pString.length(); i++) {
            if (pString.charAt(i) == '.') {
                pontoConter++;
            }
        }
        if (pontoConter == 0) {
            pString += ".0";
        }
        return pString;
    }

    /**
     * Retorna um valor arredondado com 2 casas decimais por excesso
     *
     * @param pValor
     * @return double
     */
    public static double truncar3Casas(double pValor) {

        return Math.round(pValor * 100) / 100d;
    }

    /**
     * Arredonda com 2 casas decimais com virgula.
     *
     * @param pDouble
     * @return
     */
    public static double converteArredondar2Casas(double pDouble) {
        DecimalFormat df = new DecimalFormat("##,000");
        pDouble = Double.parseDouble(df.format(pDouble));
        return pDouble;
    }

    /**
     * Arredonda com 2 casas decimais com ponto
     *
     * @param pValor
     * @return double
     */
    public static Double arredondamentoComPontoDuasCasas(double pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        try {
            return Double.parseDouble(ConversorValores.converterVirgulaParaPonto(df.format(pValor)));

        } catch (NumberFormatException e) {
            return 0D;
        }

    }

    /**
     * arredonda um valor com ponto
     *
     * @param pValor
     * @return
     */
    public float arredondamentoComPontoTresCasas(float pValor) {
        DecimalFormat df = new DecimalFormat("#.000");
        return Float.parseFloat(ConversorValores.converterVirgulaParaPonto(df.format(pValor)));
    }

    /**
     *
     * @param pValor
     * @return String
     */
    public static String currencyMozambique(double pValor) {
        Locale locale = new Locale("MZ", "mz");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        return numberFormat.format(pValor);

    }

}
