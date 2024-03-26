import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);
        
        int totalPessoas = lerTotalPessoas(leitor);
        int totalAptas = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("\nDados da pessoa " + (i + 1) + ":");
            String nome = lerNome(leitor);
            char sexo = lerSexo(leitor);
            int idade = lerIdade(leitor);
            boolean saude = lerSaude(leitor);

            boolean apto = verificarAptidao(idade, saude);
            if (apto) {
                System.out.println(nome + " está apto para o serviço militar.");
                totalAptas++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar.");
            }
        }

        System.out.println("\nTotal de pessoas aptas para o serviço militar: " + totalAptas);
        System.out.println("Total geral de pessoas: " + totalPessoas);

        leitor.close();
    }

    static int lerTotalPessoas(Scanner scanner) {
        System.out.println("Digite o número de pessoas:");
        return scanner.nextInt();
    }

    static String lerNome(Scanner scanner) {
        System.out.println("Digite o nome:");
        return scanner.next();
    }

    static char lerSexo(Scanner scanner) {
        System.out.println("Digite o sexo (M/F):");
        return scanner.next().toUpperCase().charAt(0);
    }

    static int lerIdade(Scanner scanner) {
        System.out.println("Digite a idade:");
        return scanner.nextInt();
    }

    static boolean lerSaude(Scanner scanner) {
        System.out.println("A saúde está boa? (true/false):");
        return scanner.nextBoolean();
    }

    static boolean verificarAptidao(int idade, boolean saude) {
        return idade >= 18 && saude;
    }
}
