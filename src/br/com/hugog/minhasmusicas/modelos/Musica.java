package br.com.hugog.minhasmusicas.modelos;

// Musica herda de Audio e adiciona atributos especificos de uma faixa musical
public class Musica extends Audio {
    private String album;   // Album ao qual a musica pertence
    private String cantor;  // Artista ou banda responsavel pela musica
    private String genero;  // Genero musical (ex: rock, pop, sertanejo)

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Sobrescreve a classificacao da classe Audio:
    // musicas com mais de 2000 reproducoes recebem nota 10, caso contrario nota 7
    @Override
    public double getClassificacao() {
        if(this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
