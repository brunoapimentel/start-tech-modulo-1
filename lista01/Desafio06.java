package lista01;

// Calcula a capacidade em litros de uma piscina com desnível
public class Desafio06 {
    public static void main(String[] args) {
        double largura = 10;
        double comprimento = 20;
        double profundidadeInicial = 1.2;
        double profundidadeFinal = 1.8;
        double profundidadeMedia = (profundidadeInicial + profundidadeFinal) / 2;

        double volume = largura * comprimento * profundidadeMedia;
        double capacidadeEmLitros = volume * 1000;

        System.out.printf(
            "As dimensões da piscina são %.2fm x %.2fm.\n" +
            "Sua profundidade inicial é %.2fm e sua profundidade final é %.2fm.\n" +
            "Essa piscina comporta %.2f litros de água.",
            largura, comprimento, profundidadeInicial, profundidadeFinal, capacidadeEmLitros
        );
    }
}
