package ExerciciosLista3.Exercicio1;

import java.util.Scanner;

public class Controller {
    private int MAX = 100;
    private Aluno alunos[];
    private int cont;

    private int menu() {
        String menu = "MENU\n" +
                "1 - Cadastrar Aluno\n" +
                "2 - Listar Alunos\n" +
                "3 - Relatorio Geral\n" +
                "9 - Sair\n";
        System.out.println(menu);
        System.out.println("\tEscolha uma opcao: ");
        try (Scanner sc = new Scanner(System.in)) {
            int op = Integer.parseInt(sc.nextLine());
            return op;
        }
    }

    public void executar() {
        System.out.println("\t\t\t Sistema de Academia");
        alunos = new Aluno[MAX];
        int op, idade;
        String id, nome;
        float peso, altura;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                op = menu();
                switch (op) {

                    case 1:
                        if (cont < MAX) {
                            System.out.println("Identificador do Aluno:");
                            id = sc.nextLine();
                            System.out.println("Nome do Aluno:");
                            nome = sc.nextLine();
                            System.out.println("Idade do Aluno:");
                            idade = Integer.parseInt(sc.nextLine());
                            System.out.println("Altura do Aluno:");
                            altura = Float.parseFloat(sc.nextLine());
                            System.out.println("Peso do Aluno:");
                            peso = Float.parseFloat(sc.nextLine());
                            alunos[cont] = new Aluno(id, nome, idade, altura, peso);
                            cont++;
                            break;
                        } else
                            System.out.println(" Nao ha espaco disponivel");
                    case 2:
                        if (cont > 0) {
                            System.out.println(" Alunos cadastrados no sistema :\n");
                            for (int i = 0; i < cont; i++) {
                                System.out.println(alunos[i].getId() + " - " + alunos[i].getNome());
                            }
                        } else
                            System.out.println("Nao ha alunos cadastrados");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Insira uma opcao valida");
                        break;

                }
            } while (op != 9);
        }
    }
}
