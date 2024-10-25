package aula2510.src;

import java.util.List;

public class App {

    public static void main(String[] args) {

        // declaração
        Conta minhaConta;
        Conta outraConta;
        

        // instanciar
        minhaConta = new Conta("1234", "34567", "123456789", "Maritza Silva", 100.0);
        outraConta = new Conta("5486", "2656", "265678901", "José Silva", 200.0);

        // O que acontece, se eu fizer um print de minhaConta.getTitular() ??

        System.out.println(minhaConta.getTitular());

        // inicializamos
        minhaConta.setAgencia("1234");
        minhaConta.setNumero("34567");
        minhaConta.setCpf("045.777.777-99");
        minhaConta.setTitular("Zé");
        minhaConta.setSaldo(100.0);

        outraConta.setAgencia("1234");
        outraConta.setNumero("34567");
        outraConta.setCpf("045.777.777-99");
        outraConta.setTitular("Zé");
        outraConta.setSaldo(100.0);



        Pessoa objPessoa = new Pessoa("João", "123456789");
        objPessoa.adicionarConta(minhaConta);
        objPessoa.adicionarConta(outraConta);

        List<Conta> listaContas = objPessoa.getContas();

        objPessoa.removeConta(minhaConta);


        List<Conta> contas = objPessoa.getContas();

        boolean outraContaEstaNaLista = listaContas.contains(outraConta);

        System.out.println("outraContaEstaNaLista: " + outraContaEstaNaLista);


        for (Conta conta : listaContas){
            if (conta.getNumero().equals("1234")){
                
        }



        minhaConta.sacar(10);

        System.out.println(minhaConta);

        minhaConta.depositar(50);

        System.out.println(minhaConta.toString());
      

    }
}