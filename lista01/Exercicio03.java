package lista01;

// Converte kilômetros para milhas
public class Exercicio03 {
    public static void main(String[] args) {
        double kilometros = 1.5;
        double milhasEmUmKilometro = 0.6213712;

        double resultado = kilometros * milhasEmUmKilometro;

        System.out.printf(
            "O valor recebido em kilômetros é %f.\n" +
            "O resultado em milhas é %f.",
            kilometros, resultado
        );
    }
}
