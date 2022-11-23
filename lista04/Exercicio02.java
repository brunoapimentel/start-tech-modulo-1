package lista04;

// Imprime um tabuleiro do jogo da velha
public class Exercicio02 {
    public static void main(String[] args) {
        String mensagemDeErro = "Deve-se informar 9 caracteres de entrada. " +
            "Os caracteres válidos são: \"o\", \"x\" e \"_\".";

        if(args.length != 9) {
            System.out.println(mensagemDeErro);
        } else {
            boolean caracteresValidos = true;

            for(String caractere : args) {
                if(!caractere.equals("x") && !caractere.equals("o") && !caractere.equals("_")) {
                    caracteresValidos = false;
                    break;
                }
            }

            if(caracteresValidos) {
                for(int i = 0; i < 3; i ++) {
                    int indice = i * 3;
                    System.out.printf(" %s | %s | %s \n", args[indice], args[indice + 1], args[indice + 2]);
                }
            } else {
                System.out.println(mensagemDeErro);
            }
        }
    }
}
