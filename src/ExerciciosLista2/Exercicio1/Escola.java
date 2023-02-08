package ExerciciosLista2.Exercicio1;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        System.out.println(" \n\n\t\tMain Exercicio 1 Lista 2\n\n");
        System.out.println("Insira os dados:");
        Alunos aluno = new Alunos();
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("RA: ");
            String RA = entrada.nextLine();
            aluno.setRA(RA);
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            aluno.setNome(nome);
            System.out.print("Nota1: ");
            float n1 = entrada.nextFloat();
            aluno.setN1(n1);
            System.out.print("Nota2: ");
            float n2 = entrada.nextFloat();
            aluno.setN2(n2);
            System.out.print("Nota Trabalho 1: ");
            float t1 = entrada.nextFloat();
            aluno.setT1(t1);
            System.out.print("Nota Trabalho 2: ");
            float t2 = entrada.nextFloat();
            aluno.setT2(t2);
        }
        float media = aluno.media();
        String aprovado = aluno.aprovado();
        System.out.println("Nome: "+aluno.getNome()+"\t RA:"+aluno.getRA()+"\n"+media+" Situacao: "+aprovado);
    }
}
