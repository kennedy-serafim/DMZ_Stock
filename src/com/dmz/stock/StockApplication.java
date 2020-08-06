package com.dmz.stock;

import com.dmz.stock.auxiliar.UIManager;
import com.dmz.stock.view.Index;

/**
 *
 * @author Kennedy Melvin Serafim
 */
public class StockApplication {

    public static void main(String[] args) {
        UIManager.alterandoUIManager();
        new Index().setVisible(true);
    }
}
