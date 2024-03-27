import java.util.Scanner;

class Calculo {

    public static void main(String[] args) {
        // Código do método main
    }

    public static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;

        double notaFinal = (notaLaboratorio * pesoLaboratorio + notaAvaliacaoSemestral * pesoAvaliacaoSemestral
                + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);

        return notaFinal;
    }
}


public class Exercicio24 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10):");
        double notaAvaliacaoSemestral = leitor.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10):");
        double notaExameFinal = leitor.nextDouble();

        double notaFinal = calcularNotaFinal(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);

        System.out.println("A nota final do estudante é: " + notaFinal);
    }

    public static double calcularNotaFinal(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;

        double notaFinal = (notaLaboratorio * pesoLaboratorio + notaAvaliacaoSemestral * pesoAvaliacaoSemestral
                + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);

        return notaFinal;
    }
}