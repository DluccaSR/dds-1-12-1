package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class MaiorNumeroEntreTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite seu segundo numero: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite seu terceiro numero: ");
        double numero3 = scanner.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.print("Seu numero é: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.print("Seu numero é: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.print("Seu numero é: " + numero3 );
        }
    }
}
