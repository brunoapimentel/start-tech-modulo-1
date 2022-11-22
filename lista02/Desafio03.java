package lista02;

// Determina se uma pessoa pode contratar um empréstimo
// Imprime todos os motivos em caso de recusa
public class Desafio03 {
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

        boolean abaixoDaIdade = idade < 18;
        boolean acimaDaIdade = idade > 65;
        boolean abaixoDoNumeroDeParcelas = numeroParcelas < 3;
        boolean acimaDoNumeroDeParcelas = numeroParcelas > 24;
        boolean acimaDoComprometimentoDeRenda = valorParcela > valorMaximoParcela;

        if(
            abaixoDaIdade || acimaDaIdade ||
            abaixoDoNumeroDeParcelas || acimaDoNumeroDeParcelas ||
            acimaDoComprometimentoDeRenda
        ) {
            System.out.println("O empréstimo foi reprovado pelos seguintes motivos: ");

            if(abaixoDaIdade) {
                System.out.println("- a idade não pode ser menor que 18 anos.");
            }

            if(acimaDaIdade) {
                System.out.println("- a idade não pode ser maior que 65 anos.");
            }

            if(abaixoDoNumeroDeParcelas) {
                System.out.println("- a quantidade de parcelas não pode ser menor que 3.");
            }

            if(acimaDoNumeroDeParcelas) {
                System.out.println("- a quantidade de parcelas não pode ser maior que 24.");
            }

            if(acimaDoComprometimentoDeRenda) {
                double porcentagemDeComprometimento = (100 * valorParcela) / salario;

                System.out.printf(
                    "- o valor da parcela desse empréstimo é de %.2f reais, e corresponde a %.0f%% da " +
                    "renda da pessoa. Esse valor não pode ser superior a 30%%.",
                    valorParcela, porcentagemDeComprometimento
                );
            }
        } else {
            System.out.println("O empréstimo foi aprovado.");
        }
    }
}
