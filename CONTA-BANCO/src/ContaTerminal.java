import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o Número da Agência: ");
            String agencia = scanner.next();

            System.out.println("Digite o Número da Conta: ");
            int numero = scanner.nextInt();

            System.out.println("Digite Nome do Cliente: ");
            String nome = scanner.next();

            System.out.println("Valor Depositado: ");
            double saldo;
            saldo = scanner.nextDouble();

            System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", " +
                    "conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque");

        }
        catch ( InputMismatchException e){

            System.out.println("Favor Verificar, dados adicionado incorretamente !");
        }


        
    }
}
