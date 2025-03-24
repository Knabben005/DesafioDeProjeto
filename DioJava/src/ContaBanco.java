import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%n", nome);
        System.out.printf("Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", agencia, numeroConta, saldo);
    }
}
