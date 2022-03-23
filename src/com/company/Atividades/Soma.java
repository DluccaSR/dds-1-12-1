package com.company.Atividades;

import java.util.Scanner;

public class Soma {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu primeiro numero :");
            Integer numero1 = scanner.nextInt();
            System.out.println("Digite seu segundo numero :");
            Integer numero2 = scanner.nextInt();
            Integer resultado = numero1 + numero2;
            System.out.println("seu numero e: " + resultado );


        }

}
