package aula2510.src;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private List<Conta> contas;
    
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = nome;
        this.contas = new ArrayList<>();
    }
     public List<Conta> getContas() {
        return contas;
     }
     

     public boolean adicionarConta(Conta conta) {
        this.contas.add(conta);
        return true;
     }
     public boolean removeConta(Conta conta){
      this.contas.remove(conta);

      return true;
     }

     public String getNome() {
        return nome;
     }

     public void setNome(String nome) {
        this.nome = nome;
     }

     public String getCpf() {
        return cpf;
     }

     public void setCpf(String cpf) {
        this.cpf = cpf;
     }

     public String toString() {
        String texto = "Pessoa [nome: " + nome + ", cpf: " + cpf + "\ncontas: ";

        for (Conta conta : contas) {
            texto += conta.toString();
        }

        texto += "]";

        return texto;

    }

}
