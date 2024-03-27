import java.util.Scanner;

class Nadador {
    public void classificar(int idade) {
        if (idade >= 5 && idade <= 7) {
            System.out.println("O nadador está na categoria Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("O nadador está na categoria Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("O nadador está na categoria Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("O nadador está na categoria Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("O nadador está na categoria Sênior");
        } else {
            System.out.println("Idade fora da faixa etária.");
        }
    }
}


public class Exercicio21 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = leitor.nextInt();

        Nadador nadador = new Nadador();
        nadador.classificar(idade);

        leitor.close();
    }
}
