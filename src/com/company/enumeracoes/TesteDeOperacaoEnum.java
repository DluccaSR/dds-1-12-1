package com.company.enumeracoes;

public class TesteDeOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
        int resultado1 = o1.operacao(5, 3);
        System.out.println("O resultado é: " + resultado1);
        OperacaoAritimetica o2 = OperacaoAritimetica.SUBTRACAO;
        int resultado2 = o2.operacao(5,3);
    }
}
