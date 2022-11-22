package lista02;

// Converte de graus Celsius para Fahrenheit, ou vice-versa
public class Exercicio02 {
    public static void main(String[] args) {
        double temperatura = Integer.parseInt(args[0]);
        char unidade = args[1].charAt(0);
        double conversao;

        if(unidade == 'C') {
            conversao = temperatura * 1.8 + 32;
            System.out.printf(
                "A temperatura informada foi %.2fºC.\n" +
                "Ela equivale a %.2fºF.",
                temperatura, conversao
            );
        } else if(unidade == 'F') {
            conversao = (temperatura - 32) / 1.8;
            System.out.printf(
                "A temperatura informada foi %.2fºF.\n" +
                "Ela equivale a %.2fºC",
                temperatura, conversao
            );
        } else {
            System.out.printf("A letra %s não corresponde a uma unidade de medida de temperatura.", unidade);
        }
    }
}
