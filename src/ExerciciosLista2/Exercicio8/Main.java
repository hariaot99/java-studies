package ExerciciosLista2.Exercicio8;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setCod("1");
        f1.setNome("Ricardo");
        f1.setFuncao("Tecnico em Informatica");
        

        Funcionario f2 = new Funcionario();
        f2.setCod("2");
        f2.setNome("Diego");
        f2.setFuncao("Tecnico em Administracao");
        

        Departamento d1 = new Departamento(50);
        d1.setCod("1");
        d1.setNome("DTI");
        d1.adicionarFuncionario(f1);
        d1.adicionarFuncionario(f2);
        Universidade u1 = new Universidade("Unesp", 5);
        u1.adicionarDepartamento(d1);

        Funcionario funcionario = d1.buscarFuncionario("Diego");
        System.out.println(funcionario.getNome() + "\t Codigo:" + funcionario.getCod());

        Departamento departamento = u1.buscarDepartamento("DTI");
        System.out.println(departamento.getCod() + "   " + departamento.getNome());
    }

}
