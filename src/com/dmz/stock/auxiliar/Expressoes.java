package com.dmz.stock.auxiliar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public class Expressoes extends PlainDocument {

    /**
     * ================= Email Validation==================
     *
     * @param email
     * @return
     */
    public static boolean validarEmail(String email) {
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,3}$");
        Matcher m = p.matcher(email.trim());

        return m.find();
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if ((Character.isLetter(str.charAt(0)) || str.equals(" "))) {
            super.insertString(offs, str.toUpperCase(), a);
        }
    }

    /**
     *
     * @param str
     * @return
     */
    public static String primeiraLetraToUpperCase(String str) {

        String[] words = str.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        try {

            for (String word : words) {
                stringBuilder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
                stringBuilder.append(" ");
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return stringBuilder.toString();
    }

    /**
     * Permite números e Letras
     *
     * @author Kennedy Melvin Serafim
     */
    public static class InternalClass extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (Character.isDigit(str.charAt(0)) || Character.isLetter(str.charAt(0))) {
                super.insertString(offs, str.toUpperCase(), a);
            }
        }
    }

    /**
     * Não permite letras no campo de Valores
     */
    public static class InternalClassCurrency extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            //Todos os caracters validos
            Character chs[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ','};

            Set<Object> validos = new HashSet<>(Arrays.asList(chs));
            char[] chars = str.toUpperCase().toCharArray();
            StringBuilder inserted = new StringBuilder();

            for (char ch : chars) {
                if (validos.contains(ch)) {//Filtramos só o que é válido
                    inserted.append(ch);
                }
            }
            super.insertString(offs, inserted.toString(), a);
        }
    }

    /**
     * Não permite a inserir espaço nem caracter especial no campo de texto
     * Exemplo: Apelido
     *
     * @author Kennedy Melvin Serafim
     */
    public static class InternalWords extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (Character.isLetter(str.charAt(0))) {
                super.insertString(offs, str.toUpperCase(), a);
            }
        }
    }

    /**
     * Não permite a inserção de espaço no campo de E-mail
     *
     * @author Administrator
     */
    public static class InternalClassEmail extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (!Character.isWhitespace(str.charAt(0))) {
                super.insertString(offs, str.toUpperCase(), a);
            }
        }
    }

    /**
     * Só permite Número aos campos
     *
     * @author Kennedy Melvin Serafim
     */
    public static class InternalClassDigit extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (Character.isDigit(str.charAt(0))) {
                super.insertString(offs, str.toUpperCase(), a);
            }
        }

    }

    public static class InternalClassToUpperCase extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            super.insertString(offs, str.toUpperCase(), a);
        }

    }

}
