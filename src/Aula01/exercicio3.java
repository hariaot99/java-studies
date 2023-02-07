package Aula01;
//classe referente a um objeto "conta de banco" aprendendo a trabalhar com atributos e metodos
public class exercicio3 {
    private String numeroConta;
    private String nome;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        if(saldo - valor >= 0)
            saldo = saldo - valor;
    }

    }
