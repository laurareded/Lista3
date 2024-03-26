import java.util.Scanner;

class Aluno {

    private String nome;
    private double nota1, nota2, nota3;
    
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    
    public String getNome() {
        return nome;
    }
}


public class Exercicio01 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a nota da primeira prova:");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a nota da segunda prova:");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a nota da terceira prova:");
        double nota3 = leitor.nextDouble();
        

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        double media = aluno.calcularMedia();
        
        System.out.println("O(a) aluno(a) " + aluno.getNome() + " obteve média " + media);
        
        leitor.close();
    }
}
