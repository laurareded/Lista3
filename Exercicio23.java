import java.util.Scanner;

class Pessoa {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Pessoa(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPesoIdeal() {
        double pesoIdeal;
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else { // Sexo feminino
            if (altura > 1.50) {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            } else {
                pesoIdeal = (62.1 * altura) - 44.7;
            }
        }
        return pesoIdeal;
    }
}


public class Exercicio23 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa:");
        String nome = leitor.nextLine();

        System.out.println("Informe o sexo da pessoa (M ou F):");
        char sexo = leitor.next().charAt(0);

        System.out.println("Informe a altura da pessoa em metros:");
        double altura = leitor.nextDouble();

        System.out.println("Informe a idade da pessoa:");
        int idade = leitor.nextInt();

        Pessoa pessoa = new Pessoa(nome, sexo, altura, idade);
        double pesoIdeal = pessoa.calcularPesoIdeal();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        leitor.close();
    }
}

