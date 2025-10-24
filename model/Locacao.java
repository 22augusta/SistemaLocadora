package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private Date dataLocacao;
    private List<Filme> listaFilmes = new ArrayList<>();
    private double valorTotalApagar = 0;

    public Locacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void addFilme(Filme filme) {
        listaFilmes.add(filme);
        valorTotalApagar += filme.getValorLocacao();
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public double getValorTotalApagar() {
        return valorTotalApagar;
    }
}
