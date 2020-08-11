package com.dmz.stock.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author seraf
 */
public class Produto {

    private int id;
    private String codigoBarras;
    private String nome;
    private String descricao;
    private String categoria;
    private int quantidade;
    private int quantidadePorCaixa;
    private int quantidadeMinima;
    private Date dataValidade;
    private Date dataEntrada;
    private Date dataCompra;
    private BigDecimal valorTotal;
    private BigDecimal valorPorUnidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
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

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(BigDecimal valorPorUnidade) {
        this.valorPorUnidade = valorPorUnidade;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", codigoBarras=" + codigoBarras + ", nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", quantidade=" + quantidade + ", quantidadePorCaixa=" + quantidadePorCaixa + ", quantidadeMinima=" + quantidadeMinima + ", dataValidade=" + dataValidade + ", dataEntrada=" + dataEntrada + ", dataCompra=" + dataCompra + ", valorTotal=" + valorTotal + ", valorPorUnidade=" + valorPorUnidade + '}';
    }

}
