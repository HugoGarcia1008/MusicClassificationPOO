package br.com.hugog.minhasmusicas.modelos;

// Classe base que representa qualquer tipo de audio (musica, podcast, etc.)
public class Audio {
    private String titulo;          // Nome do audio
    private int totalReproducoes;   // Contador de quantas vezes foi reproduzido
    private int totalCurtidas;      // Contador de quantas vezes foi curtido
    private double classificacao;   // Nota de classificacao do audio

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    // Incrementa o total de curtidas em 1 a cada chamada
    public void curte(){
        this.totalCurtidas++;
    }

    // Incrementa o total de reproducoes em 1 a cada chamada
    public void reproduz(){
        this.totalReproducoes++;
    }
}
