public class Conta {

    //Atributos
    public String agencia;
    public String numero;
    public String cpf;
    public String titular;
    public double saldo;

    //método = função
    void sacar(double valor){
        saldo = saldo - valor;
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }
    public Conta (String agencia, String numero, String cpf, String titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cpf = cpf;
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }

    public String toString(){
        String str;

        str = "Minha Conta:" +
                "\n\tAgencia: " +agencia+
                "\n\tNumero: " +numero+
                "\n\tTitular: " +titular+
                "\n\tCpf: " +cpf+
                "\n\tSaldo: " +saldo;

        return str;
    }
}