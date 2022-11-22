package lista02;

// Calcula o valor de contribuição ao INSS
public class Exercicio05 {
    public static void main(String[] args) {
        double salario = Double.parseDouble(args[0]);
        double valorInss;

        final double ALIQUOTA_FAIXA_1 = 0.075;
        final double ALIQUOTA_FAIXA_2 = 0.09;
        final double ALIQUOTA_FAIXA_3 = 0.12;
        final double ALIQUOTA_FAIXA_4 = 0.14;

        final double TETO_FAIXA_1 = 1212;
        final double TETO_FAIXA_2 = 2427.35;
        final double TETO_FAIXA_3 = 3641.03;
        final double TETO_FAIXA_4 = 7087.22;

        final double CONTRIBUICAO_MAXIMA_FAIXA_1 = TETO_FAIXA_1 * ALIQUOTA_FAIXA_1;
        final double CONTRIBUICAO_MAXIMA_FAIXA_2 = (TETO_FAIXA_2 - TETO_FAIXA_1) * ALIQUOTA_FAIXA_2 +
                CONTRIBUICAO_MAXIMA_FAIXA_1;
        final double CONTRIBUICAO_MAXIMA_FAIXA_3 = (TETO_FAIXA_3 - TETO_FAIXA_2) * ALIQUOTA_FAIXA_3 +
                CONTRIBUICAO_MAXIMA_FAIXA_2;
        final double CONTRIBUICAO_MAXIMA = (TETO_FAIXA_4 - TETO_FAIXA_3) * ALIQUOTA_FAIXA_4 +
                CONTRIBUICAO_MAXIMA_FAIXA_3;

        if (salario <= TETO_FAIXA_1) {
            valorInss = salario * ALIQUOTA_FAIXA_1;
        } else if (salario <= TETO_FAIXA_2) {
            valorInss = (salario - TETO_FAIXA_1) * ALIQUOTA_FAIXA_2 + CONTRIBUICAO_MAXIMA_FAIXA_1;
        } else if (salario <= TETO_FAIXA_3) {
            valorInss = (salario - TETO_FAIXA_2) * ALIQUOTA_FAIXA_3 + CONTRIBUICAO_MAXIMA_FAIXA_2;
        } else if (salario <= TETO_FAIXA_4) {
            valorInss = (salario - TETO_FAIXA_3) * ALIQUOTA_FAIXA_4 + CONTRIBUICAO_MAXIMA_FAIXA_3;
        } else {
            valorInss = CONTRIBUICAO_MAXIMA;
        }

        System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
        System.out.printf("O valor da contribuição ao INSS é de %.2f reais.", valorInss);
    }
}
