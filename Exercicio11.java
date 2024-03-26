import java.util.Scanner;

public class Exercicio11 {
    private String nome;
    private char sexo; // 'M' para masculino, 'F' para feminino

    public Exercicio11 (String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void informarSexo() {
        if (sexo == 'M') {
            System.out.println(nome + " é homem.");
        } else if (sexo == 'F') {
            System.out.println(nome + " é mulher.");
        } else {
            System.out.println("Sexo inválido para " + nome);
        }
    }

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 56; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = leitor.nextLine();

            char sexo;
            do {
                System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
                sexo = leitor.next().toUpperCase().charAt(0);
            } while (sexo != 'M' && sexo != 'F');

            leitor.nextLine(); // Limpar o buffer do scanner

            Exercicio11 pessoa = new Exercicio11 (nome, sexo);
            pessoa.informarSexo();

            if (sexo == 'M') {
                totalHomens++;
            } else if (sexo == 'F') {
                totalMulheres++;
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        leitor.close();
    }
}
