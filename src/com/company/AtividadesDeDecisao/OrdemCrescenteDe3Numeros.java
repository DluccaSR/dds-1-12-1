package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class OrdemCrescenteDe3Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite seu segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite seu terceiro numero: ");
        double numero3 = scanner.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("A ordem é: " + numero1 + "\n" + numero2 + "\n" + numero3 );
        }
        scanner.close();
    }
}
