package com.company.Atividades;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        double fatorFormulaHomem = 72.7;
        byte formulaFixaHomem = 58;
        double fatorFormulaMulher = 62.1;
        double formulaFixaMulher = 44.7;

        double pesoDeHomem = (fatorFormulaHomem * altura) - formulaFixaHomem;
        double pesoDeMulher = (fatorFormulaMulher * altura) - formulaFixaMulher;

        System.out.println("O seu peso ideal masculino é: " + pesoDeHomem );
        System.out.print("O seu peso ideal femimimo é " + pesoDeMulher );
        scanner.close();
    }
}
