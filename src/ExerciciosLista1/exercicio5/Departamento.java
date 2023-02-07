package ExerciciosLista1.exercicio5;

public class Departamento {
    private String cod;
    private String nome;
    private String telefone;
    private Funcionario funcionarios[];
    private int cont;
    private int MAX;

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

    public void inicializar(int MAX) {
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
