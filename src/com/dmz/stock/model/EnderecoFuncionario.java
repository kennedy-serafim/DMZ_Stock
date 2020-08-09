package com.dmz.stock.model;

import java.util.List;

/**
 *
 * @author seraf
 */
public class EnderecoFuncionario {

    private List<Endereco> endereco;
    private Funcionario funcionario;
    private List<EnderecoFuncionario> enderecoFuncionario;

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<EnderecoFuncionario> getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(List<EnderecoFuncionario> enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    @Override
    public String toString() {
        return "EnderecoFuncionario{" + "endereco=" + endereco + ", funcionario=" + funcionario + ", enderecoFuncionario=" + enderecoFuncionario + '}';
    }

}
