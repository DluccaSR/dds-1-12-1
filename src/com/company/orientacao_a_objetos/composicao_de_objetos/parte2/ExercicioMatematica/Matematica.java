package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.ExercicioMatematica;

import java.util.Scanner;

public class Matematica {
    public static final double PI = 3.14;
    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaCirculo(double raio){
        double raioAoQuadrado = raio * raio;
        Double areaDoCirculo = raioAoQuadrado * Matematica.PI;
        return areaDoCirculo;
    }
}
