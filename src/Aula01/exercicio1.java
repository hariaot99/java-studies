package Aula01;
//classe referente a um aluno em uma escola/universidade e suas notas. (trabalhando com metodos e atributos)
public class exercicio1 {
    private String ra;
    private String name;
    private float t1;
    private float t2;
    private float n1;
    private float n2;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float media(){
        float media = (t1+t2+n1+n2)/4.0f;
        return media;
    }

    public boolean aprovado(){
        if (media() >= 5)
            return true;
        return false;
    }
}
