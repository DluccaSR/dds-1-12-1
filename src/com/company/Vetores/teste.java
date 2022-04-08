package com.company.Vetores;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = new String[] {" ", "zero", "um", "dois", "tres"};
        for (int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "]" + vetor[i]);
        }
        System.out.println("Escolha um numero: ");
        int posicaoNumeroEscolida = scanner.nextInt();
        String numeroEscolido = vetor[posicaoNumeroEscolida];
        System.out.println("Numero foi: " + numeroEscolido);
    }
}
