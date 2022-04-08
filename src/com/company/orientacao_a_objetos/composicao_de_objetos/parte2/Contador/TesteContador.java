package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.Contador;

import com.company.Metodos.Recursividade;

public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        System.out.println(Contador.COUNT);
        Contador.COUNT++;
        Contador.imprimirContador();
    }
}
