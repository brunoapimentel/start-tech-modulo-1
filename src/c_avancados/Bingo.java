package c_avancados;

/**
 * Crie um programa que realiza o sorteio de 20 números
 * de 1 à 50, de forma que um número sorteado não pode ser repetido.
 * 
 * Após o sorteio, o progama deve conferir uma cartela pré-determinada
 * e determinar o resultado dentre as possíveis opções:
 * 
 * - Bingo: cartela cheia
 * - Linha: linha cheia (vertical ou horizontal)
 * - Erro: nenhuma das anteriores
 *
 * O programa deve imprimir os números sorteados e o resultado.	
 */
public class Bingo {

	public static void main(String args[]) {
		int[][] cartela = {
			{10, 21, 34, 43},
			{7, 15, 11, 50},
			{41, 9, 33, 2},
			{1, 2, 34, 49}
		};
	}
}
