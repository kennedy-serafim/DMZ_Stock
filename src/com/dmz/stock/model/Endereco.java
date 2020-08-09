package com.dmz.stock.model;

/**
 *
 * @author seraf
 */
public class Endereco {

    private long id;
    private long cidade;
    private long bairro;
    private long numero;
    private long avenida;
    private long pais;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCidade() {
        return cidade;
    }

    public void setCidade(long cidade) {
        this.cidade = cidade;
    }

    public long getBairro() {
        return bairro;
    }

    public void setBairro(long bairro) {
        this.bairro = bairro;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getAvenida() {
        return avenida;
    }

    public void setAvenida(long avenida) {
        this.avenida = avenida;
    }

    public long getPais() {
        return pais;
    }

    public void setPais(long pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", cidade=" + cidade + ", bairro=" + bairro + ", numero=" + numero + ", avenida=" + avenida + ", pais=" + pais + '}';
    }

}
