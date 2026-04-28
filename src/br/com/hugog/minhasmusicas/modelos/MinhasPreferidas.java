package br.com.hugog.minhasmusicas.modelos;

// Gerencia a lista de audios preferidos do usuario
public class MinhasPreferidas {

    // Avalia um Audio e exibe uma mensagem conforme sua classificacao.
    // Polimorfismo: o metodo getClassificacao() chamado e o da subclasse real (Musica ou Podcast)
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            // Classificacao alta: considerado sucesso absoluto
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            // Classificacao media: popular, mas nao e um hit absoluto
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}
