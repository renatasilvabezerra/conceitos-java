import java.util.Scanner; // precisa de entrada do usuário

public class Banco {
    private static final int LIMITE_SAQUES = 3;  // vai ser usado no if do método realizarSaque()
    private static final double LIMITE_SAQUE = 500.0;
    // private pq o acesso é dessa class banco
    
    /*Aqui, static indica que esses valores são compartilhados por todas as instâncias da classe Banco.

      Vantagens de usar static para constantes:

      ---> Redução de consumo de memória: Em vez de cada instância da classe armazenar sua própria cópia dessas variáveis, todas compartilham a mesma.

      ---> Facilidade de manutenção: Como são constantes (final), o valor não pode ser alterado acidentalmente.

      ---> Sem necessidade de instanciar a classe: Podemos acessar diretamente com Banco.LIMITE_SAQUES, sem precisar criar um objeto.

     */

    private double saldo = 0;
    private int numeroSaques = 0;
    private StringBuilder extrato = new StringBuilder();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            System.out.println("\n[s] Saque\n[d] Depósito\n[e] Extrato\n[q] Sair\n\n=> ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "d":
                    realizarDeposito();
                    break;
                case "s":
                    realizarSaque();
                    break;
                case "e":
                    exibirExtrato();
                    break;
                case "q":
                    System.out.println("\nSaindo do sistema. Até logo!");
                    return;
                default:
                    System.out.println("\nOperação inválida! Tente novamente.");
            }
        }
    }

    private void realizarDeposito() {
        System.out.print("\nInforme o valor do depósito: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        if (valor > 0) {
            saldo += valor;
            extrato.append(String.format("Depósito: R$ %.2f\n", valor));
            System.out.println(String.format("Depósito de R$ %.2f realizado com sucesso.", valor));
        } else {
            System.out.println("\nOperação inválida. Valor deve ser maior que zero.");
        }
    }

    private void realizarSaque() {
        if (numeroSaques >= LIMITE_SAQUES) {
            System.out.println("\nVocê já realizou o número máximo de saques diários.");
            return;
        }

        System.out.print("\nInforme o valor do saque: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        if (valor <= 0) {
            System.out.println("\nOperação inválida. Valor deve ser maior que zero.");
        } else if (valor > saldo) {
            System.out.println("\nSaldo insuficiente para realizar o saque.");
        } else if (valor > LIMITE_SAQUE) {
            System.out.println(String.format("\nValor excede o limite de R$ %.2f para saques.", LIMITE_SAQUE));
        } else {
            saldo -= valor;
            extrato.append(String.format("Saque: R$ %.2f\n", valor));
            numeroSaques++;
            System.out.println(String.format("Saque de R$ %.2f realizado com sucesso.", valor));
        }
    }

    private void exibirExtrato() {
        System.out.println("\n==========EXTRATO==========");
        System.out.println(extrato.length() == 0 ? "Não há movimentação." : extrato.toString());
        System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
        System.out.println("===========================\n");
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.exibirMenu();
    }
}
