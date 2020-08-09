package com.dmz.stock.model;

/**
 *
 * @author seraf
 */
public class Fornecedor {

    private long idFornecedor;
    private String nomeFornecedor;
    private String cidadeFornecedor;
    private String ruaFornecedor;
    private String avenidaFornecedor;
    private int numero;
    private String tipoProduto;
    private String NUIT;
    private String pais;

    public long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        this.cidadeFornecedor = cidadeFornecedor;
    }

    public String getRuaFornecedor() {
        return ruaFornecedor;
    }

    public void setRuaFornecedor(String ruaFornecedor) {
        this.ruaFornecedor = ruaFornecedor;
    }

    public String getAvenidaFornecedor() {
        return avenidaFornecedor;
    }

    public void setAvenidaFornecedor(String avenidaFornecedor) {
        this.avenidaFornecedor = avenidaFornecedor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getNUIT() {
        return NUIT;
    }

    public void setNUIT(String NUIT) {
        this.NUIT = NUIT;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "idFornecedor=" + idFornecedor + ", nomeFornecedor=" + nomeFornecedor + ", cidadeFornecedor=" + cidadeFornecedor + ", ruaFornecedor=" + ruaFornecedor + ", avenidaFornecedor=" + avenidaFornecedor + ", numero=" + numero + ", tipoProduto=" + tipoProduto + ", NUIT=" + NUIT + ", pais=" + pais + '}';
    }

}
