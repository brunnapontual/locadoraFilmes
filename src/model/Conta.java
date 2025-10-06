package model;

import java.util.Date;

public class Conta {
    private Cliente cliente;
    private int numero;
    private double saldoDevedor;
    private Locacao[] historicoLocacao;

    public Conta(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldoDevedor = 0;
        this.historicoLocacao = new Locacao[10];
    }

    public void locarFilmes(Filme[] filmes) {
        Locacao novaLocacao = new Locacao(new Date());
        for (Filme f : filmes) {
            if (f != null) {
                novaLocacao.addFilme(f);
            }
        }
        for (int i = 0; i < historicoLocacao.length; i++) {
            if (historicoLocacao[i] == null) {
                historicoLocacao[i] = novaLocacao;
                break;
            }
        }
        saldoDevedor += novaLocacao.getValorTotalAPagar();
    }

    public String extratoHistorico() {
        StringBuilder extrato = new StringBuilder();
        extrato.append(".:: Histórico de Locações de ").append(cliente.getNome()).append(" ::.\n");

        for (Locacao loc : historicoLocacao) {
            if (loc != null) {
                extrato.append(loc.getData()).append ("  ");
                for (Filme f : loc.getListaFilmes()) {
                    if (f != null) {
                        extrato.append(f.getTitulo()).append (", ");
                    }
                }
                extrato.append("Valor: R$" + loc.getValorTotalAPagar() + "\n");
            }
        }
        return extrato.toString();
    }

    public void pagarDebito(double valor) {
        if (valor <= saldoDevedor) {
            saldoDevedor -= valor;
        } else {
            saldoDevedor = 0;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public Locacao[] getHistoricoLocacao() {
        return historicoLocacao;
    }
}