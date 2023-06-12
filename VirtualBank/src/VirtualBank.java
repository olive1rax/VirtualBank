import java.util.scanner;

public class VirtualBank {
    public static void main(String[] args) {
        String name = "Kotlin";
        String tipoConta = "Corrente";
        double saldo = 1750.00;
        int opcao;

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
                """
        Scanner leitura = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}