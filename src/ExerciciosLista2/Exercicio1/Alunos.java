package ExerciciosLista2.Exercicio1;

public class Alunos {
    private String RA;
    private String nome;
    private float n1;
    private float n2;
    private float t1;
    private float t2;

    public Alunos() {
    }

    public Alunos(String rA, String nome, float n1, float n2, float t1, float t2) {
        RA = rA;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.t1 = t1;
        this.t2 = t2;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getT1() {
        return t1;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }

    public float getT2() {
        return t2;
    }

    public void setT2(float t2) {
        this.t2 = t2;
    }

    public float media(){
        float media = (n1+n2+t1+t2)/(float)4;
        return media;
    }
    public String aprovado(){
        float media = media();
        if(media >= 5.0){
            return "aprovado";
        }
        return "reprovado";
    }
}
