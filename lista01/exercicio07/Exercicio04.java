package lista01.exercicio07;

// Converte reais para diversas moedas
public class Exercicio04 {
    public static void main(String[] args) {
        double valorEmReais = Double.parseDouble(args[0]);
        double reaisParaDolares = 0.18;
        double reaisParaEuros = 0.18;
        double reaisParaLibras = 0.16;
        double reaisParaPesosArgentinos = 29.80;
        double reaisParaCoroasTchecas = 4.32;

        double resultadoDolares = valorEmReais * reaisParaDolares;
        double resultadoEuros = valorEmReais * reaisParaEuros;
        double resultadoLibras = valorEmReais * reaisParaLibras;
        double resultadoPesosArgentinos = valorEmReais * reaisParaPesosArgentinos;
        double resultadoCoroasTchecas = valorEmReais * reaisParaCoroasTchecas;

        System.out.printf(
            "O valor recebido é de %.2f reais.\n" +
            "Isso equivale a:\n" +
            "- %.2f dólares\n" +
            "- %.2f euros\n" +
            "- %.2f libras\n" +
            "- %.2f pesos argentinos\n" +
            "- %.2f coroas tchecas",
            valorEmReais, resultadoDolares, resultadoEuros,
            resultadoLibras, resultadoPesosArgentinos, resultadoCoroasTchecas
        );
    }
}
