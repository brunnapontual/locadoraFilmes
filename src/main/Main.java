package main;

import java.util.Date;
import model.Cliente;
import model.Conta;
import model.Filme;
import model.Locacao;

public class Main {
    public static void main(String[] args) {

        Filme[] filmes = {
            new Filme("Matrix", 1999, "Ação", 10.0),
            new Filme("A Viagem de Chihiro", 2001, "Animação", 12.0),
            new Filme("Titanic", 1997, "Romance", 8.0),
            new Filme("Vingadores", 2012, "Ação", 15.0),
            new Filme("Harry Potter", 2001, "Fantasia", 10.0),
            new Filme("O Rei Leão", 1994, "Animação", 9.0),
            new Filme("Corra!", 2017, "Terror", 11.0),
            new Filme("A Origem", 2010, "Ficção", 14.0),
            new Filme("Homem-Aranha", 2002, "Ação", 10.0),
            new Filme("Interestelar", 2014, "Ficção", 13.0)
        };

        Cliente c1 = new Cliente("Brunna", "11111111111", "Recife", "819999999");
        Cliente c2 = new Cliente("Lucas", "22222222222", "Olinda", "819888888");
        Cliente c3 = new Cliente("Mariana", "33333333333", "Paulista", "819777777");
        Cliente c4 = new Cliente("Rafaela", "44444444444", "Jaboatão", "819666666");
        Cliente c5 = new Cliente("Pedro", "55555555555", "Caruaru", "819555555");

        Conta conta1 = new Conta(c1, 1);
        Conta conta2 = new Conta(c2, 2);
        Conta conta3 = new Conta(c3, 3);
        Conta conta4 = new Conta(c4, 4);
        Conta conta5 = new Conta(c5, 5);

        conta1.locarFilmes(new Filme[] {filmes[0], filmes[1], filmes[2]});
        conta1.locarFilmes(new Filme[] {filmes[3]});
        conta1.locarFilmes(new Filme[] {filmes[4], filmes[5]});
        conta1.locarFilmes(new Filme[] {filmes[6]});

        conta2.locarFilmes(new Filme[] {filmes[7], filmes[8]});
        conta2.locarFilmes(new Filme[] {filmes[9], filmes[0]});
        conta2.locarFilmes(new Filme[] {filmes[1]});
        conta2.locarFilmes(new Filme[] {filmes[2], filmes[3], filmes[4]});

        conta3.locarFilmes(new Filme[] {filmes[5], filmes[6]});
        conta3.locarFilmes(new Filme[] {filmes[7], filmes[8], filmes[9]});
        conta3.locarFilmes(new Filme[] {filmes[0]});
        conta3.locarFilmes(new Filme[] {filmes[1], filmes[2]});

        conta4.locarFilmes(new Filme[] {filmes[3], filmes[4]});
        conta4.locarFilmes(new Filme[] {filmes[5]});
        conta4.locarFilmes(new Filme[] {filmes[6], filmes[7], filmes[8]});
        conta4.locarFilmes(new Filme[] {filmes[9]});

        conta5.locarFilmes(new Filme[] {filmes[0], filmes[9]});
        conta5.locarFilmes(new Filme[] {filmes[1], filmes[2], filmes[3]});
        conta5.locarFilmes(new Filme[] {filmes[4], filmes[5], filmes[6]});
        conta5.locarFilmes(new Filme[] {filmes[7], filmes[8]});

        System.out.println(conta1.extratoHistorico());
        System.out.println(conta2.extratoHistorico());
        System.out.println(conta3.extratoHistorico());
        System.out.println(conta4.extratoHistorico());
        System.out.println(conta5.extratoHistorico());
    }
}