package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.topicos_avançados_classe_java_lang_math;

import static java.lang.Math.*;


public class TesteClasseMath {
    public static void main(String[] args) {
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);

        double[] precosProdutoA = {30.20, 25.49};
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + min(precosProdutoA[0], precosProdutoA[1]));

        System.out.println("2^3: " + pow(2,3));

        System.out.println("Raiz de 9: " + sqrt(9));

        double n = 5.4;

        System.out.println("Menor inteiro: " + floor(n));
        System.out.println("Maior inteiro: " + ceil(n));
        System.out.println("Arrendodado: " + round(n));

        System.out.println("Seno: " + sin(40));

        double numeroAleatorio = random() * 100;
        System.out.println("Aleatorio: " +numeroAleatorio);
    }
}
