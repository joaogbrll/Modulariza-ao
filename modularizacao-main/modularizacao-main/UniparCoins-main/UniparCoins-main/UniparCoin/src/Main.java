import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarteiraDigital carteira = new CarteiraDigital();
        int opcao;

        System.out.println("Bem-vindo à sua Carteira Digital!");

        do {
            menu();
            opcao = lerEntradaUsuario(scanner);

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar ao saldo: ");
                    double valorAdicionar = scanner.nextDouble();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;

                case 2:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;

                case 3:
                    System.out.println("Seu saldo atual é: R$" + carteira.verificarSaldo());
                    break;

                case 4:
                    System.out.println("Obrigado por usar a sua Carteira Digital!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }

    private static void menu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Realizar Pagamento");
        System.out.println("3 - Verificar Saldo");
        System.out.println("4 - Sair");
    }

    private static int lerEntradaUsuario(Scanner scanner) {
        System.out.print("Usuário: ");
        return scanner.nextInt();
    }
}

