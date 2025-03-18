import java.util.Scanner;

class Produto{
    private String nome;
    private double preco;
    private int quantidade;

public Produto(String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;

}

public void AdicionarEstoque(int quantidade){
    if (quantidade >0) {
    this.quantidade += quantidade;
    System.out.println(quantidade + " unidades adicionais ao estoque.");
    } else {
    System.out.println("Quantiade invalida para adicionar ao estoque.");
    }
}

public void vender(int quantidade) {
    if (quantidade > 0 && quantidade <= this.quantidade) {
    this.quantidade -= quantidade;
    System.out.println(quantidade + "unidades vendidas.");
    } else {
    System.out.println("Quantidade invalida ou estoque insuficiente.");
   }
}

public void ExibirEstoque() {
    System.out.println("Produto: " + nome);
    System.out.println("Preço R$" + preco);
    System.out.println("Quantidade em estoque" + quantidade);
  }
}

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome do produto: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o preco do produto: ");
    double preco = scanner.nextDouble();

    System.out.print("Digite a quantidade inicial em estoque: ");
    int quantidade = scanner.nextInt();

Produto produto = new Produto (nome, preco, quantidade);

int opcao;
    do{
    System.out.println("\n escolha uma opção:");
    System.out.println("1 - Adicionar estoque: ");
    System.out.println("2 - Vender produto: ");
    System.out.println("3 - Exibir estoque: ");
    System.out.println("4 - sair ");
    System.out.println(" opcao: ");
    opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            System.out.print(" Quantidade adicionar: ");
            int qtdAdd = scanner.nextInt();
            produto.AdicionarEstoque(qtdAdd);
            break;
        case 2:
            System.out.print("Quantidade a vender: ");
            int qtdVenda = scanner.nextInt();
            produto.vender(qtdVenda);
            break;
        case 3:
            produto.ExibirEstoque();
            break;
        case 4:
            System.out.println("Saindo...");
            break;
        default:
            System.out.println("Opção inválida!");
    }
    } while (opcao != 4);

        scanner.close();
    }
}
