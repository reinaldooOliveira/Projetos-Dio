import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i, nome, agencia;
        int numero;
        double saldo;
        if (i.equals("sim")) {
            System.out.println("Digite o Número da Agência: ");
            agencia = scanner.next();

            System.out.println("Digite o Número da Conta: ");
            numero = scanner.nextInt();

            System.out.println("Digite Nome do Cliente: ");
             nome = scanner.next();

            System.out.println("Valor Depositado: ");
             saldo = scanner.nextDouble();


        }else{
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " +
                    "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        }
        
    }
}
