package com.company.comecando;

import java.util.Scanner;

public class QualSeuNome {
     public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Qual Seu Nome");
         String nome = scanner.nextLine();
         System.out.print("Qual seu Sobrenome");
         String Sobrenome = scanner.nextLine();
         System.out.println("Quantos anos voce tem" );
         int anos = scanner.nextInt();
         System.out.print("Seu Nome Completo e idade e: " + nome + Sobrenome +" "+ anos );
     }
}
