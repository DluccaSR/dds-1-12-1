package com.company.Vetores;

import java.util.Scanner;

public class Exercicio01Refeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[5];
        for (int i = 0; 0 < tarefas.length; i++){
            System.out.println("tarefas " + i + ":");
            tarefas[i] = scanner.nextLine();
        }
    }
}
