package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Material;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTempertatura() + "°");
        ar.trocarTemperatura(10);
        System.out.println();
        System.out.println("Temperatura do ar: " + ar.obterTempertatura() + "°");
    }
}
