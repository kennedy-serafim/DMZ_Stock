package com.dmz.stock.model;

import java.util.Date;

/**
 *
 * @author seraf
 */
public class Funcionario {

    private int id;
    private String nome;
    private String apelido;
    private String outroNome;
    private String genero;
    private String bIdentidade;
    private String nuit;
    private String nacionalidade;
    private Date nascimento;
    private Date createdAt;

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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getOutroNome() {
        return outroNome;
    }

    public void setOutroNome(String outroNome) {
        this.outroNome = outroNome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getbIdentidade() {
        return bIdentidade;
    }

    public void setbIdentidade(String bIdentidade) {
        this.bIdentidade = bIdentidade;
    }

    public String getNuit() {
        return nuit;
    }

    public void setNuit(String nuit) {
        this.nuit = nuit;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", outroNome=" + outroNome + ", genero=" + genero + ", bIdentidade=" + bIdentidade + ", nuit=" + nuit + ", nacionalidade=" + nacionalidade + ", nascimento=" + nascimento + ", createdAt=" + createdAt + '}';
    }

}
