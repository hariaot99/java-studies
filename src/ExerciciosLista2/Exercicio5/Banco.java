package ExerciciosLista2.Exercicio5;

public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.exibir();
        Conta conta1 = new Conta("Haria",3400,2000);
        conta1.sacar(5500);
        System.out.println(conta1.getSaldo());
    }
}
