import java.util.Scanner;

class Estudante {
    String nome;
    int matricula;
    double nota1, nota2, nota3;

    Estudante(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularNotaFinal() {
        return (nota1 + nota2 + nota3) / 3;
    }

    char calcularClassificacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8 && notaFinal <= 10) {
            return 'A';
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return 'B';
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return 'C';
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return 'D';
        } else {
            return 'R';
        }
    }

    void imprimirInformacoes() {
        double notaFinal = calcularNotaFinal();
        char classificacao = calcularClassificacao();
        System.out.println("Nome: " + nome);
        System.out.println("Número de Matrícula: " + matricula);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);
    }
}

public class Exercicio25 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de estudantes:");
        int numEstudantes = leitor.nextInt();

        Estudante[] estudantes = new Estudante[numEstudantes];

        for (int i = 0; i < numEstudantes; i++) {
            System.out.println("Digite o nome do estudante " + (i + 1) + ":");
            String nome = leitor.next();
            System.out.println("Digite o número de matrícula do estudante " + (i + 1) + ":");
            int matricula = leitor.nextInt();
            System.out.println("Digite as três notas do estudante " + (i + 1) + ":");
            double nota1 = leitor.nextDouble();
            double nota2 = leitor.nextDouble();
            double nota3 = leitor.nextDouble();

            estudantes[i] = new Estudante(nome, matricula, nota1, nota2, nota3);
        }

        System.out.println("\nInformações dos Estudantes:");
        for (Estudante estudante : estudantes) {
            estudante.imprimirInformacoes();
            System.out.println();
        }
    }
}
