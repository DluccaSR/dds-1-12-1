package com.company.AtividadesVersão2;

import java.util.Scanner;

public class ExercicioPesoIdealRefeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu sexo [1 para Homem] / [2 para Mulher]");
        Integer seuSexo = scanner.nextInt();

        if (seuSexo.equals(1)) {
            double fatorFormulaHomem = 72.7;
            double formulaFixaHomem = 58;
            double pesoDeHomem = (fatorFormulaHomem * altura) - formulaFixaHomem;
            System.out.print("Seu peso ideal é: " + pesoDeHomem );
            }
        else {
            double fatorFomulaMulher = 62.1;
            double formulaFixaMulher = 44.7;
            double pesoMulher = (fatorFomulaMulher * altura) - formulaFixaMulher;
            System.out.print("Seu peso ideal é: " + pesoMulher );
        }
    }
}
