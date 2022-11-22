package lista03;

import java.util.Random;

// Sorteia um dado até que o número informado seja encontrado
public class Exercicio04 {
    public static void main(String[] args) {
        final int numeroDesejado = Integer.parseInt(args[0]);
        int numeroSorteado;
        int numeroDeSorteios = 0;
        String mensagemFinal;
        Random random = new Random();

        System.out.printf("O número informado foi o %d.\n", numeroDesejado);

        if(numeroDesejado < 1 || numeroDesejado > 6) {
            System.out.println("Erro! Por favor, escolha um número entre 1 e 6.");
        } else {
            do {
                numeroDeSorteios++;
                numeroSorteado = random.nextInt(1, 7);
                System.out.printf("O número sorteado foi o %d.\n", numeroSorteado);
            } while(numeroSorteado != numeroDesejado);

            if(numeroDeSorteios == 1) {
                mensagemFinal = "Foi necessário %d sorteio para que o número %d fosse sorteado.";
            } else {
                mensagemFinal = "Foram necessários %d sorteios para que o número %d fosse sorteado.";
            }

            System.out.printf(mensagemFinal, numeroDeSorteios, numeroSorteado);
        }
    }
}
