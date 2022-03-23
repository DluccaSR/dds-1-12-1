package com.company.comecando;

import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu numero");
        double num = scanner.nextDouble();
        System.out.print("Digite Seu dividendo");
        double div = scanner.nextDouble();
        double resultado = num / div;
        System.out.println("Seu numero e: " + resultado);
    }
}
