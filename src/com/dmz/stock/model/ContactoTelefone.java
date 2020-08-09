package com.dmz.stock.model;

/**
 *
 * @author seraf
 */
public class ContactoTelefone {

    private long id;
    private String telefone;

    public ContactoTelefone() {
    }

    public ContactoTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ContactoTelefone(long id, String telefone) {
        this.id = id;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ContactoTelefone{" + "id=" + id + ", telefone=" + telefone + '}';
    }

}
