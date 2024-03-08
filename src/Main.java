import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nome_cliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite a Agência !");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu nome !");
        nome_cliente = sc.nextLine();
        System.out.println("Por favor, digite o seu saldo !");
        saldo = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque"
        ,nome_cliente,agencia,numero,saldo);
        System.out.println();
        sc.close();
    }
}