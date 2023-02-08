package ExerciciosLista2.Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista(10);
        try (Scanner sc = new Scanner(System.in)) {
            String menu = "1 - Inserir\n" +
                    "2 - Buscar\n" +
                    "3 - Remover\n" +
                    "4 - Exibir lista\n"+
                    "5 - Sair\n";
            int op = 0;
            int elemento;
            do {
                System.out.println(menu);
                System.out.println("Opcao: ");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("\nINSERCAO\n");
                        System.out.println("\nInforme o elemento a ser inserido: ");
                        elemento = sc.nextInt();
                        l.adicionarElemento(elemento);
                        break;
                    case 2:
                        System.out.println("\nBUSCA");
                        System.out.println("\nInforme o elemento desejado: ");
                        elemento = sc.nextInt();
                        elemento = l.buscarElemento(elemento);
                        if(elemento < 0){
                            System.out.println("O elemento nao pertence a lista");
                        }else System.out.println("O elemento esta na posicao "+elemento);
                        break;
                    case 3:
                        System.out.println("\nREMOCAO");
                        System.out.println("\nInforme o elemento desejado: ");
                        elemento = sc.nextInt();
                        l.removerElemento(elemento);
                        System.out.println("\n Elemento removido da lista");
                        break;
                    case 4:
                        System.out.println("\nEXIBIR LISTA");
                        l.imprimir();
                        break;
                    default:
                        System.out.println("\nOpcao invalida");

                }
            } while (op != 5);
        }
    }

}
