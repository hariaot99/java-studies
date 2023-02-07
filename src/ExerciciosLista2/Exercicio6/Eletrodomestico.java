package ExerciciosLista2.Exercicio6;

public class Eletrodomestico {
    private String nome;
    private float potencia;
    private float tempo;

    public Eletrodomestico() {
    }

    public Eletrodomestico(String nome, float potencia, float tempo) {
        this.nome = nome;
        this.potencia = potencia;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public float wattsDia(){
        return potencia*tempo;
    }
    public float wattsMes(){
        return wattsDia()*30; 
    }
    public float wattsAno(){
        return wattsMes()*12;
    }

    public float gastoMes(float precoKwatts){
        return wattsMes()/1000 * precoKwatts;
    }

    public void relatorio(float precoKwatts){
        System.out.println("Eletrodomestico: "+nome);
        System.out.println("Potencia do aparelho: "+potencia+"W");
        System.out.println("Tempo de utilizacao: "+tempo+"horas/dia");
        System.out.println("Watts/Dia: "+wattsDia()+"W");
        System.out.println("Watts/Mes: "+wattsMes()+"W");
        System.out.println("Watts/Ano: "+wattsAno()+"W");
        System.out.println("Preco kwatts R$: "+precoKwatts);
        System.out.println("Gasto Mensal R$: "+gastoMes(precoKwatts));
    }
}


