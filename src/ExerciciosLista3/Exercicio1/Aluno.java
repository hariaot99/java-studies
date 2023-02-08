package ExerciciosLista3.Exercicio1;

public class Aluno {
    private String id;
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Aluno() {
    }

    public Aluno(String id, String nome, int idade, float altura, float peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String maioridade() {
        if (idade >= 18) {
            return "Eh maior de idade";
        }
        return "Nao eh maior de didade";
    }

    public float imc() {
        return (peso / (float) Math.pow(altura, 2));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
