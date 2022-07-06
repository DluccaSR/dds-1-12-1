package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.ExercicioComExcecoes;

public class Conta {
    protected SituacaoConta situacaoConta;
    private String descricao;
    private Double valor;
    private String dataVencimento;
    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }
    public void cancelar() throws OperacaoContaException {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
//            System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
            throw new OperacaoContaException("Nao pode cancelar conta paga " + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
//            System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
            throw new OperacaoContaException("Nao pode cancelar uma conta que já foi canceladaaaaaa ");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
