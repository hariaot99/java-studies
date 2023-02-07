package ExerciciosLista1.exercicio5;

public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario();
        f1.setCod("1");
        f1.setNome("Ricardo");
        f1.setFuncao("Tecnico em Informatica");
        f1.setSalario(3200);
        Funcionario f2 = new Funcionario();
        f2.setCod("2");
        f2.setNome("Diego");
        f2.setFuncao("Tecnico em Administracao");
        f2.setSalario(3200);
        Departamento d1 = new Departamento();
        d1.inicializar(20);
        d1.setCod("1");
        d1.setNome("DTI");
        d1.adicionarFuncionario(f1);
        d1.adicionarFuncionario(f2);
        Universidade u1 = new Universidade();
        u1.inicializar(5);
        u1.adicionarDepartamento(d1);

        Funcionario funcionario = d1.buscarFuncionario("Diego");
        System.out.println(funcionario.getNome() + "\t Codigo:" + funcionario.getCod());

        Departamento departamento = u1.buscarDepartamento("DTI");
        System.out.println(departamento.getCod()+"   "+departamento.getNome());
        
    }   

}
