# ⚡ Batalha Pokémon em Java

Jogo de batalha Pokémon desenvolvido em Java e executado pelo terminal. O jogador escolhe seu Pokémon e enfrenta um adversário selecionado aleatoriamente.

Projeto criado para praticar lógica de programação, estruturas condicionais, laços de repetição e interação com o usuário.

## 🎮 Funcionalidades

- Menu principal com opções para jogar ou sair.
- Escolha entre Pikachu, Charmander e Squirtle.
- Seleção aleatória do Pokémon adversário.
- Atributos de ataque e defesa gerados aleatoriamente.
- Batalha com opções de atacar, defender ou fugir.
- Adversário com ataques normais, defesa e ataques especiais.
- Recuperação de vida em determinadas condições.
- Exibição da vida dos personagens durante a batalha.
- Relatório com contadores de ataques e valores de dano.
- Possibilidade de iniciar outra partida pelo menu.

## 🛠️ Tecnologias utilizadas

- **Java**
- **Scanner:** leitura das opções informadas pelo jogador.
- **Random:** geração dos atributos e das ações aleatórias.

O projeto utiliza apenas bibliotecas padrão do Java.

## 📚 Conceitos praticados

- Variáveis e tipos de dados.
- Operadores aritméticos, relacionais e lógicos.
- Condicionais `if`, `else if` e `else`.
- Estrutura de seleção `switch`.
- Laços de repetição `while`.
- Controle de fluxo com `break`.
- Contadores e acumuladores.
- Entrada e saída de dados pelo terminal.

## 🚀 Como executar

### Pré-requisitos

Ter o **JDK 17 ou superior** instalado.

### Organização do arquivo

Salve o arquivo `Pokemon.java` dentro da pasta `DesafioPokemon`, respeitando o pacote declarado no código:

```text
DesafioPokemon/
└── Pokemon.java
```

### Compilar

Abra o terminal na pasta que contém a pasta `DesafioPokemon` e execute:

```bash
javac -encoding UTF-8 DesafioPokemon/Pokemon.java
```

### Iniciar o jogo

```bash
java DesafioPokemon.Pokemon
```

Você também pode executar o projeto em uma IDE com suporte a Java.

## 🕹️ Como jogar

1. Selecione **1 — Jogar** no menu principal.
2. Escolha seu Pokémon.
3. Confira os atributos do jogador e do adversário.
4. Durante a batalha, selecione uma ação:
   - **1 — Lutar:** atacar o inimigo.
   - **2 — Defender:** tentar se defender, com possibilidade de recuperar vida em determinadas condições.
   - **3 — Fugir:** encerrar a batalha atual.
5. Após a partida, volte ao menu para jogar novamente ou sair.

## 🔧 Melhorias planejadas

O projeto está em desenvolvimento. Alguns próximos passos são:

- Validar entradas para evitar erros ao digitar letras nas opções numéricas.
- Impedir que a partida comece com um Pokémon inválido.
- Revisar a defesa para que ela seja aplicada ao ataque recebido.
- Corrigir os cálculos e as informações de dano no relatório.
- Encerrar a batalha imediatamente quando um Pokémon ficar sem vida.
- Diferenciar a fuga dos resultados de vitória e derrota.
- Organizar o código em métodos para facilitar a manutenção.

## 👨‍💻 Autor

Desenvolvido por **Nickolas Martins** como projeto de estudo de Java e lógica de programação.

## ℹ️ Sobre o projeto

Projeto educacional inspirado em Pokémon, sem vínculo com os detentores da marca.
