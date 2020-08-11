package com.dmz.stock.model;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author seraf
 */
public class Categorias {

    public Categorias() {
        setCategorias();
    }

    private Set<String> categorias;

    public Set<String> getCategorias() {
        return categorias;
    }

    private void setCategorias() {
        this.categorias = new LinkedHashSet<>();
        categorias.add("Alimentos");
        categorias.add("Diversos");
    }

}
