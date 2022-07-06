package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.ExercicioComExcecoes;

public class DesafioNumeros {
    public static void main(String[] args) {
        ContaPagar contaPagar1 = new ContaPagar();
        try {
            contaPagar1.pagar();
        } catch (OperacaoContaException e) {
            System.out.print("Desculpe conta nao pode ser paga");
        }
    }
}
