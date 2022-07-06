package com.company.orientacao_a_objetos.composicao_de_objetos.parte2.construtores.encapsulamento_e_modificadores_de_acesso_public_e_private.ExercicioComExcecoes;

public class ContaReceber extends Conta {
    private Cliente cliente;

    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar() throws OperacaoContaException {
        if (this.getValor() > 50000d) {
            System.out.println("Essa conta a receber não pode ser cancelada. " +
                    "É muito dinheiro para deixar de receber: " + this.getDescricao());
            System.out.println("Essa conta não pode ser cancelada. É muito dinheiro para deixar de receber");
        } else {
            super.cancelar();
        }
    }

    public void receber() throws OperacaoContaException {
        if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            throw new OperacaoContaException("Não pode recerber uma conta que ja está paga: " + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que está cancelada: "
                    + this.getDescricao() + ".");
            throw new OperacaoContaException("Nao pode receber uma conta que ja esta paga: " + getDescricao() );
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do cliente " + this.getCliente().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
