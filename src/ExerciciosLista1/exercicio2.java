package ExerciciosLista1;
//Classe referente a um aluno de academia
public class exercicio2 {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public boolean maior(){
        if (idade>= 18)
            return true;
        return false;
    }
    public float IMC(){
        return peso/(altura*altura);
    }
}
