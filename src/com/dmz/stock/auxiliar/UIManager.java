package com.dmz.stock.auxiliar;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author seraf
 */
public class UIManager {

    /**
     * Faz alteracao da interface grafica do sistema
     */
    public static void alterandoUIManager() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    javax.swing.UIManager.put("OptionPane.messageFont",
                            new FontUIResource(new Font("Trebuchet MS", Font.PLAIN, 16)));
                    javax.swing.UIManager.put("OptionPane.messageForeground", new Color(0, 15, 20));
                    javax.swing.UIManager.put("nimbusBase", new Color(230, 230, 230));
                    break;
                }

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            System.err.println(">>Erro na class  UIManager\n"
                    + ">> " + UIManager.class);
        }

    }
}
