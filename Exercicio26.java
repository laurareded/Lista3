import java.util.Scanner;

class Seguro {
    static int determinarCategoria(int idade, int grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            return grupoRisco + 0;
        } else if (idade >= 21 && idade <= 24) {
            return grupoRisco + 1;
        } else if (idade >= 25 && idade <= 34) {
            return grupoRisco + 2;
        } else if (idade >= 35 && idade <= 64) {
            return grupoRisco + 3;
        } else if (idade >= 65 && idade <= 70) {
            return grupoRisco + 6;
        } else {
            return -1; // Fora da faixa de idade
        }
    }
}

class Pretendente {
    String nome;
    int idade;
    int grupoRisco;

    Pretendente(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }
}

public class Exercicio26 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = leitor.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("Desculpe, o pretendente não se enquadra em nenhuma das categorias ofertadas.");
            return;
        }

        System.out.println("Digite o grupo de risco do pretendente (baixo=1, médio=2, alto=3):");
        int grupoRisco = leitor.nextInt();

        int categoria = Seguro.determinarCategoria(idade, grupoRisco);

        if (categoria != -1) {
            System.out.println("Dados do pretendente:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Grupo de Risco: " + grupoRisco);
            System.out.println("Categoria do Seguro: " + categoria);
        } else {
            System.out.println("Desculpe, o pretendente não se enquadra em nenhuma das categorias ofertadas.");
        }
    }
}
