package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.ExercicioComExcecoes;

public class ContaPagar extends Conta {
    private Fornecedor fornecedor;

    public ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void pagar() throws OperacaoContaException {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
//            System.out.println("Não pode pagar uma conta que já está paga: "
//                    + this.getDescricao() + ".");
            throw new OperacaoContaException ("Você não pode pagar uma conta que ja está paga");

        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
//            System.out.println("Não pode pagar uma conta que está cancelada: "
//                    + this.getDescricao() + ".");
            throw new OperacaoContaException("Não pode pagar uma conta que ja está cancelada");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() + "no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }


    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
