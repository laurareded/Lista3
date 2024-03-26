import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a distância total percorrida (em km):");
        double distanciaPercorrida = leitor.nextDouble();
        
        System.out.println("Digite o total de combustível gasto (em litros):");
        double combustivelGasto = leitor.nextDouble();
        
        Automovel automovel = new Automovel(distanciaPercorrida, combustivelGasto);
        
        double consumoMedio = automovel.calcularConsumoMedio();
        
        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");
        
        leitor.close();
    }

    static class Automovel {
        private double distanciaPercorrida;
        private double combustivelGasto;
        
        public Automovel(double distanciaPercorrida, double combustivelGasto) {
            this.distanciaPercorrida = distanciaPercorrida;
            this.combustivelGasto = combustivelGasto;
        }
        
        public double calcularConsumoMedio() {
            return distanciaPercorrida / combustivelGasto;
        }
    }
}
