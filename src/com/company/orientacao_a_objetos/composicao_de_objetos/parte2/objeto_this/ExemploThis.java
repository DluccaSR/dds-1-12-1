package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.objeto_this;

public class ExemploThis {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";
        System.out.println("Modelo antes: " + carro.modelo);
        carro.alternarModelo("Civic");
    }
}
