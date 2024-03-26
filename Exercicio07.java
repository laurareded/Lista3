import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = leitor.nextDouble();
        
        double custoConsumidor = calcularCustoConsumidor(custoFabrica);
        
        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);
        
        leitor.close();
    }

    static double calcularCustoConsumidor(double custoFabrica) {
        double impostos = custoFabrica * 0.45;
        double custoDistribuidor = (custoFabrica + impostos) * 0.28;
        return custoFabrica + impostos + custoDistribuidor;
    }
}