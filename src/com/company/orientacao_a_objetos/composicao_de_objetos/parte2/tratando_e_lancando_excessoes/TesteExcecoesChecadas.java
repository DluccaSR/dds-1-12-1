package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.tratando_e_lancando_excessoes;

public class TesteExcecoesChecadas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);

        try{
            cc.sacar(60);
        } catch (SaldoInsuficienteException e){
            System.out.println("Desculpe, saldo insuficiente");
        }
        System.out.println("Saldo: R$" + cc.getSaldo());

        try {
            cc.sacar(50);
        } catch (SaldoInsuficienteException e){
            System.out.println("Desculpe, saldo insuficiente");
        }finally {
            System.out.println("Obrigado por ultilizar nosso sistema");
        }
    }
}
