package ExerciciosLista2.Exercicio5;

import javax.naming.LimitExceededException;

public class Conta {
    public String titular;
    public double saldo;
    public double limite;

    public Conta() {
        saldo = 0;
        limite = 0;
    }
    
    public Conta(String titular, double saldo, double limite) {
        setTitular(titular);
        setSaldo(saldo);
        setLimite(limite);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }  

    public void depositar(float valor){
        saldo += valor;
    }

    public void sacar(float valor){
        if(saldo + limite - valor >= 0){
            saldo -= valor;
        }
        else System.out.println("Valor do saldo eh insuficiente para o saque");
    }
    public void exibir(){
        System.out.println("Titular: "+titular);
        System.out.println("Limite:"+ limite);
        System.out.println("Saldo:"+saldo);
    }
}
