package lista01.exercicio07;

// Calcula a quantidade de lugares em um cinema
public class Exercicio02 {
    public static void main(String[] args) {
        int fileiras = Integer.parseInt(args[0]);
        int cadeirasPorFileira = Integer.parseInt(args[1]);

        int capacidade = fileiras * cadeirasPorFileira;

        System.out.printf(
            "A sala de cinema tem %d fileiras e %d cadeiras em cada.\n" +
            "A capacidade dessa sala é de 80 pessoas.",
            fileiras, cadeirasPorFileira, capacidade
        );
    }
}
