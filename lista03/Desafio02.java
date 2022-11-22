package lista03;

import java.util.Random;

// Sorteia grupos de dados e imprime a soma de cada grupo
public class Desafio02 {
    public static void main(String[] args) {
        int dados = Integer.parseInt(args[0]);
        int sorteios = Integer.parseInt(args[1]);
        Random random = new Random();

        for(int j = 0; j < sorteios; j++){
            int total = 0;
            for(int i = 0; i < dados; i++) {
                int numero = random.nextInt(1, 7);
                total += numero;

                if(i == dados - 1) {
                    System.out.printf("%d = ", numero);
                } else {
                    System.out.printf("%d + ", numero);
                }
            }

            System.out.printf("%d\n", total);
        }
    }
}
