import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = leitor.nextDouble();
        
        System.out.println("Digite o total de vendas efetuadas pelo vendedor no mês (em dinheiro):");
        double totalVendas = leitor.nextDouble();
        
        Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);
        
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Salário fixo do vendedor: R$" + vendedor.getSalarioFixo());
        System.out.println("Salário no final do mês: R$" + vendedor.calcularSalarioFinal());
        
        leitor.close();
    }

    static class Vendedor {
        private String nome;
        private double salarioFixo;
        private double totalVendas;
        
        public Vendedor(String nome, double salarioFixo, double totalVendas) {
            this.nome = nome;
            this.salarioFixo = salarioFixo;
            this.totalVendas = totalVendas;
        }
        
        public String getNome() {
            return nome;
        }
        
        public double getSalarioFixo() {
            return salarioFixo;
        }
        
        public double calcularSalarioFinal() {
            return salarioFixo + (totalVendas * 0.15);
        }
    }
}