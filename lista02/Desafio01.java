package lista02;

// Determina se uma pessoa pode contratar um empréstimo
// Imprime o motivo em caso de recusa
public class Desafio01 {
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

        if(idade < 18){
            System.out.println("O empréstimo foi reprovado pois a idade não pode ser menor que 18 anos.");
        } else if(idade > 65) {
            System.out.println("O empréstimo foi reprovado pois a idade não pode ser maior que 65 anos.");
        } else if(numeroParcelas < 3) {
            System.out.println("O empréstimo foi reprovado pois a quantidade de parcelas não pode ser menor que 3.");
        } else if(numeroParcelas > 24) {
            System.out.println("O empréstimo foi reprovado pois a quantidade de parcelas não pode ser maior que 24.");
        } else if(valorParcela > valorMaximoParcela) {
            System.out.printf(
                "O empréstimo foi reprovado pois uma parcela de %.2f compromete mais " +
                "do que 30% da renda dessa pessoa.", valorParcela
            );
        } else {
            System.out.println("O empréstimo foi aprovado.");
        }
    }
}
