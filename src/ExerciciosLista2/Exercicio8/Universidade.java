package ExerciciosLista2.Exercicio8;

public class Universidade {
    private String nome;
    private Departamento departamentos[];
    private int cont;
    private int MAX;

    

    public Universidade(int MAX) {
        this.MAX = MAX;
        inicializar(MAX);
    }
    

    public Universidade(String nome, int mAX) {
        this.nome = nome;
        MAX = mAX;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void inicializar(int MAX) {
        this.MAX = MAX;
        departamentos = new Departamento[MAX];
        cont = 0;
    }

    public void adicionarDepartamento(Departamento departamento) {
        if (cont < MAX) {
            departamentos[cont] = departamento;
            cont++;
        }

    }

    public Departamento buscarDepartamento(String nome) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].getNome().equals(nome)) {
                return departamentos[i];
            }
        }
        return null;
    }

    public Funcionario buscarFuncionario(String nome) {
        for (int i = 0; i < cont; i++) {
            Funcionario funcionario = departamentos[i].buscarFuncionario(nome);
            if (funcionario != null)
                return funcionario;
        }
        return null;
    }
}
