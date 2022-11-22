package lista01;

// Calcula a quantidade de lugares em um cinema
public class Exercicio02 {
    public static void main(String[] args) {
        int fileiras = 10;
        int cadeirasPorFileira = 8;

        int capacidade = fileiras * cadeirasPorFileira;

        System.out.printf(
            "A sala de cinema tem %d fileiras e %d cadeiras em cada.\n" +
            "A capacidade dessa sala é de 80 pessoas.",
            fileiras, cadeirasPorFileira, capacidade
        );
    }
}
