package com.company.Vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira tarefa: ");
        String tarefa1 = scanner.nextLine();
        System.out.print("Digite sua segunda tarefa: ");
        String tarefa2 = scanner.nextLine();
        System.out.print("Digite sua terceira tarefa: ");
        String tarefa3 = scanner.nextLine();
        System.out.print("Digite sua quarta tarefa: ");
        String tarefa4 = scanner.nextLine();
        System.out.print("Digite sua quinta tarefa: ");
        String tarefa5 = scanner.nextLine();
        String[] tarefas = new String[]{tarefa1, tarefa2, tarefa3, tarefa4, tarefa5};
        Integer tarefass = null;
        for (int i = 0; i < tarefas.length; i++) {
            tarefass = i + 1;
            System.out.println("[" + tarefass + "]" + tarefas[i]);
        }
    }
}



