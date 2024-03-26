import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        double nota3 = leitor.nextDouble();
        
        double media = calcularMedia(nota1, nota2, nota3);
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Media do aluno: " + media);
        System.out.println("Situacao: " + verificarMencao(media));
        
        leitor.close();
    }

    static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
    
    static String verificarMencao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperacao";
        }
    }
}
