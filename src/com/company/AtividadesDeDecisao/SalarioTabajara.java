package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class SalarioTabajara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
        //  Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        // salários até R$ 280,00 (incluindo) : aumento de 20%
        //  salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        // salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        //   salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
        // o salário antes do reajuste;
        //  o percentual de aumento aplicado;
        // o valor do aumento;
        // o novo salário, após o aumento.

        System.out.print("Digite seu salario atual: ");
        float salario = scanner.nextFloat();
        int salarioAte280 = 280;
        int salarioDe700 = 700;
        int salarioDe1500ParaMais = 1500;

        if (salario <= salarioAte280) {
            double vintePorCento = 0.2;
            Double resultadoDoAumentoDeVintePorCento = salarioAte280 * vintePorCento;
            double salarioReajustado = resultadoDoAumentoDeVintePorCento + salario;
            System.out.println("Antes do reajuste o salario era de: " + salario);
            System.out.println("O aumento foi de 20%");
            System.out.println("O valor do aumento foi de: " + resultadoDoAumentoDeVintePorCento);
            System.out.println("O salario novo foi de: " + salarioReajustado);
        } else if ( salario >= salarioAte280 && salario <= salarioDe700) {
            double quinzePorCento = 0.15;
            double resultadoDoAumentoDeQuizePorCento = salario * quinzePorCento;
            double salarioReajustado = resultadoDoAumentoDeQuizePorCento + salario;
            System.out.println("Antes do reajuste o salario era de: " + salario);
            System.out.println("O aumento foi de 15%");
            System.out.println("O valor do aumento foi de: " + resultadoDoAumentoDeQuizePorCento);
            System.out.println("O salario novo foi de: " + salarioReajustado);
        }else if (salario >= salarioDe700 && salario <= salarioDe1500ParaMais) {
            double dezPorCento = 0.1;
            double resultadoDoAumentoDeDezPorCento = salario * dezPorCento;
            double salarioReajustado = salario + resultadoDoAumentoDeDezPorCento;
            System.out.println("Antes do reajuste o salario era de: " + salario);
            System.out.println("O aumento foi de 10%");
            System.out.println("O valor do aumento foi de: " + resultadoDoAumentoDeDezPorCento);
            System.out.println("O salario novo foi de: " + salarioReajustado);
        }else if ( salario >= salarioDe1500ParaMais) {
                double cincoPorCento = 0.05;
                double resultadoDoAumentoDeCincoPorCento = salario * cincoPorCento;
                double salarioReajustado = salario + resultadoDoAumentoDeCincoPorCento;
                System.out.println("Antes do reajuste o salario era de: " + salario);
                System.out.println("O aumento foi de 5%");
                System.out.println("O valor do aumento foi de: " + resultadoDoAumentoDeCincoPorCento);
                System.out.println("O salario novo foi de: " + salarioReajustado);
        }
    }
}
