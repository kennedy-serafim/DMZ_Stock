package com.dmz.stock.auxiliar;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public abstract class AuxiliarClass {

    /**
     *
     * @param container
     */
    public static void limparCampos(Container container) {

        for (Component component : container.getComponents()) {
            //Limpando os campos de texto [TextField,TextArea]

            if (component instanceof JTextComponent) {
                ((JTextComponent) component).setText(null);

            } else if (component instanceof JDateChooser) {
                //Limpando os Campos de Data (JDataChooser

                ((JDateChooser) (component)).setDate(new Date());

            } else if (component instanceof JComboBox) {
                //Limpando os Campos de selecao comboBox
                try {
                    ((JComboBox) component).setSelectedIndex(0);
                } catch (IllegalArgumentException e) {
                }

            } else if (component instanceof JRadioButton) {
                ((JRadioButton) component).setSelected(false);

            } else if (component instanceof JCheckBox) {
                ((JCheckBox) component).setSelected(false);

            } else if (component instanceof JList) {
                ((JList) component).setModel(new DefaultListModel<>());

            } else if (component instanceof Container) {
                limparCampos((Container) component);
            }
        }
    }

    /**
     * 
     * @param container o JPanel que está contido os campos
     */
    public static void formatarTextFieldAoSalvar(Container container) {

        for (Component component : container.getComponents()) {

            if (component instanceof JTextComponent) {
                ((JTextComponent) component).setText(Expressoes.primeiraLetraToUpperCase(((JTextComponent) component).getText()).trim());

            } else if (component instanceof Container) {
                formatarTextFieldAoSalvar((Container) component);
            }
        }
    }
}
