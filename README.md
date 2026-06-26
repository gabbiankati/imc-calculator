# Calculadora de IMC

Aplicação desktop simples feita com **JavaFX** para calcular o Índice de Massa Corporal (IMC) a partir do peso e altura informados pelo usuário, exibindo também a classificação correspondente.

## Funcionalidades

- Entrada de peso (kg) e altura (m)
- Suporte a vírgula ou ponto como separador decimal (ex: `1,75` ou `1.75`)
- Cálculo automático do IMC ao clicar no botão
- Classificação do resultado em categorias:
    - Muito abaixo do peso
    - Abaixo do peso
    - Peso normal
    - Acima do peso
    - Obesidade I
    - Obesidade II (Severa)
    - Obesidade III (Mórbida)
- Tratamento de erro para entradas inválidas (texto não numérico)

## Tecnologias utilizadas

- Java 17
- JavaFX 21.0.2
- Maven

## Pré-requisitos

- JDK 17 ou superior instalado
- Maven (pode ser usado via terminal ou pelo painel Maven embutido do IntelliJ)

## Como executar

### Via IntelliJ (painel Maven)

1. Abra o painel **Maven** na lateral direita do IntelliJ
2. Navegue até `imc-calculator → Plugins → javafx`
3. Dê duplo clique em `javafx:run`

### Via terminal

```bash
mvn javafx:run
```

> **Observação:** se a classe principal (`CalculadoraIMC`) estende `Application` e contém o `main()` diretamente, rodar pelo botão "play" do IntelliJ pode gerar o erro `JavaFX runtime components are missing`. Nesse caso, utilize uma classe `Launcher` separada como ponto de entrada, ou execute via `javafx:run`.

## Estrutura do projeto

```
imc-calculator
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── calculator
                    └── CalculadoraIMC.java
```

## Licença

Projeto de estudo, livre para uso e modificação.