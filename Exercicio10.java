import java.util.Scanner;

public class Exercicio10 {
    private int idade;

    public Exercicio10 (int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }


    public static void executar() {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantas pessoas deseja verificar?");
        int quantidadePessoas = leitor.nextInt();

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = leitor.nextInt();
            Exercicio10 pessoa = new Exercicio10(idade);
            pessoa.verificarIdade();
        }

        leitor.close();
    }
}

