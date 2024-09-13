import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {


        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o Primeiro Parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o Segundo Parâmetro: ");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Primeiro Paramêntro maior que o Segundo");
        }


    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; contagem != i; contagem--) {
                System.out.print(contagem + " ");
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
