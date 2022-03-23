
package com.company.variaveis_e_constantes;

import java.util.Scanner;

public class Nota {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa " + variavelFalsa);

        System.out.println("Digite sua nota: ");

        Double nota = scanner.nextDouble();


        Boolean podePassarDeAno = nota >= 70;

        if (podePassarDeAno) {
            System.out.println("Sim! Ele(a) vai passar de ano.");
        } else {
            System.out.println("Nao! Ele(a) nao vai passar de ano.");
        }
    }
}
