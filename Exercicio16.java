import java.util.Scanner;

public class Exercicio16 {

    static final double SALARIO_MINIMO = 1100.0; 

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int totalFuncionarios = 5;

        int funcmenos3 = 0;
        int func3e10 = 0;
        int func10e20 = 0;
        int funcmais20 = 0;

        for (int i = 1; i <= totalFuncionarios; i++) {
            System.out.println("\nFuncionário " + i + ":");
            System.out.print("Digite o salário do funcionário: ");
            double salario = leitor.nextDouble();

            double reajuste = calcularReajuste(salario);

            System.out.println("Reajuste: " + reajuste);

            if (salario < 3 * SALARIO_MINIMO) {
                funcmenos3++;
            } else if (salario >= 3 * SALARIO_MINIMO && salario <= 10 * SALARIO_MINIMO) {
                func3e10++;
            } else if (salario > 10 * SALARIO_MINIMO && salario <= 20 * SALARIO_MINIMO) {
                func10e20++;
            } else {
                funcmais20++;
            }
        }

        System.out.println("\nTotal de funcionários que ganham menos de três salários mínimos: " + funcmenos3);
        System.out.println("Total de funcionários que ganham entre três e dez salários mínimos: " + func3e10);
        System.out.println("Total de funcionários que ganham entre dez e vinte salários mínimos: " + func10e20);
        System.out.println("Total de funcionários que ganham mais de vinte salários mínimos: " + funcmais20);

        leitor.close();
    }

    public static double calcularReajuste(double salario) {
        if (salario < 3 * SALARIO_MINIMO) {
            return salario * 0.5; 
        } else if (salario >= 3 * SALARIO_MINIMO && salario <= 10 * SALARIO_MINIMO) {
            return salario * 0.2; 
        } else if (salario > 10 * SALARIO_MINIMO && salario <= 20 * SALARIO_MINIMO) {
            return salario * 0.15; 
        } else {
            return salario * 0.1; 
        }
    }
}

class Funcionario {
    static final double SALARIO_MINIMO = 1100.0;

    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
