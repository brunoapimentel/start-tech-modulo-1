# Exercícios sobre variáveis, operadores matemáticos e entrada/saída

Diretrizes para todos os exercícios:
- Imprima mensagens amigáveis.
- Imprima também os valores de entrada.
- Os valores de entrada devem ser escritos como variáveis declaradas no início do programa.
- Use nomes claros para suas variáveis.
- Resolva cada exercício em um arquivo distinto.

## 1. Calcular a idade de uma pessoa

Crie um programa que receba o ano de nascimento de uma pessoa e calcule quantos anos ela tem considerando que o ano atual é 2022.
Obs: Não vamos considerar o mês do nascimento nesse exercício.

```
O ano de nascimento informado é 1998.
A pessoa tem (ou vai completar) 24 anos em 2022. 
```

## 2. Calcular a quantidade de pessoas que cabem em uma sala de cinema

Crie um programa que receba a quantidade de cadeiras que existe em cada fileira de uma sala de cinema, e quantas fileiras existem na sala.
O programa deve então imprimir no console a capacidade de pessoas sentadas nessa sala.

```
A sala de cinema tem 10 fileiras e 8 cadeiras em cada.
A capacidade dessa sala é de 80 pessoas.
```

**Desafio extra**: Considere que a sala de cinema reserve 10% de sua capacidade para pessoas com deficiência. Imprima no console a quantidade total de lugares e a quantidade reservada para pessoas com deficiência.

```
A sala de cinema tem 10 fileiras e 8 cadeiras em cada.
A capacidade dessa sala é de 80 pessoas, sendo que 8 lugares são reservados para PCDs.
```

## 3. Converter kilômetros para milhas

Crie um programa que receba um valor em kilômetros e imprima o seu valor convertido para milhas.

```
O valor recebido em kilômetros é 1.5.
O resultado em milhas é 0.9320568.
```

## 4. Converter de reais para diversas moedas

Escolha 5 moedas de países diferentes, com exceção do Brasil. Crie um programa que recebe um valor em Reais e imprime a conversão para as 5 outras moedas.
Obs: Consulte a cotação do dia de hoje e deixe os valores de conversão fixos no seu programa.

```
O valor recebido é de 10.00 reais.
Isso equivale a:
- 1.95 dólares
- 1.95 euros
- 1.70 libras
- 311.09 pesos argentinos
- 47.48 coroas tchecas
```

**Desafio extra**: Limite para 2 a quantidade de casas decimais.

## 5. Converter de celsius para farenheit

Crie um programa que receba uma temperatura em graus celsius e imprima sua conversão para farenheit.

```
A temperatura informada é 32.5ºC.
O valor convetido é 90.5ºF.
```

## 6. Calcular o volume de uma piscina

Crie um programa que recebe 3 valores numéricos equivalentes à largura, comprimento e profundidade de uma piscina. Ele deve imprimir na tela quantos litros de água cabem na piscina.

```
As dimensões da piscina são 10m x 20m x 1.8m.
Essa piscina comporta 360000.0 litros de água.
```

**Desafio extra**: Permita que o usuário informe 4 valores distintos: largura, comprimento, profundidade inicial e profundidade final.

```
As dimensões da piscina são 10m x 20m. Sua profundiade inicial é 1.2m e sua profundidade final é 1.8m.
Essa piscina comporta 300000.0 litros de água.
```

## 7 - Utilizar os argumentos de entrada do programa

Retorne aos exercícios anteriores dessa lista e mude as definições de variável que servem como entrada para o programa para que seus valores devem ser lidos dos argumentos de entrada do programa (args).

```
int anoNascimento = args[0];
int anoAtual = args[1];
```

Pesquise na internet como definir parâmetros de entrada ao executar o programa pelo IntelliJ Idea (ou pela sua IDE de preferência).
