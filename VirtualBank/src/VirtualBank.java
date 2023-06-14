import java.util.Scanner;

public class VirtualBank {
    public static void main(String[] args) {
        String name = "Kotlin";
        String tipoConta = "Corrente";
        double saldo = 1750.00;
        int opcao = 0;

        System.out.println("****************");
        System.out.println("\nNome: " + name);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n****************");

        String menu = """
                1 - Consultar saldo.
                2 - Transferência.
                3 - Depositar Valor.
                4 - Sair.
                """;
        Scanner leitura = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que você deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para realizar a transferência.");
                } else {
                    saldo -= valor;
                    String transString = String.format("Transferência realizada com sucesso, Seu novo saldo é: %f", saldo);
                    System.out.println(transString);
                }

            } else if (opcao == 3) {
                System.out.println("Qual o valor que você deseja depositar? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                String transString = String.format("Depósito efetuado, Seu novo saldo é: %f", saldo);
                System.out.println(transString);

            } else if (opcao == 4) {
                System.out.println("Aplicação encerrada.");

            } else if (opcao != 4) {
                System.out.println("Opção inválida, escolha outra ou encerre a aplicação.");
            }
        }
    }
}
