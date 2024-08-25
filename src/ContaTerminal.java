package src;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //faz a leitura dos dados no terminal
        Scanner scanner = new Scanner(System.in);

        //coleta os dados da conta bancária
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Pressione Enter para seguir...");
        scanner.nextLine(); //limpa o buffer do teclado

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        //fecha o scanner
        scanner.close();

        //Exibe a mensagem de boas vindas
        System.out.println("\nOla" + nomeCliente + ", obrigado por criar uma conta em banco! Sua agenda é " + agencia + ", sua conta é " + numeroConta + " e seu saldo é de R$" + saldo);

    }
}
