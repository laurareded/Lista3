import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Produto[] produtos = new Produto[40];
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.print("Preço de custo: R$");
            double precoCusto = leitor.nextDouble();
            somaPrecoCusto += precoCusto;

            System.out.print("Preço de venda: R$");
            double precoVenda = leitor.nextDouble();
            somaPrecoVenda += precoVenda;

            produtos[i] = new Produto(precoCusto, precoVenda);
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + ": " + produtos[i].analisarLucroPrejuizo());
        }

        double mediaPrecoCusto = somaPrecoCusto / produtos.length;
        double mediaPrecoVenda = somaPrecoVenda / produtos.length;

        System.out.println("\nMédia do preço de custo: R$" + mediaPrecoCusto);
        System.out.println("Média do preço de venda: R$" + mediaPrecoVenda);

        leitor.close();
    }
}

class Produto {
    private double precoCusto;
    private double precoVenda;

    public Produto(double precoCusto, double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String analisarLucroPrejuizo() {
        if (precoVenda > precoCusto) {
            return "Lucro";
        } else if (precoVenda < precoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }
}
