# MusicClassificationPOO - Java OOP

Aplicacao Java que gerencia musicas e podcasts preferidos, demonstrando os quatro pilares da Orientacao a Objetos: **abstracao**, **heranca**, **encapsulamento** e **polimorfismo**.

---

## Estrutura do Projeto

```
src/br/com/hugog/minhasmusicas/
├── modelos/
│   ├── Audio.java           # Classe base (superclasse)
│   ├── Musica.java          # Subclasse de Audio
│   ├── Podcast.java         # Subclasse de Audio
│   └── MinhasPreferidas.java # Gerenciador de preferidos
└── principal/
    └── Principal.java       # Ponto de entrada da aplicacao
```

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

---

### `Musica` (herda de `Audio`)
Adiciona os atributos `album`, `cantor` e `genero`.

Regra de classificacao (polimorfismo via `@Override`):
- Mais de **2000 reproducoes** → nota **10**
- Caso contrario → nota **7**

---

### `Podcast` (herda de `Audio`)
Adiciona os atributos `apresentador` e `descricao`.

Regra de classificacao (polimorfismo via `@Override`):
- Mais de **500 curtidas** → nota **10**
- Caso contrario → nota **8**

---

### `MinhasPreferidas`
Recebe qualquer objeto do tipo `Audio` no metodo `inclui(Audio audio)` e exibe uma mensagem baseada na classificacao:
- Classificacao **>= 9** → "sucesso absoluto e preferido por todos!"
- Classificacao **< 9** → "um dos que todo mundo esta curtindo"

O polimorfismo garante que o `getClassificacao()` correto (de `Musica` ou `Podcast`) seja chamado automaticamente.

---

## Como Executar

**Pre-requisito:** JDK 8 ou superior instalado.

1. Clone o repositorio:
   ```bash
   git clone <url-do-repositorio>
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
Forever também é um dos que todo mundo está curtindo
```

> `BolhaDev` atinge nota 10 (1000 curtidas > 500).  
> `Forever` fica com nota 7 (apenas 1000 reproducoes, abaixo de 2000).

---

## Conceitos Demonstrados

| Conceito        | Onde aparece                                                  |
|-----------------|---------------------------------------------------------------|
| Abstracao       | Classe `Audio` modela o comportamento comum de todos os audios |
| Heranca         | `Musica` e `Podcast` estendem `Audio`                         |
| Encapsulamento  | Atributos `private` acessados via getters/setters             |
| Polimorfismo    | `getClassificacao()` sobrescrito em cada subclasse; `MinhasPreferidas` aceita qualquer `Audio` |

---

## Tecnologias

- Java (JDK 8+)
- IntelliJ IDEA (configuracoes incluidas na pasta `.idea/`)
