package lista04;

import java.util.Scanner;

// Jogo da velha interativo
public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        boolean jogoFinalizado = false;
        boolean houveVelha = false;
        char jogadorDaVez = 'o';
        String mensagemFinal = "";
        int quantidadeJogadas = 0;

        // Preenche o tabuleiro com espaços
        for(int i = 0; i < tabuleiro.length; i++) {
            for(int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '_';
            }
        }

        do{
            System.out.printf("O jogador da vez é o %s.\n", jogadorDaVez);
            System.out.println("Digite a posição que quer jogar: (ex: a1) ");

            // Imprime o tabuleiro
            System.out.print("    a   b   c \n");
            for(int i = 0; i < 3; i ++) {
                System.out.printf("%d | %s | %s | %s \n", i + 1, tabuleiro[i][0], tabuleiro[i][1], tabuleiro[i][2]);
            }

            String entrada = scanner.nextLine().trim();
            int horizontal, vertical;

            // O switch retorna um valor específico caso o caractere 0 da entrada seja a, b ou c.
            // Em caso de um outro caractere, retornar -1.
            horizontal = switch(entrada.charAt(0)) {
                case 'a' -> 0;
                case 'b' -> 1;
                case 'c' -> 2;
                default -> -1; //
            };

            vertical = switch(entrada.charAt(1)) {
                case '1' -> 0;
                case '2' -> 1;
                case '3' -> 2;
                default -> -1;
            };

            if(horizontal == -1 || vertical == -1) {
                // Se a jogada for inválida, imprimir erro e ir para próxima volta do laço.
                System.out.println("Posição inválida!");
            } else if(tabuleiro[vertical][horizontal] != '_') {
                // Se a jogada for em um casa já ocupada, imprimir erro e ir para próxima volta do laço.
                System.out.println("Essa casa já está ocupada!");
            } else {
                // É uma jogada válida, então contabilizar a quantidade de jogadas.
                quantidadeJogadas++;
                // Preencher a casa do tabuleiro com símbolo do jogador da vez.
                tabuleiro[vertical][horizontal] = jogadorDaVez;

                // Verificar condições de vitória e empate
                if(tabuleiro[0][0] != '_' && tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2]) {
                    mensagemFinal = "Vitória na primeira linha.";
                    jogoFinalizado = true;
                } else if(tabuleiro[1][0] != '_' && tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2]) {
                    mensagemFinal = "Vitória na segunda linha.";
                    jogoFinalizado = true;
                } else if(tabuleiro[2][0] != '_' && tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2]) {
                    mensagemFinal = "Vitória na terceira linha.";
                    jogoFinalizado = true;
                } else if(tabuleiro[0][0] != '_' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
                    mensagemFinal = "Vitória na primeira diagonal.";
                    jogoFinalizado = true;
                } else if(tabuleiro[0][2] != '_' && tabuleiro[0][2] == tabuleiro[2][2] && tabuleiro[2][2] == tabuleiro[2][0]) {
                    mensagemFinal = "Vitória na segunda diagonal.";
                    jogoFinalizado = true;
                } else if(quantidadeJogadas == 9) {
                    mensagemFinal = "Velha! Não houveram vencedores.";
                    jogoFinalizado = true;
                    houveVelha = true;
                } else {
                    // Caso não haja uma condição de vitória ou empate, trocar o jogador ativo.
                    if(jogadorDaVez == 'o') {
                        jogadorDaVez = 'x';
                    } else {
                        jogadorDaVez = 'o';
                    }
                }
            }

        } while(!jogoFinalizado);

        System.out.println(mensagemFinal);
        if(!houveVelha) {
            System.out.printf("O vencedor foi o \"%s\".", jogadorDaVez);
        }

    }
}
