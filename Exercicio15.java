import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);
        double totalDesconto = 0;
        double totalPago = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.println("\nProduto " + i + ":");
            System.out.print("Digite o valor do veículo (ou 0 para encerrar): ");
            double valorVeiculo = leitor.nextDouble();
            if (valorVeiculo == 0) {
                break;
            }

            System.out.print("Digite o tipo de combustível (alcool, gasolina ou diesel): ");
            String tipoCombustivel = leitor.next().toLowerCase();

            double desconto = calcularDesconto(valorVeiculo, tipoCombustivel);
            double valorComDesconto = valorVeiculo - desconto;

            totalDesconto += desconto;
            totalPago += valorComDesconto;

            System.out.println("Valor do desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorComDesconto);
        }

        System.out.println("\nTotal de desconto dado aos clientes: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

        leitor.close();
    }

    public static double calcularDesconto(double valorVeiculo, String tipoCombustivel) {
        switch (tipoCombustivel) {
            case "alcool":
                return valorVeiculo * 0.25; 
            case "gasolina":
                return valorVeiculo * 0.21; 
            case "diesel":
                return valorVeiculo * 0.14; 
            default:
                System.out.println("Tipo de combustível invalido. Desconto nao calculado.");
                return 0;
        }
    }
}
