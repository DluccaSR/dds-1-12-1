package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio;


import static com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio.SituacaoConta.*;
import static com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio.SituacaoConta.CANCELADA;

public class Conta {

    public Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String descricao;
    public Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    SituacaoConta situcaoConta;


    public SituacaoConta getSitucaoConta() {
        return situcaoConta;
    }

    public Conta() {
        this.situcaoConta = PENDENTE;
    }

    public Conta(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor, Cliente cliente) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void cancelar() {
        if (this.situcaoConta == PAGA || this.situcaoConta == CANCELADA){
            System.out.println("Voce não pode pagar uma conta já paga ou cancelada");
        }
        else {
            System.out.println("Conta " + getDescricao() + " cancelada");
        }
        this.situcaoConta = CANCELADA;
    }
    public void exibirListagem(Conta[] contas) {

    }

}
