package lista03;

// Imprime todos os números ímpares abaixo de `numero`
public class Exercicio01 {
    public static void main(String[] args) {
        final int numero = Integer.parseInt(args[0]);

        for(int i = 0; i < numero; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
