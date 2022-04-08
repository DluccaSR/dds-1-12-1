package com.company.Iteraçao;

public class Exercicio01 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 } ;
        for (int i = 0; i < numeros.length; i++){
            double eDivisivelPorTres = i % 3;
            if (eDivisivelPorTres == 0){
                System.out.println("O numero: " + i + " e divisivel por tres" );
            }
        }
    }
}

