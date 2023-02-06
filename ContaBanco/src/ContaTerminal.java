import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir mensagens para usuario
        //Obter os valores digitados no terminal
        //Exibir a mensagem final de conta criada


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o numero da agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("Informe o numero da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Informe o valor do deposito: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %d, conta %d e seu saldo de %.2f ja esta disponivel para saque", nome, agencia, conta, saldo);

        scanner.close();
    }
}
