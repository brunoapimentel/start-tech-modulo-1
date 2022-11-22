package lista03;

import java.util.Random;

// Sorteia diversos números e imprime a soma deles.
public class Exercicio03 {
    public static void main(String[] args) {
        final int quantidadeDeSorteios = Integer.parseInt(args[0]);
        Random random = new Random();

        System.out.printf("O número recebido foi o %d.\n", quantidadeDeSorteios);

        int total = 0;

        for(int i = 0; i < quantidadeDeSorteios; i++){
            int sorteio = random.nextInt(1, 7);

            total += sorteio;

            System.out.printf("O número %d foi sorteado!\n", sorteio);
        }

        System.out.println("A soma dos números sorteados é " + total);
    }
}
