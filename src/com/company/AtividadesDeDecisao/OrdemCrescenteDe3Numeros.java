package com.company.AtividadesDeDecisao;

import java.util.Scanner;

public class OrdemCrescenteDe3Numeros {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe um número: ");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("Informe outro número: ");
            double segundoNumero = scanner.nextDouble();
            System.out.print("Informe mais um número: ");
            double terceiroNumero = scanner.nextDouble();
            if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero && segundoNumero < terceiroNumero) {
                System.out.println("Os números informados em ordem decrescente são: "  + terceiroNumero + "\n " + segundoNumero + "\n" + primeiroNumero);
            }else if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero){
                System.out.println("Os números informados em ordem decrescente são: " + primeiroNumero + "\n " + segundoNumero + "\n" + terceiroNumero);
            }else if(segundoNumero < terceiroNumero && primeiroNumero > terceiroNumero){
                System.out.println("Os números informados em ordem decrescente são: " + primeiroNumero + "\n " + terceiroNumero + "\n" + segundoNumero);
            }else if(segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero){
                System.out.println("Os números informados em ordem decrescente são: " + segundoNumero + "\n " + terceiroNumero + "\n" + primeiroNumero);
            }else if(terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero && primeiroNumero < segundoNumero){
                System.out.println("Os números informados em ordem decrescente são:  " + segundoNumero + "\n " + primeiroNumero + "\n" + terceiroNumero);
            }else{
                System.out.println("Os números informados em ordem decrescente são: " + terceiroNumero + "\n " + primeiroNumero + "\n " + segundoNumero);
        }
        scanner.close();
    }
}
