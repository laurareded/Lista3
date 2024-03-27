import java.util.Scanner;

class Funcionario {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public String getNome() {
        return nome;
    }

    public double calcularAbono() {
        if (sexo == 'M' && idade >= 30) {
            return 100.0;
        } else if (sexo == 'M' && idade < 30) {
            return 50.0;
        } else if (sexo == 'F' && idade >= 30) {
            return 200.0;
        } else { 
            return 80.0;
        }
    }

    public double calcularSalarioLiquido() {
        double abono = calcularAbono();
        return salarioFixo + abono;
    }
}

public class Exercicio18 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        int idade = leitor.nextInt();

        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = leitor.next().charAt(0);

        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = leitor.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, sexo, salarioFixo);

        double salarioLiquido = funcionario.calcularSalarioLiquido();

        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido: " + salarioLiquido);

        leitor.close();
    }
}
