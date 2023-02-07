package ExerciciosLista1.exercicio4;

// basicamente um controller para a classe exercicio04
public class exercicio04Main {
    public static void main(String[] args) throws Exception {

        exercicio4 exercico = new exercicio4();
        exercico.inicializar(10);
        exercico.adicionarElemento(5);
        exercico.imprimir();
        exercico.adicionarElemento(4);
        exercico.adicionarElemento(3);
        exercico.adicionarElemento(2);
        exercico.adicionarElemento(1);
        exercico.imprimir();
        exercico.removerElemento(3);
        exercico.imprimir();

    }
}
