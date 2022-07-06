package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.tratando_e_lancando_excessoes;

import java.util.Locale;

public class TesteExcecoes {
    public static void main(String[] args) {

        String s = null;
        String maiuscula = s.toUpperCase();
    }
}

//        ContaCorrente cc = new ContaCorrente(100);
//
//        try{
//            cc.depositar(-10);
//        } catch(IllegalArgumentException e){
//            System.out.println("Você executou uma operação ilegal: " + e.getMessage());
//        }
//    }

