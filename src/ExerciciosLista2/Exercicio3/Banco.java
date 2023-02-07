package ExerciciosLista2.Exercicio3;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira os dados");
        System.out.println("Nome: ");
        cliente.setNome(entrada.nextLine());
        System.out.println("Codigo da Conta");
        cliente.setCodConta(entrada.nextLine());
        System.out.println("Primeiro deposito:");
        cliente.depositar(entrada.nextFloat());
        
        System.out.println("Nome: "+cliente.getNome()+" Codigo do Cliente: "+cliente.getCodConta()+" Saldo: "+cliente.getSaldo());

        System.out.println("Sacar:");
        cliente.sacar(entrada.nextFloat());
        
    }
}
