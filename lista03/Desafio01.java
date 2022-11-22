package lista03;

// Imprime todos os números primos abaixo de um número informado
public class Desafio01 {
    public static void main(String[] args) {
        int numeroFinal = Integer.parseInt(args[0]);

        // esse laço testa todos os números menores ou iguais ao numeroFinal
        for(int numeroAtual = 1; numeroAtual <= numeroFinal; numeroAtual++){
            boolean ePrimo = true; // assumimos que o número é primo antes de iniciar o laço

            // esse laco percorre do numero 2 até um número abaixo do numeroAtual
            for(int i = 2; i < numeroAtual; i++){

                // se qualquer número for capaz de dividir o numeroAtual, ele não é primo
                if(numeroAtual % i == 0){
                    ePrimo = false;
                    break; // se descobrimos que o número não é primo, podemos parar o laço
                }
            }

            if(ePrimo){
                System.out.println(numeroAtual);
            }
        }
    }
}
