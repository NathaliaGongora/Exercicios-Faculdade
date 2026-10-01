# Exercícios da Faculdade

Este repositório reúne exercícios desenvolvidos durante o curso de Análise e Desenvolvimento de Sistemas na FACENS. O conteúdo está organizado por semestre, disciplina e tema para registrar minha evolução acadêmica e prática em programação.

## Conteúdo atual

### 1º semestre — Algoritmos: variáveis

Exercícios introdutórios em Java sobre declaração e atribuição de variáveis, entrada de dados com `Scanner`, operadores aritméticos, cálculos e exibição de resultados.

| Exercício | Conteúdo praticado |
|---|---|
| 01 | Média de três valores usando apenas duas variáveis |
| 02 | Cálculo da área de um triângulo |
| 03 | Cálculo da área de um círculo |
| 04 | Quadrado de um número reutilizando a mesma variável |
| 05 | Soma de dois números |
| 06 | Antecessor e sucessor de um número inteiro |
| 07 | Conversão de metros para centímetros |
| 08 | Cálculo de aumento salarial de 10% |
| 09 | Conversão de Celsius para Fahrenheit |
| 10 | Média de três notas |

### 1º semestre — Algoritmos: estruturas condicionais

Exercícios em Java sobre decisões com `if`, `else if` e `else`, operadores relacionais, operadores lógicos e validação de dados.

| Exercício | Conteúdo praticado |
|---|---|
| 01 | Identificação de número par ou ímpar |
| 02 | Paridade e verificação de intervalo com condicionais aninhadas |
| 03 | Limite de entrada, paridade e verificação de intervalo |
| 04 | Simplificação das verificações com operadores lógicos |
| 05 | Classificação por faixa etária |
| 06 | Calculadora com escolha da operação e validação de divisão por zero |
| 07 | Comparação entre dois números |
| 08 | Classificação de número positivo, negativo ou zero |
| 09 | Validação e classificação de triângulos |
| 10 | Verificação de ano bissexto |

### 1º semestre — Algoritmos: switch case

Exercícios em Java sobre seleção de opções com `switch case`, construção de menus, agrupamento de casos, uso de `break` e tratamento de entradas inválidas com `default`.

| Exercício | Conteúdo praticado |
|---|---|
| 01 | Menu para seleção de bebidas |
| 02 | Identificação da primeira ou segunda quinzena do mês |
| 03 | Conversão de metros para outras unidades |
| 04 | Identificação do dia da semana |
| 05 | Calculadora com menu de operações matemáticas |
| 06 | Exibição de eventos especiais de cada mês |
| 07 | Descrição de cores usando valores textuais |
| 08 | Menu para seleção das estações do ano |
| 09 | Identificação de tamanhos de roupa |
| 10 | Menu para seleção de meios de transporte |

### 1º semestre — Avaliações

#### AC1 — Calculadora de média semestral

Código desenvolvido durante a primeira avaliação de Construção de Algoritmos. A atividade reúne os fundamentos estudados até aquele momento: declaração de variáveis, entrada de dados com `Scanner`, operadores aritméticos, cálculo de média ponderada, operadores lógicos e estruturas condicionais com `if/else`.

O programa recebe as notas de AC1, AC2, AG e AF, calcula a média conforme os respectivos pesos, compara o resultado com a média mínima informada pelo usuário e exibe uma orientação final.

## Estrutura

```text
PrimeiroSemestre/
├── Variaveis/
│   ├── Exercicio01.java
│   ├── ...
│   └── Exercicio10.java
├── Condicionais/
│   ├── Exercicio01.java
│   ├── ...
│   └── Exercicio10.java
├── SwitchCase/
│   ├── Exercicio01.java
│   ├── ...
│   └── Exercicio10.java
└── Avaliacoes/
    └── AC1/
        └── Ac1.java
```

Novas pastas serão adicionadas conforme os conteúdos estudados forem organizados.

## Como executar

É necessário ter o JDK instalado. Na pasta raiz do repositório, compile e execute informando o nome completo da classe:

```bash
javac PrimeiroSemestre/Variaveis/Exercicio01.java
java PrimeiroSemestre.Variaveis.Exercicio01
```

Para testar outro exercício, substitua `Exercicio01` pelo número desejado nos dois comandos.

Para os exercícios de estruturas condicionais, use:

```bash
javac PrimeiroSemestre/Condicionais/Exercicio01.java
java PrimeiroSemestre.Condicionais.Exercicio01
```

Para os exercícios de `switch case`, use:

```bash
javac PrimeiroSemestre/SwitchCase/Exercicio01.java
java PrimeiroSemestre.SwitchCase.Exercicio01
```

Para executar o código da AC1, use:

```bash
javac PrimeiroSemestre/Avaliacoes/AC1/Ac1.java
java PrimeiroSemestre.Avaliacoes.AC1.Ac1
```

## Tecnologias

- Java
- Programação estruturada
- Entrada de dados com `Scanner`
- Estruturas condicionais
- Operadores relacionais e lógicos
- Estruturas de seleção com `switch case`
- Construção de menus no console

> Estes são exercícios acadêmicos introdutórios, publicados para documentar meu aprendizado e minha evolução ao longo do curso.
