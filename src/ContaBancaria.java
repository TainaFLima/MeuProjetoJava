import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Maria";
        String tipoConta = "Corrente";
        double saldo = 5689.67;
        int opcao = 0;

        System.out.println("**********");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo conta:" + tipoConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("\n**********");

        String menu = """
                *** Digite sua opção***
                1- Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1) {
                System.out.println("O saldo atualizado ´" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja tranferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo" + saldo);
                }
            } else if (opcao == 3){
                System.out.println ("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println ("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        }
    }
}
