package ExerciciosLista1.exercicio4;
//classe referente a uma lista de numeros e trabalhando em cima dela
public class exercicio4 {
    private int vetor[];
    private int cont;
    private int MAX;

    public void inicializar(int MAX) {
        this.MAX = MAX;
        vetor = new int[MAX];
        cont = 0;
    }

    public boolean listaVazia() {
        if (cont == 0)
            return true;
        return false;
    }

    public boolean listaCheia() {
        if (cont == MAX)
            return true;
        return false;
    }

    public int buscarElemento(int elemento) {
        if (!listaVazia()) {
            for (int i = 0; i < cont; i++) {
                if (vetor[i] == elemento)
                    return i;
            }
        }
        return -1;
    }

    public void adicionarElemento(int elemento) {
        if (!listaCheia()) {
            vetor[cont] = elemento;
            cont++;
        }
    }

    public void removerElemento(int elemento) {
        int posicao = buscarElemento(elemento);
        if (posicao != -1) {
            for (; posicao < cont; posicao++) {
                vetor[posicao] = vetor[posicao + 1];
            }
            cont--;
        }
    }

    public void imprimir() {
        if (!listaVazia()) {
            System.out.print("\n|");
            for (int i = 0; i < cont - 1; i++) {
                System.out.print(vetor[i] + ", ");
            }
            System.out.print(vetor[cont-1] + "|\n");
        } else
            System.out.println("| |\n");
    }

}
