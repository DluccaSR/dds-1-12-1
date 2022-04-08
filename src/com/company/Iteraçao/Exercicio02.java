package com.company.Iteraçao;

public class Exercicio02 {
    final static Integer NUMERO_DIVISIVEL = 3;

    public static void main(String[] args) {
        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int i = 0;
        while (i < numeros.length) {
            double eDivisivel = i % NUMERO_DIVISIVEL;
            if (eDivisivel == 0) {
                System.out.println("O numero: " + i + " e divisivel por 3");
            }
            i++;
        }
    }
}
