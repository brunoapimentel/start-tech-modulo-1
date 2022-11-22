package lista03;

import java.util.Random;

// Conta as ocorrências de uma letra em uma palavra
public class Exercicio05 {
    public static void main(String[] args) {
        final String palavra = args[0];
        char letra;
        int ocorrencias = 0;

        if(args.length == 1) {
            System.out.printf("Você informou \"%s\".\n", palavra);
            System.out.print("Deve-se também informar uma letra para que o programa contabilize as ocorrências.");
        } else if(args[1].length() > 1) {
            System.out.printf("Você informou \"%s\" e \"%s\".\n", palavra, args[1]);
            System.out.print("Deve-se informar uma única letra para que o programa contabilize as ocorrências.");
        } else {
            letra = args[1].charAt(0);

            for(int i = 0; i < palavra.length(); i++) {
                if(palavra.charAt(i) == letra) {
                    ocorrencias++;
                }
            }

            if(ocorrencias == 0) {
                System.out.printf("Não existem ocorrências da letra \"%s\" na palavra \"%s\".", letra, palavra);
            } else if(ocorrencias == 1) {
                System.out.printf("Existe 1 ocorrência da letra \"%s\" na palavra \"%s\".", letra, palavra);
            } else {
                System.out.printf(
                    "Existe %d ocorrências da letra \"%s\" na palavra \"%s\".",
                    ocorrencias, letra, palavra
                );
            }

        }

    }
}
