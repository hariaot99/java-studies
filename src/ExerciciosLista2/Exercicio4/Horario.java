package ExerciciosLista2.Exercicio4;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        hora = 12;
        minuto = 0;
        segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int calcSegundos(){
        int segundos = 3600 * hora + 60 * minuto + segundo;
        return segundos;
    }

    public void exibir(){
        String h = Integer.toString(hora);
        String m = Integer.toString(minuto);
        String s = Integer.toString(segundo);

        if(hora<10){
            h = '0'+h;
        }
        if(minuto<10){
            m = '0'+m;
        }
        if(segundo<10){
            s = '0'+s;
        }
        System.out.println(h+":"+m+":"+s);
    }

}
