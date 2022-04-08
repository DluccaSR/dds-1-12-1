package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio;

import static com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio.SituacaoConta.*;

public class ContaPagar extends Conta {

     private String descricao;
     private Double valor;
     private String dataVencimento;
     private Fornecedor fornecedor;
     private SituacaoConta situcaoConta;


    public SituacaoConta getSitucaoConta() {
        return situcaoConta;
    }

    public ContaPagar() {
        this.situcaoConta = PENDENTE;
    }

    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {

        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    void pagar() {
        if (this.situcaoConta == CANCELADA){
            System.out.println("A Conta: " + getDescricao() + " ja foi cancelada, Impossivel pagar "+ getValor());
            return;
        }
        if (this.situcaoConta == PAGA){
            System.out.println("A conta: " + getDescricao() + " ja foi paga, não e possivel paga-la novamente " + getValor());
            return;
        }
        this.situcaoConta = PENDENTE;
        System.out.println("Conta " + getDescricao() + " paga no valor de R$" + getValor() + "Data de vencimento em " + getDataVencimento()
        + " do fornecedor " + fornecedor.getNome());
        this.situcaoConta = PAGA;
    }

    public void cancelar() {
        if (this.situcaoConta == PAGA || this.situcaoConta == CANCELADA){
            System.out.println("Voce não pode pagar uma conta já paga ou cancelada " + getValor());
        }
        else {
            System.out.println("Conta " + getDescricao() + " cancelada");
        }
        this.situcaoConta = CANCELADA;
    }
    public void exibirListagem(){

    }

}






