package com.company.AtividadesDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class SeEVogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine();
        if (Objects.equals(letra, "A")) {
            System.out.print(letra + "\nE uma letra vogal");
        } else if (Objects.equals(letra, "E")) {
            System.out.print(letra + "\nE uma vogal ");
        } else if (Objects.equals(letra, "I")) {
            System.out.print(letra + "\nE uma vogal");
        } else if (Objects.equals(letra, "O")) {
            System.out.print(letra + "\nE uma vogal");
        } else if (Objects.equals(letra, "U")) {
            System.out.print(letra + "\nE uma vogal ");
        } else {
            System.out.print(" E uma consoante");
        }
        scanner.close();
    }
}
