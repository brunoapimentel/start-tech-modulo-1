package lista01.exercicio07;

// Calcula a idade de uma pessoa baseado no seu ano de nascimento
public class Exercicio01 {
    public static void main(String[] args) {
        int anoDeNascimento = Integer.parseInt(args[0]);
        int anoAtual = Integer.parseInt(args[1]);

        int idade = anoAtual - anoDeNascimento;

        System.out.printf(
            "O ano de nascimento informado é %d.\n" +
            "A pessoa tem (ou vai completar) %d anos em %d.",
            anoDeNascimento, idade, anoAtual
        );
    }
}
