package ExerciciosLista2.Exercicio8;

public class Departamento {
    private String cod;
    private String nome;
    private String telefone;
    private Funcionario funcionarios[];
    private int cont;
    private int MAX;
    
    public Departamento(int MAX) {
        this.MAX = MAX;
        inicializar(MAX);
    }

    public Departamento(String cod, String nome, String telefone, int cont, int MAX) {
        this.cod = cod;
        this.nome = nome;
        this.telefone = telefone;
        this.cont = cont;
        this.MAX = MAX;
        inicializar(MAX);
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private void inicializar(int MAX) {
        this.MAX = MAX;
        funcionarios = new Funcionario[MAX];
        cont = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (cont < MAX){
            funcionarios[cont] = funcionario;
            cont++;
        }
        
    }

    public Funcionario buscarFuncionario(String nome){
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }
}
