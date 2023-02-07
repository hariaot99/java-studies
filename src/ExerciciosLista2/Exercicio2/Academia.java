package ExerciciosLista2.Exercicio2;

import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        System.out.println(" \n\n\t\tMain Exercicio 2 Lista 2\n\n");
        System.out.println("Insira os dados:");
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        aluno.setNome(nome);
        System.out.print("Altura: ");
        float altura = entrada.nextFloat();
        aluno.setAltura(altura);
        System.out.print("Peso: ");
        float peso = entrada.nextFloat();
        aluno.setPeso(peso);
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        aluno.setIdade(idade);

        float imc = aluno.imc();
        String maioridade = aluno.maioridade();

        System.out.println("\t\nNome: "+aluno.getNome()+"  Idade: "+aluno.getIdade()
        +" Altura: "+aluno.getAltura()+" Peso: "+aluno.getPeso()+"\n Maioridade? "+maioridade+"\n IMC: "+imc);
    }
    
}
