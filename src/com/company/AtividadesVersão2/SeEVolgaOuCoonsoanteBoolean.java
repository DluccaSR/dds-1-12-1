package com.company.AtividadesVersão2;

import java.util.Objects;
import java.util.Scanner;

public class SeEVolgaOuCoonsoanteBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine();
        Boolean sualetraA = letra.equals("a");
        Boolean sualetraE = letra.equals("e");
        Boolean sualetraI = letra.equals("i");
        Boolean sualetraO = letra.equals("o");
        Boolean sualetraU = letra.equals("u");
        if (sualetraA) {
            System.out.print("Sua letra e vogal");
        }else if (sualetraE) {
            System.out.print("Sua letra e vogal");
        } else if (sualetraI) {
            System.out.print("Sua letra e vogal");
        }else if (sualetraO) {
            System.out.print("Sua letra e vogal");
        }else if (sualetraU) {
            System.out.print("Sua letra e vogal");
        }else{
            System.out.print("Sua letra e consoante");
        }
    }
}

