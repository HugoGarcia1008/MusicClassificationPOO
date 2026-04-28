package br.com.hugog.minhasmusicas.principal;

import br.com.hugog.minhasmusicas.modelos.MinhasPreferidas;
import br.com.hugog.minhasmusicas.modelos.Musica;
import br.com.hugog.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        // Cria e configura uma musica
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Nirvana");
        minhaMusica.setCantor("Legião Urbana");

        // Simula 1000 reproducoes da musica (nao atingira o limiar de 2000 para nota 10)
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        // Simula 50 curtidas na musica
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        // Cria e configura um podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        // Simula 5000 reproducoes do podcast
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        // Simula 1000 curtidas no podcast (supera o limiar de 500 para nota 10)
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        // Adiciona ambos aos preferidos e exibe as mensagens de classificacao
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);   // Nota 10 -> mensagem de sucesso absoluto
        preferidas.inclui(minhaMusica);  // Nota 7  -> mensagem de popular
    }
}
