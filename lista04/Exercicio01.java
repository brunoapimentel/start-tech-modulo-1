package lista04;

// Imprime o maior e menor número entre os recebidos
public class Exercicio01 {
    public static void main(String[] args) {
        int numeros[] = new int[args.length];
        int maiorNumero;
        int menorNumero;

        for(int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        maiorNumero = numeros[0];
        menorNumero = numeros[0];

        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }

            if(numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.print("Os números de entrada foram: ");
        for(int i = 0; i < numeros.length; i++) {
            if(i == numeros.length - 2) {
                System.out.printf("%d e ", numeros[i]);
            } else if(i == numeros.length - 1) {
                System.out.printf("%d.\n", numeros[i]);
            } else {
                System.out.printf("%d, ", numeros[i]);
            }
        }

        System.out.printf("O maior número é o %d, e o menor número é o %d.", maiorNumero, menorNumero);
    }
}
