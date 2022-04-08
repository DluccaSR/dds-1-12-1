package com.company.orientacao_a_objetos.composicao_de_objetos.sobreposicao.sobrecarga.exercicio;

public class MaquinaCafé {
    int acucarDisponivel;
    int acucarEscolido;

    public int getAcucarEscolido() {
        return acucarEscolido;
    }

    public void setAcucarEscolido(int acucarEscolido) {
        this.acucarEscolido = acucarEscolido;
    }

    public int getAcucarDisponivel() {
        return acucarDisponivel;
    }

    public void setAcucarDisponivel(int acucarDisponivel) {
        this.acucarDisponivel = acucarDisponivel;
    }

    public void fazerCafe(int acucarEscolido){
        if (acucarEscolido > getAcucarDisponivel()){
            System.out.println("Não temos açucar disponivel para seu café");
        }

        }
    public void fazerCafe(String nome, int acucarEscolido){
        if (acucarEscolido < getAcucarDisponivel()){
            System.out.println("Senhor " + nome + " seu café esta sendo preparado");
        }
    }
}
