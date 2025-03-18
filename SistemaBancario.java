import java.util.Scanner;

public class SistemaBancario {
    private static double saldo = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    transferir();
                    break;
                case 5:
                    System.out.println("Obrigado por usar nosso banco! Até mais.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void exibirMenu() {
        System.out.println("\n=== Sistema Bancário ===");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Sair");
    }

    private static void consultarSaldo() {
        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
    }

    private static void depositar() {
        System.out.print("Digite o valor para depósito: ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    private static void sacar() {
        System.out.print("Digite o valor para saque: ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    private static void transferir() {
        System.out.print("Digite o valor para transferência: ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Transferência de R$ %.2f realizada com sucesso!%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}

