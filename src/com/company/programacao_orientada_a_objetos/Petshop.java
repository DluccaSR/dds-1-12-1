package com.company.programacao_orientada_a_objetos;

public class Petshop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setRaca("Pastor Alemao");
        cachorro.setIdade("12");
        cachorro.setSexo("Masculino");
        System.out.println("Raça: " + cachorro.getRaca() + "\nIdade :" + cachorro.idade + "\nsexo: " + cachorro.getSexo());
        System.out.println("\n");
        Cachorro cachorro2 = new Cachorro();
        cachorro2.setRaca("Rottweiler");
        cachorro2.setIdade("9");
        cachorro2.setSexo("Feminino");
        System.out.println("Raça: " + cachorro2.getRaca() + "\nIdade :" + cachorro2.idade + "\nsexo: " + cachorro2.getSexo());
    }
}
