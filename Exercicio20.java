import java.util.Scanner;
class Exercicio20 {
    private int nivel;

    public Exercicio20 (int nivel) {
        this.nivel = nivel;
    }

    public double calcularSalario(int horasAula) {
        double valorHoraAula = obterValorHoraAula();
        return valorHoraAula * horasAula;
    }

    private double obterValorHoraAula() {
        switch (nivel) {
            case 1:
                return 12.0;
            case 2:
                return 17.0;
            case 3:
                return 25.0;
            default:
                System.out.println("Nível inválido. Utilizando valor padrão de R$12,00 por hora/aula.");
                return 12.0;
        }
    }

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nível do professor (1, 2 ou 3):");
        int nivel = leitor.nextInt();

        System.out.println("Informe o número de horas/aula ministradas:");
        int horasAula = leitor.nextInt();

        Exercicio20 professor = new Exercicio20 (nivel);
        double salario = professor.calcularSalario(horasAula);

        System.out.println("O salário do professor é: R$" + salario);

        leitor.close();
    }
}
