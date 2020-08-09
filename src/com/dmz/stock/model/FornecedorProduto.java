/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmz.stock.model;

import java.util.List;

/**
 *
 * @author seraf
 */
public class FornecedorProduto {

    private Produto produto;
    private Fornecedor fornecedor;
    private List<FornecedorProduto> fornecedorProdutos;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<FornecedorProduto> getFornecedorProdutos() {
        return fornecedorProdutos;
    }

    public void setFornecedorProdutos(List<FornecedorProduto> fornecedorProdutos) {
        this.fornecedorProdutos = fornecedorProdutos;
    }

    @Override
    public String toString() {
        return "FornecedorProduto{" + "produto=" + produto + ", fornecedor=" + fornecedor + ", fornecedorProdutos=" + fornecedorProdutos + '}';
    }

}
