package com.dmz.stock.model;

import java.util.Date;

/**
 *
 * @author seraf
 */
public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private String categoria;
    private int quantidade;
    private int quantidadePorCaixa;
    private Date dataValidade;
    private Date dataEntrada;
    private double valorTotal;
    private double valorPorUnidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadePorCaixa() {
        return quantidadePorCaixa;
    }

    public void setQuantidadePorCaixa(int quantidadePorCaixa) {
        this.quantidadePorCaixa = quantidadePorCaixa;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(double valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", quantidade=" + quantidade + ", quantidadePorCaixa=" + quantidadePorCaixa + ", dataValidade=" + dataValidade + ", dataEntrada=" + dataEntrada + ", valorTotal=" + valorTotal + ", valorPorUnidade=" + valorPorUnidade + '}';
    }

}
