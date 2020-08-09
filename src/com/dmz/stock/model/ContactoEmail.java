package com.dmz.stock.model;

/**
 *
 * @author seraf
 */
public class ContactoEmail {

    private String email;
    private long id;

    public ContactoEmail(String email) {
        this.email = email;
    }

    public ContactoEmail() {
    }

    public ContactoEmail(long id, String email) {
        this.email = email;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ContactoFuncionarioEmail{" + "email=" + email + ", id=" + id + '}';
    }

}
