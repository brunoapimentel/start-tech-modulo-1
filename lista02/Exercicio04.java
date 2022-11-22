package lista02;

import java.util.Random;

// Sorteia um número e compara com o número apostado
public class Exercicio04 {
    public static void main(String[] args) {
        int aposta = Integer.parseInt(args[0]);

        System.out.printf("O número selecionado foi o %d.\n", aposta);

        if(aposta < 1 || aposta > 6) {
            System.out.println("Erro! Por favor, escolha um número entre 1 e 6.");
        } else {
            Random random = new Random();
            int sorteio = random.nextInt(1, 7);

            System.out.printf("O número sorteado foi o %d.\n", sorteio);

            if(aposta == sorteio) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
            }
        }
    }
}
