package SintaxeJava;

import java.util.Scanner;

public class Sintaxe {
    public static void main(String[] args) {
        /* Introducao a tipos de dados */
        // int numAlunos;
        // float nota;
        // double saldo;
        // boolean flag;
        /* Atribuindo valor aos dados */
        //numAlunos = 30;
        //nota = 5.6f; // para diferenciar float de double e necessario colocar f ao final do valor
        //saldo = 5.6;
        //flag = true;
        float peso = 90.0f;
        float altura = 1.78f;
        float imc = peso / (altura * altura);
        imc = peso / (float) Math.pow(altura, 2); // pow retorna um double, porem imc ehh um float portanto precisa
                                                  // converter usando (float) ao chamar o metodo da classe Math

        String nome;// String eh uma classe de java
        nome = "Danilo";
        //Float f = 4.3f;
        /* Sout para exibir impressoes no terminal */
        System.out.println(imc);
        System.out.println("IMC: " + imc);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Nome: " + nome + "\nPeso: " + peso + "\nICMC: " + imc);

        /* Converter tipos */
        System.out.println("\n\nCONVERSAO DE TIPO");
        int n1;
        float n2;
        n2 = 10.4f;
        n1 = (int) n2; // conversao de tipos eh feita por meio de (int)/(float)/(double)
        // Houve a perca de dados, ja que de float para int perdesse a , e as casas
        // numericas
        float n3 = n1; // Voltou a ser float porem perdeu a casa numerica

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        /* Conversao de String -> Int/Float */
        String numero;
        numero = Integer.toString(n1); // Usasse a classe Integer e seu metodo toString para transformar uma string em
                                       // integer
        System.out.println("String int: " + numero);
        numero = Float.toString(n2); // Do mesmo jeito, existe a classe Float e seu metodo toString
        System.out.println("String float: " + numero);

        numero = "15"; // passando uma string para converter a integeer
        int n4 = Integer.parseInt(numero); // usasse o metodo parseInt da classe Integer
        System.out.println("Numerico da String: " + n4);
        numero = "15.5";
        System.out.println("Numerico Float da String: " + Float.parseFloat(numero)); // usasse o metodo parseFloat para
                                                                                     // converter string em float
        // Interessante de notar que todos contem numerais e digitos aceitos como float
        // e integer, caso tenha letras na String acontecera uma excessao

        /* Tratamento de Vetores e Matrizes em Java */
        System.out.println("\n\n\nVETOREs e MATRIZES");
        int vetor[]; // eh tratado como um ponteiro para uma area da memoria
        vetor = new int[10]; // instancia o objeto e o ponteiro passa a apontar para ele
        int vetor2[] = new int[20]; // declara o vetor e ja instancia o objeto

        int matriz[][]; // matriz nada mais eh que um vetor de 2 variaveis, se vetor[i] entao matriz[i][j]
        matriz = new int[5][3];

        for (int i = 0; i < 10; i++) { // populando um vetor de tamanho maximo 10
            vetor[i] = i;
        }

        for (int i = 0; i < vetor2.length; i++) { // populando um vetor com seu tamanho maximo definido la em cima (linha 67)
            vetor[i] = i;
        }

        for (int i = 0; i < matriz.length; i++) { //populando a matriz i j com o tamanho maximo definido la em cima (linha 69)
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j; // apenas um exemplo em que popula-se a matriz multiplicando o item da linha pelos da coluna
            }
        }

        System.out.println(vetor); // imprime apenas o hash referente ao endereco de memmoria que o ponteiro vetor aponta
        System.out.println(matriz); // imprime apenas o hash referente ao endereco de memmoria que o ponteiro matriz aponta
 
        for (int i = 0; i < vetor.length; i++) { // impressao correta dos elementos  de um vetor, percorre cada posicao do vetor e imprime
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("\n\n");
        for (int i = 0; i < matriz.length; i++) { // impressao correta de uma matriz, percorre as linhas e colunas da matriz e imprime cada elemento
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("\n");
        }

        System.out.println("\n\n");
        int i = 0;

        while (i < vetor.length) { // impressao ultilizando while em vez de for
            System.out.println(vetor[i]);
            i++;
        }

        i = 0;
        do { // impressao ultilizando do while 
            System.out.println(vetor[i]);
            i++;
        } while (i < vetor.length);

        /* Condicionais */
        int idade = 10;
        if (idade >= 18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }

        if (idade < 10) {
            System.out.println("Infantil");
        } else if (idade >= 10 && idade < 18) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }

        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Opt 1");
                break;
            case 2:
                System.out.println("Opt 2");
                break;
            case 3:
                System.out.println("Opt 3");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }

        System.out.println("\n\nENTRADA de DADOS");
        try (Scanner entrada = new Scanner(System.in)) {
            float nota1, nota2;
            System.out.print("Nota1: ");
            nota1 = entrada.nextFloat();
            System.out.print("Nota2: ");
            nota2 = entrada.nextFloat();
            float media = (nota1 + nota2) / 2.0f;
            System.out.println("Nota1: " + nota1);
            System.out.println("Nota2: " + nota2);
            System.out.println("Media: " + media);
            entrada.nextLine();
            System.out.print("Nome: ");
            nome = entrada.nextLine();
            System.out.print("Idade: ");
            idade = entrada.nextInt();
        }
        System.out.println("Nome: " + nome + " Idade: " + idade);

    }
}
