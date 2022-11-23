package lista04;

import java.util.Random;

// Forma grupos aleatórios de 3 alunos
public class Exercicio03 {
    public static void main(String[] args) {
        int quantidadeDeGrupos = args.length / 3;
        Random random = new Random();
        String[][] grupos = new String[quantidadeDeGrupos][3];

        for(int i = 0; i < quantidadeDeGrupos; i++) {
            int alunosNoGrupo = 0;
            while(alunosNoGrupo < 3) {
                int sorteio = random.nextInt(0, args.length);

                if(!args[sorteio].equals("")) {
                    grupos[i][alunosNoGrupo] = args[sorteio];
                    alunosNoGrupo++;
                    args[sorteio] = "";
                }
            }
        }

        for(String[] grupo : grupos) {
            System.out.println("Grupo");
            for(String aluno : grupo) {
                System.out.println(aluno);
            }
        }

    }
}
