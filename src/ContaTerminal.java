import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Digite o número do seu Banco: ");
        int numeroBanco = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o valor que gostaria de sacar: ");
        Double saldo = scanner.nextDouble();
        scanner.nextLine();
      
        //Exibir as mensagens para o nosso usuário.
        System.out.println("Olá, " + nomeCliente);
        System.out.println("Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia); 
        System.out.println("Número da sua conta: "  + numeroBanco);
        System.out.println("Sua conta foi criada com sucesso!");
        System.out.println("E seu saldo de: " + saldo + " Já está diposnível para saque.");
        //Obter pelo scanner os valores dígitados pelo terminal.

        //Exibir a mensagem conta criada.
        
    }
}
