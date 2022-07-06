package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.tratando_e_lancando_excessoes;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    public void depositar (double depososito){
        if (depososito <= 0){
            throw  new IllegalArgumentException("O valor não pode ser menos que zero.");
        }
        saldo += depososito;
    }

    public void sacar(double quantidade) throws SaldoInsuficienteException{
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0){
            throw  new SaldoInsuficienteException("Você não possui saldo suficiente");
        }
        saldo -= quantidade;
    }

    public double getSaldo(){
        return saldo;
    }

}
