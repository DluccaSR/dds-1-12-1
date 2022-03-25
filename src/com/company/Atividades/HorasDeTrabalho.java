package com.company.Atividades;

import java.util.Scanner;

public class HorasDeTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas horas você trabalha: ");
        double horasDeTrabalho = scanner.nextDouble();
        System.out.print("Digite quantos voce recebe por hora: ");
        double salarioPorHora = scanner.nextDouble();

        double salario = horasDeTrabalho * salarioPorHora;
        System.out.print("Seu salario é: " + salario );
        scanner.close();
    }


 }

