package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.Cachorro;

public class PrincipalCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        DonoDoCachorro donoDoCachorro = new DonoDoCachorro();
        donoDoCachorro.ensinarCachorroSentar(cachorro);
    }
}
