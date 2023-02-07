package ExerciciosLista2.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Horario horas = new Horario();
        horas.exibir();
        System.out.println(horas.calcSegundos());
        Horario horas1 = new Horario(1, 30, 10);
        horas1.exibir();
        System.out.println(horas1.calcSegundos());
    }

}
