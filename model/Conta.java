package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private String nomeCliente;
    private double saldoDevedor = 0;
    private List<Locacao> historicoLocacao = new ArrayList<>();

    public Conta(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void locarFilmes(Filme[] filmes) {
        Locacao locacao = new Locacao(new Date());
        for (Filme filme : filmes) {
            locacao.addFilme(filme);
        }
        historicoLocacao.add(locacao);
        saldoDevedor += locacao.getValorTotalApagar();
    }

    public String extratoHistorico() {
        StringBuilder sb = new StringBuilder();
        sb.append(".:: Histórico de Locações de ").append(nomeCliente).append(" ::.\n");
        for (Locacao locacao : historicoLocacao) {
            sb.append(locacao.getDataLocacao()).append(" ");
            for (Filme filme : locacao.getListaFilmes()) {
                sb.append(filme.getTitulo()).append(", ");
            }
            sb.append("Valor: ").append(locacao.getValorTotalApagar()).append("\n");
        }
        return sb.toString();
    }

    public void pagarDebito(double valor) {
        saldoDevedor -= valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }
}