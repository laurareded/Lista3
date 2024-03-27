import java.util.Scanner;

class Funcionario {
    private String nome;
    private double salario;
    private double salarioMinimo;

    public Funcionario(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularNovoSalario() {
        double percentualReajuste;
        if (salario < 3 * salarioMinimo) {
            percentualReajuste = 0.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            percentualReajuste = 0.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            percentualReajuste = 0.15;
        } else {
            percentualReajuste = 0.1;
        }
        return salario * (1 + percentualReajuste);
    }
}

public class Exercicio17 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = leitor.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        double salario = leitor.nextDouble();
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = leitor.nextDouble();

        double novoSalario = calcularNovoSalario(salario, salarioMinimo);

        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário reajustado: " + novoSalario);
        System.out.println("Reajuste: " + (novoSalario - salario));
        
        double aumentoFolha = novoSalario - salario;
        System.out.println("Aumento na folha de pagamento: " + aumentoFolha);

        leitor.close();
    }

    public static double calcularNovoSalario(double salario, double salarioMinimo) {
        double percentualReajuste;
        if (salario < 3 * salarioMinimo) {
            percentualReajuste = 0.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            percentualReajuste = 0.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            percentualReajuste = 0.15;
        } else {
            percentualReajuste = 0.1;
        }
        return salario * (1 + percentualReajuste);
    }
}


