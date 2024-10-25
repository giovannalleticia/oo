import java.util.Scanner;

public class App {
    
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        Conta[] contas;

        contas = new Conta[10];
        contas[0] = new Conta("banco do brasil", "12346", "123456789", "carlos", 0.0);
        contas[1] = new Conta ("inter", "123456", "123456789", "jose", 10.0);

        System.out.println(contas.length);
        for (int i = 0; i < contas.length; i++) {
        System.out.println("Qual é agencia do seu banco?");
        String agencia = teclado.nextLine();

            System.out.println("Qual é o número da conta?");
        String numero = teclado.nextLine();

            System.out.println("Qual é o cpf?");
        String cpf = teclado.nextLine();

            System.out.println("Qual é o nome do titular?");
        String titular = teclado.nextLine();

            System.out.println("qual é o saldo?");
        Double saldo = teclado.nextDouble();
        teclado.nextLine();
        // nextLine é usado para "limpar", quando não usado direto com String, tem que ser colocado em outra linha
        
        contas[i] = new Conta (agencia, numero, cpf, titular, saldo);
        }
        for (int i=0; i<contas.length; i++){
            System.out.println(contas[i].toString());
        }
        teclado.close();
    }
}