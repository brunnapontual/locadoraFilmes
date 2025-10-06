package model;

import java.util.Date;

public class Locacao {
    private Date data;
    private int valorTotalAPagar;
    private Filme[] listaFilmes;

     public Locacao(Date data) {
        this.data = data;
        this.listaFilmes = new Filme[10];
        this.valorTotalAPagar = 0;

    }

    public void addFilme(Filme filme) {
        for (int i = 0; i < listaFilmes.length; i++) {
            if (listaFilmes[i] == null) {
                listaFilmes[i] = filme;
                valorTotalAPagar += filme.getValorLocacao();
                break;  
            }
        }
    }

    public Date getData() {
        return data;
    }

    public int getValorTotalAPagar() {
        return valorTotalAPagar;
    }

    public Filme[] getListaFilmes() {
        return listaFilmes;
    }
}