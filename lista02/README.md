# Exercícios sobre condicionais

## 1. Determinar se um aluno passou de ano

Crie um programa que recebe 4 notas de um aluno. O programa deve calcular a média dessas notas e determinar se o aluno foi aprovado nessa matéria. Para que o aluno seja aprovado, sua média final deve ser 6 ou mais.

Exemplo 1
```
As notas do aluno são: 5, 8, 6 e 7.
A média final é 6.5.
O aluno foi aprovado.
```

Exemplo 2
```
As notas do aluno são: 2, 4, 3 e 1.
A média final é 2.5.
O aluno foi reprovado.
```

## 2. Conversor Celsius / Fahrenheit (revisitado)
Crie um programa que receba dois valores: o primeiro, é um número que corresponde a uma temperatura. O segundo, é uma letra que indica se a temperatura está em Celsius (C) ou Fahrenheit (F). O programa deve imprimir a conversão da temperatura para outra unidade de medida.

Exemplo 1
```
A temperatura informada foi 30º C.
Ela equivale a 86º Fahrenheit.
```

Exemplo 2
```
A temperatura informada foi 50º F.
Ela equivale a 10º Celsius.
```

Exemplo 3: uma letra inválida foi informada
```
A letra D não corresponde a uma unidade de medida de temperatura.
```

## 3. Determinar se uma pessoa pode contratar um empréstimo
Crie um programa que aprova ou reprova automaticamente um pedido de empréstimo. Para isso, os seguintes critérios são usados:

a) Um pessoa só pode fazer um empréstimo se ela tiver entre 18 e 65 anos de idade.

b) O empréstimo deverá ser pago em no mínimo 3 parcelas, e no máximo em 24 parcelas.

c) Uma única parcela não pode comprometer mais de 30% da renda da pessoa.

O programa deve receber como argumentos de entrada os valores necessários para tomada de decisão.

Exemplo 1: aprovado
```
A pessoa que está solicitando o empréstimo tem 22 anos de idade e tem o salário de 10000.0 reais.
O valor solicitado é de 30000.0 reais para ser pago em 24 parcelas.
O empréstimo foi aprovado.
```

Exemplo 2: reprovado por idade
```
A pessoa que está solicitando o empréstimo tem 16 anos de idade e tem o salário de 2000.0 reais.
O valor solicitado é de 10000.0 reais para ser pago em 20 parcelas.
O empréstimo foi reprovado.
```

Exemplo 3: reprovado pelo número de parcelas
```
A pessoa que está solicitando o empréstimo tem 50 anos de idade e tem o salário de 2000.0 reais.
O valor solicitado é de 10000.0 reais para ser pago em 30 parcelas.
O empréstimo foi reprovado.
```

Exemplo 4: reprovado pelo comprometimento da renda
```
A pessoa que está solicitando o empréstimo tem 50 anos de idade e tem o salário de 2000.0 reais.
O valor solicitado é de 10000.0 reais para ser pago em 10 parcelas.
O empréstimo foi reprovado.
```

## 4. Sorteio
Crie um jogo em que o usuário pode apostar em um número entre 1 a 6. O programa deve, então, sortear um numéro aleatório entre 1 e 6 e dizer se o jogador acertou ou errou a sua aposta.

Obs: Pesquise na internet como sortear números aleatórios em Java.

Exemplo 1
```
O número selecionado foi o 2.
O número sorteado foi o 2.
Você acertou!
```

Exemplo 2
```
O número selecionado foi o 2.
O número sorteado foi o 5.
Você errou!
```

Exemplo 3
```
O número selecionado foi o 8.
Erro! Por favor, escolha um número entre 1 e 6.
```

## 5. Calculo de desconto de INSS
Crie um programa que recebe o valor do salário de uma pessoa. Baseado no número recebido, deve-se mostrar o valor que será pago de contribuição ao INSS.

| salário                        | alíquota |
|--------------------------------|----------|
| até R$ 1212,00                 | 7,5%     |
| de R$ 1.212,01 até R$ 2.427,35 | 9%       |
| de R$ 2.427,36 até R$ 3.641,03 | 12%      |
| de R$ 3.641,04 até R$ 7.087,22 | 14%      |

Lembre-se que o valor é calculado progressivamente, ou seja, para uma pessoa que tem o salário de R$ 2000, é incorreto apenas aplicar a alíquota de 9% e dizer que o valor de contribuição é de R$ 180. Veja como calcular esse caso:

Primeiro calcula-se o valor de contribuição correspondente à primeira faixa:
R$ 1212,00 * 7.5% = R$ 90,90

Depois, calcula-se o valor do salário que excede à primeira faixa:
R$ 2000,00 - R$ 1212,00 = R$ 788,00

Calcula-se então o valor de contribuição correspondente à segunda faixa:
R$ 788,00 * 9% = R$ 70,92

Para finalizar, soma-se o resultado das faixas:
R$ 90,90 + 80,92 = R$ 161,82

Veja mais exemplos em http://calculadorainss.fisconet.com.br/.


Exemplo 1
```
O salário bruto informado foi 1850.0 reais.
O valor de contribuição ao INSS é 161.82 reais.
```

Exemplo 2
```
O salário bruto informado foi 3800.0 reais.
O valor de contribuição ao INSS é 368.17 reais.
```

Exemplo 1
```
O salário bruto informado foi 8000.0 reais.
O valor de contribuição ao INSS é de 828.38 reais.
```

# Desafios

## 1. Por que meu empréstimo foi reprovado?

Modifique o programa feito no exercício 3 para que além de imprimir o resultado da análise de empréstimo, ele também explique o motivo em caso de reprovação.

Exemplo 1: reprovado por idade
```
A pessoa que está solicitando o empréstimo tem 16 anos de idade e tem o salário de 2000.0 reais.
O valor solicitado é de 10000.0 reais para ser pago em 20 parcelas.
O empréstimo foi reprovado pois a idade não pode ser menor a 18 anos.
```

Exemplo 2: reprovado pelo comprometimento da renda
```
A pessoa que está solicitando o empréstimo tem 50 anos de idade e tem o salário de 2000.0 reais.
O valor solicitado é de 10000.0 reais para ser pago em 10 parcelas.
O empréstimo foi reprovado pois uma parcela de 1000 reais compromete mais que 30% da renda dessa pessoa.
```

Obs: Caso o empréstimo seja reprovado por mais de um motivo, apenas um motivo precisa ser impresso.

## 2. Sorteio

Modifique o programa feito no exercício 4 para ele sortear 3 números e comparar a aposta com cada um deles.

Exemplo
```
O número selecionado foi o 2.
Os número sorteados foram o 1, 2 e 2.
Você teve dois acertos!
```

## 3. Por que meu empréstimo foi reprovado? (revisitado)

Modifique o programa feito no desafio 1 para que todos os motivos de reprovação sejam impressos

Exemplo 1: reprovado por idade, comprometimento de renda e número de parcelas
```
A pessoa que está solicitando o empréstimo tem 16 anos de idade e tem o salário de 2000.0 reais.
O valor solicitado é de 30000.0 reais para ser pago em 30 parcelas.
O empréstimo foi reprovado pelos seguintes motivos:
- a idade não pode ser menor a 18 anos.
- a quantidade de parcelas não pode ser superior a 24.
- o valor da parcela desse empréstimo é de 1000 reais, e corresponde a 50% da renda da pessoa. Esse valor não pode ser superior a 30%.
```