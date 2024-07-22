import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner respostas = new Scanner(System.in);

        int numero;
        String agencia;
        String NomeCliente;
        double saldo;

        System.out.println("-------------Conta Bancária-------------");
        System.out.println("");
        System.out.println("Por favor, digite o número da Conta : ");
        numero = respostas.nextInt();


        System.out.println("Por favor, digite o número da Agência : ");
        agencia = respostas.next();


        System.out.println("Por favor, digite o seu nome : ");
        NomeCliente = respostas.next();


        System.out.println("Por favor, informe o seu saldo : ");
        saldo = respostas.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " reais já está disponível para saque.");




    }
}
