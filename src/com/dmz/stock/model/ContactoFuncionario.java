package com.dmz.stock.model;

import java.util.List;

/**
 *
 * @author seraf
 */
public class ContactoFuncionario {

    private List<ContactoEmail> contactoEmail;
    private List<ContactoTelefone> contactoTelefone;
    private Funcionario funcionario;
    private List<ContactoFuncionario> contactoFuncionario;

    public List<ContactoEmail> getContactoEmail() {
        return contactoEmail;
    }

    public void setContactoEmail(List<ContactoEmail> contactoEmail) {
        this.contactoEmail = contactoEmail;
    }

    public List<ContactoTelefone> getContactoTelefone() {
        return contactoTelefone;
    }

    public void setContactoTelefone(List<ContactoTelefone> contactoTelefone) {
        this.contactoTelefone = contactoTelefone;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<ContactoFuncionario> getContactoFuncionario() {
        return contactoFuncionario;
    }

    public void setContactoFuncionario(List<ContactoFuncionario> contactoFuncionario) {
        this.contactoFuncionario = contactoFuncionario;
    }

    @Override
    public String toString() {
        return "ContactoFuncionario{" + "contactoEmail=" + contactoEmail + ", contactoTelefone=" + contactoTelefone + ", funcionario=" + funcionario + ", contactoFuncionario=" + contactoFuncionario + '}';
    }

}
