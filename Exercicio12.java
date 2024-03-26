import java.util.Scanner;

public class Exercicio12 {
    private int ano;
    private double valor;

    public Exercicio12(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return valor * 0.12; 
        } else {
            return valor * 0.07;
        }
    }

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int totalCarrosAte2000 = 0;
        double totalGeral = 0;

        char continuar;
        do {
            System.out.println("Digite o ano do carro:");
            int ano = scanner.nextInt();
            System.out.println("Digite o valor do carro:");
            double valor = scanner.nextDouble();

            Exercicio12 carro = new Exercicio12(ano, valor);
            double desconto = carro.calcularDesconto();
            double valorComDesconto = valor - desconto;

            System.out.println("Valor do desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorComDesconto);

            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral += valorComDesconto;

            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        System.out.println("Total de carros até o ano 2000: " + totalCarrosAte2000);
        System.out.println("Total geral a ser pago pelos clientes: R$" + totalGeral);

        scanner.close();
    }
}