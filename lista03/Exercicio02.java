package lista03;

// Imprime uma escada com o número de degraus informados
public class Exercicio02 {
    public static void main(String[] args) {
        final int numero = Integer.parseInt(args[0]);

        String escada = "#";
        for(int i = 0; i < numero; i++) {
            System.out.println(escada);
            escada += "#";
        }
    }
}
