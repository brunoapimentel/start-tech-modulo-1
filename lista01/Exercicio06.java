package lista01;

// Calcula a capacidade em litros de uma piscina
public class Exercicio06 {
    public static void main(String[] args) {
        double largura = 10;
        double comprimento = 20;
        double profundidade = 1.8;

        double volume = largura * comprimento * profundidade;
        double capacidadeEmLitros = volume * 1000;

        System.out.printf(
            "As dimensões da piscina são %.2fm x %.2fm x %.2fm.\n" +
            "Essa piscina comporta %.2f litros de água.",
            largura, comprimento, profundidade, capacidadeEmLitros
        );
    }
}
