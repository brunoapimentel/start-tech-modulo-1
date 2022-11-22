package lista01;

// Converte de Celsius para Fahrenheit
public class Exercicio05 {
    public static void main(String[] args) {
        double temperaturaCelsius = 32.5;
        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.printf(
            "A temperatura informada é %.2fºC.\n" +
            "O valor convetido é %.2fºF.",
            temperaturaCelsius, temperaturaFarenheit
        );
    }
}
