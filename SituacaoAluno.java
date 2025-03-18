import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();


        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();


        double media = (nota1 + nota2 + nota3) / 3;


        String situacao;
        if (media >= 70) {
            situacao = "Aprovado";
        } else if (media < 40) {
            situacao = "Reprovado";
        } else {
            situacao = "Final";
        }


        System.out.println("\nAluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
