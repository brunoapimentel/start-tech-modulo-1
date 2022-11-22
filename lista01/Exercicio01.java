package lista01;

// Calcula a idade de uma pessoa baseado no seu ano de nascimento
public class Exercicio01 {
    public static void main(String[] args) {
        int anoDeNascimento = 1998;
        int anoAtual = 2022;

        int idade = anoAtual - anoDeNascimento;

        System.out.printf(
            "O ano de nascimento informado é %d.\n" +
            "A pessoa tem (ou vai completar) %d anos em %d.",
            anoDeNascimento, idade, anoAtual
        );
    }
}
