package lista02;

import java.util.Random;

// Sorteia três números e os compara com o número apostado
public class Desafio02 {
    public static void main(String[] args) {
        int aposta = Integer.parseInt(args[0]);

        System.out.printf("O número selecionado foi o %d.\n", aposta);

        if(aposta < 1 || aposta > 6) {
            System.out.println("Erro! Por favor, escolha um número entre 1 e 6.");
        } else {
            Random random = new Random();
            int sorteio1 = random.nextInt(1, 7);
            int sorteio2 = random.nextInt(1, 7);
            int sorteio3 = random.nextInt(1, 7);

            System.out.printf("O números sorteados foram: %d, %d e %d.\n", sorteio1, sorteio2, sorteio3);

            int acertos = 0;

            if(aposta == sorteio1) {
                acertos++;
            }

            if(aposta == sorteio2) {
                acertos++;
            }

            if(aposta == sorteio3) {
                acertos++;
            }

            if(acertos == 1) {
                System.out.printf("Você teve 1 acerto!");
            } else if(acertos > 1) {
                System.out.printf("Você teve %d acertos!", acertos);
            } else {
                System.out.println("Voce não teve nenhum acerto.");
            }
        }
    }
}
