package com.company.comecando;

import java.util.Scanner;

public class Febre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua temperatura: ");
        float temperatura = scanner.nextFloat();
        double hiportemia = 35;
        double febre = 37.8;
        double febreAlta = 39;
        boolean voceEstaComHiportemia = temperatura < hiportemia;
        boolean voceEstaComFebre = temperatura > febre && temperatura < febreAlta;
        boolean voceEstaComFebreAlta = temperatura > febreAlta;
        if (voceEstaComFebre) {
            System.out.print("Voce esta com febre");
        } else if (voceEstaComFebreAlta) {
            System.out.print("Corra para o hospital, voce esta pegando fogo de febre alta");
        } else if (voceEstaComHiportemia){
            System.out.print("Voce esta com hiportemia, vá se esquentar");
        }
        scanner.close();
    }
}
