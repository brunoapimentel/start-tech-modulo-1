package lista02;

// Determina se uma pessoa pode contratar um empréstimo
public class Exercicio03 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(args[0]);
        double salario = Double.parseDouble(args[0]);
        double valorEmprestimo = Double.parseDouble(args[0]);
        int numeroParcelas = Integer.parseInt(args[0]);

        double valorParcela = valorEmprestimo / numeroParcelas;
        double valorMaximoParcela = salario * 0.3;

        System.out.printf(
            "A pessoa que está solicitando o empréstimo tem %d anos de idade e tem o salário de %.2f reais.\n" +
            "O valor solicitado é de %.2f reais para ser pago em %d parcelas.\n",
            idade, salario, valorEmprestimo, numeroParcelas
        );

        if(
            (idade >= 18 && idade <= 65) &&
            (numeroParcelas >= 3 && numeroParcelas <= 24) &&
            (valorParcela <= valorMaximoParcela)
        ) {
            System.out.println("O empréstimo foi aprovado.");
        } else  {
            System.out.println("O empréstimo foi reprovado.");
        }
    }
}
