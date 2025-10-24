import model.*;

public class Principal {
    public static void main(String[] args) {
        Filme[] filmes = {
            new Filme("Salt", 3.5),
            new Filme("Heroes", 3.5),
            new Filme("X-Men First Class", 5.0),
            new Filme("Matrix", 4.0),
            new Filme("Inception", 4.5),
            new Filme("Titanic", 3.0),
            new Filme("Avatar", 4.5),
            new Filme("Interstellar", 5.0),
            new Filme("Gladiador", 3.5),
            new Filme("O Senhor dos Anéis", 4.0)
        };

        Conta[] contas = {
            new Conta("Danilo Farias"),
            new Conta("Maria Augusta"),
            new Conta("João Silva"),
            new Conta("Ana Costa"),
            new Conta("Carlos Mendes")
        };

        for (Conta conta : contas) {
            for (int i = 0; i < 4; i++) {
                Filme[] locados = {
                    filmes[(i + 1) % filmes.length],
                    filmes[(i + 2) % filmes.length]
                };
                conta.locarFilmes(locados);
            }
        }

        for (Conta conta : contas) {
            System.out.println(conta.extratoHistorico());
        }
    }
}