package lista04;

// Imprime as palavras com mais letras dentre as informadas
public class Desafio01 {
    public static void main(String[] args) {
        String palavraComMaisLetras = "";
        int palavrasComAMesmaQuantidadeDeLetras = 0;

        for(String palavra : args) {
            if(palavra.length() > palavraComMaisLetras.length()) {
                palavraComMaisLetras = palavra;
                palavrasComAMesmaQuantidadeDeLetras = 1;
            } else if(palavra.length() == palavraComMaisLetras.length()) {
                palavrasComAMesmaQuantidadeDeLetras++;
            }
        }

        if(palavrasComAMesmaQuantidadeDeLetras > 1) {
            System.out.printf(
                "Existem %d palavra com %d letras:\n",
                palavrasComAMesmaQuantidadeDeLetras, palavraComMaisLetras.length()
            );

            for(String palavra : args) {
                if(palavra.length() == palavraComMaisLetras.length()){
                    System.out.println(palavra);
                }
            }
        } else {
            System.out.printf("A palavra com a maior quantidade de letras é \"%s\"", palavraComMaisLetras);
        }

    }
}
