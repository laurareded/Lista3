import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de dólares disponíveis:");
        double quantidadeDolares = leitor.nextDouble();
        
        double valorEmReais = converterParaReais(cotacaoDolar, quantidadeDolares);
        
        System.out.println("O valor em reais é: R$" + valorEmReais);
        
        leitor.close();
    }

    static double converterParaReais(double cotacaoDolar, double quantidadeDolares) {
        return cotacaoDolar * quantidadeDolares;
    }
}
