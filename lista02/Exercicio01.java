package lista02;

// Calcula a média das notas de um aluno e determina se ele foi aprovado
public class Exercicio01 {
    public static void main(String[] args) {
        double nota1 = Integer.parseInt(args[0]);
        double nota2 = Integer.parseInt(args[1]);
        double nota3 = Integer.parseInt(args[2]);
        double nota4 = Integer.parseInt(args[3]);

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("As notas do aluno são: %.2f, %.2f, %.2f e %.2f.\n", nota1, nota2, nota3, nota4);
        System.out.printf("A média final é %.2f.\n", media);

        if(media >= 6) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O alno foi reprovado.");
        }
    }
}
