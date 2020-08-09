package com.dmz.stock.model;

import java.util.Date;

/**
 *
 * @author seraf
 */
public class ProdutoEntrada {

    private int quantidade;
    private Date dataEntrada;
    private String observacao;
    private Usuario usuario;
    private int id;
    private Produto produto;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ProdutoEntrada{" + "quantidade=" + quantidade + ", dataEntrada=" + dataEntrada + ", observacao=" + observacao + ", usuario=" + usuario + ", id=" + id + ", produto=" + produto + '}';
    }

}
