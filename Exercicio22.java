import java.util.Scanner;

class ContaLuz {
    public double calcularValorConta(int tipoCliente, double quantidadeKwh) {
        double valorKwh = 0;

        switch (tipoCliente) {
            case 1:
                valorKwh = 0.60;
                break;
            case 2:
                valorKwh = 0.48;
                break;
            case 3:
                valorKwh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido. Utilizando valor padrão de R$0,60 por kWh.");
                valorKwh = 0.60;
                break;
        }

        return valorKwh * quantidadeKwh;
    }
}

public class Exercicio22 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria):");
        int tipoCliente = leitor.nextInt();

        System.out.println("Informe a quantidade de kWh consumidos:");
        double quantidadeKwh = leitor.nextDouble();

        ContaLuz contaLuz = new ContaLuz();
        double valorConta = contaLuz.calcularValorConta(tipoCliente, quantidadeKwh);

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        leitor.close();
    }
}

