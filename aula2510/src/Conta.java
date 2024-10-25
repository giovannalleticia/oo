package aula2510.src;

public class Conta {

    // atributos=variáveis
    private String agencia;
    private String numero;
    private String cpf;
    private String titular;
    private double saldo;


    public Conta(String agencia, String numero, String cpf, String titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cpf = cpf;
        this.titular = titular;
        this.saldo = saldo;
    }

    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

    public Conta(String agencia, String numero) {
        // this.agencia = agencia;
        // this.numero = numero;
        // this.titular = "";
        // this.saldo = 0;
        // this.cpf = "";

        this(agencia, numero, "", "", 0);
    }

    
    // Método que pega o nome do titular
    public String getTitular() {
        return this.titular;
    }

    // Métodos Set
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // métodos=função
    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    public String toString() {
        String str;

        str = "6" +
                "\n\tAgencia:" + agencia +
                "\n\tNumero:" + numero +
                "\n\tTitular:" + titular +
                "\n\tCpf:" + cpf +
                "\n\tSaldo:" + saldo;

        return str;
    }

}