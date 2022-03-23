package com.company.Atividades;

import java.util.Scanner;

public class MetrosParaCm {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite os metros: ");
            double centimetros = scanner.nextDouble();
            int multiplicador = 100;
            Double CM = centimetros * multiplicador;
            System.out.print("Seu numero e: " + CM);
        }
}
