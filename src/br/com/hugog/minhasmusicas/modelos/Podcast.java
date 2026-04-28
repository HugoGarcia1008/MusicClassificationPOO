package br.com.hugog.minhasmusicas.modelos;

// Podcast herda de Audio e adiciona atributos especificos de um episodio de podcast
public class Podcast extends Audio {
    private String apresentador; // Nome do apresentador do podcast
    private String descricao;    // Descricao ou sinopse do episodio

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Sobrescreve a classificacao da classe Audio:
    // podcasts com mais de 500 curtidas recebem nota 10, caso contrario nota 8
    @Override
    public double getClassificacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
