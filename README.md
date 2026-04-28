# MusicClassificationPOO - Java OOP

Projeto de estudo desenvolvido para praticar e fixar os quatro pilares da **Orientacao a Objetos (OOP)** em Java: abstracao, heranca, encapsulamento e polimorfismo.

A aplicacao simula um sistema simples de gerenciamento de audios preferidos, utilizando musicas e podcasts como exemplos praticos dos conceitos estudados.

---

## Estrutura do Projeto

```
src/br/com/hugog/minhasmusicas/
├── modelos/
│   ├── Audio.java            # Classe base (superclasse)
│   ├── Musica.java           # Subclasse de Audio
│   ├── Podcast.java          # Subclasse de Audio
│   └── MinhasPreferidas.java # Gerenciador de preferidos
└── principal/
    └── Principal.java        # Ponto de entrada da aplicacao
```

---

## Conceitos Praticados

| Conceito        | Onde aparece                                                                                    |
|-----------------|-------------------------------------------------------------------------------------------------|
| Abstracao       | Classe `Audio` modela o comportamento comum de todos os audios                                  |
| Heranca         | `Musica` e `Podcast` estendem `Audio`                                                           |
| Encapsulamento  | Atributos `private` acessados via getters/setters                                               |
| Polimorfismo    | `getClassificacao()` sobrescrito em cada subclasse; `MinhasPreferidas` aceita qualquer `Audio`  |

---

## Classes e Responsabilidades

### `Audio` (superclasse)
Representa qualquer tipo de conteudo de audio. Possui os atributos:
- `titulo` — nome do audio
- `totalReproducoes` — contagem de reproducoes
- `totalCurtidas` — contagem de curtidas
- `classificacao` — nota do audio

Metodos de acao:
- `reproduz()` — incrementa `totalReproducoes`
- `curte()` — incrementa `totalCurtidas`

### `Musica` (herda de `Audio`)
Adiciona os atributos `album`, `cantor` e `genero`.

Regra de classificacao (polimorfismo via `@Override`):
- Mais de **2000 reproducoes** → nota **10**
- Caso contrario → nota **7**

### `Podcast` (herda de `Audio`)
Adiciona os atributos `apresentador` e `descricao`.

Regra de classificacao (polimorfismo via `@Override`):
- Mais de **500 curtidas** → nota **10**
- Caso contrario → nota **8**

### `MinhasPreferidas`
Recebe qualquer objeto do tipo `Audio` e exibe uma mensagem baseada na classificacao:
- Classificacao **>= 9** → "sucesso absoluto e preferido por todos!"
- Classificacao **< 9** → "um dos que todo mundo esta curtindo"

O polimorfismo garante que o `getClassificacao()` correto (de `Musica` ou `Podcast`) seja chamado automaticamente.

---

## Como Executar

**Pre-requisito:** JDK 8 ou superior instalado.

1. Clone o repositorio:
   ```bash
   git clone https://github.com/HugoGarcia1008/MusicClassificationPOO.git
   ```

2. Compile os arquivos a partir da pasta `src/`:
   ```bash
   javac -d out src/br/com/hugog/minhasmusicas/**/*.java src/br/com/hugog/minhasmusicas/principal/Principal.java
   ```

3. Execute a classe principal:
   ```bash
   java -cp out br.com.hugog.minhasmusicas.principal.Principal
   ```

---

## Saida Esperada

```
BolhaDev é considerado sucesso absoluto e preferido por todos!
Nirvana também é um dos que todo mundo está curtindo
```

---

## Tecnologias

- Java (JDK 8+)
- IntelliJ IDEA
