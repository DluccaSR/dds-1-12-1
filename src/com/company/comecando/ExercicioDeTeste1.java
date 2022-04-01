package com.company.comecando;

import java.util.Scanner;

public class ExercicioDeTeste1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota ");
        double nota = scanner.nextDouble();

        if (nota >= 70) {
            System.out.print("Parabens, voce passou de ano!");
        }

        else {
            System.out.print("Nao foi dessa vez tente novamente ano que vem, voce ficou reprovado");
        }
    }
}
