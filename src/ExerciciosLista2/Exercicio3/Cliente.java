package ExerciciosLista2.Exercicio3;

public class Cliente {
    private String nome;
    private String codConta;
    private float saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodConta() {
        return codConta;
    }

    public void setCodConta(String codConta) {
        this.codConta = codConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void sacar(float saque) {
        if (saldo >= saque) {
            saldo -= saque;
        }
    }
    
    public void depositar(float deposito){
        saldo += deposito;
    }
}
