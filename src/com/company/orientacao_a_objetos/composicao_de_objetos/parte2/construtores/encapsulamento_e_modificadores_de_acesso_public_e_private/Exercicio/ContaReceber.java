package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio;

import static com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio.SituacaoConta.*;
import static com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Exercicio.SituacaoConta.PAGA;

public class ContaReceber extends Conta{
    public ContaReceber() {
    }

    public ContaReceber(String descricao, Double valor, String dataDeVencimento, Cliente cliente){
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataDeVencimento);
        this.setCliente(cliente);
    }



    public void cancelar(){
        if (super.getValor() > 50000){
            System.out.println("Valor acima de R$50.000, impossivel cancelar");
        }
        else {
            System.out.println("Ação negada");
        }
    }



    public void receber() {
        if (this.getSitucaoConta() == CANCELADA){
            System.out.println("A Conta: " + getDescricao() + " ja foi cancelada, Impossivel pagar "+ getValor());
            return;
        }
        if (this.getSitucaoConta() == PAGA){
            System.out.println("A conta: " + getDescricao() + " ja foi paga, não e possivel paga-la novamente " + getValor());
            return;
        }
        this.situcaoConta = PENDENTE;
        System.out.println("Conta " + getDescricao() + " paga no valor de R$" + getValor() + "Data de vencimento em " + getDataVencimento() +
         " do fornecedor: "+ this.cliente.getNome());
        this.situcaoConta = PAGA;

    }

}
