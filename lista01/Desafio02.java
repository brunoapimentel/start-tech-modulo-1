package lista01;

// Calcula a quantidade de lugares em um cinema
// Também indica a quantidade reservada para PCDs
public class Desafio02 {
    public static void main(String[] args) {
        int fileiras = 10;
        int cadeirasPorFileira = 8;
        double reservaParaPCD = 0.1;

        int capacidade = fileiras * cadeirasPorFileira;
        double capacidadeParaPCD = capacidade * reservaParaPCD;

        System.out.printf(
            "A sala de cinema tem %d fileiras e %d cadeiras em cada.\n" +
            "A capacidade dessa sala é de %d pessoas, sendo que %.0f lugares são reservados para PCDs.",
            fileiras, cadeirasPorFileira, capacidade, capacidadeParaPCD
        );
    }
}
