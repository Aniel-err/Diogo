import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {

        FuncionarioCLT funcionario1 = new FuncionarioCLT("Ana Souza", "123.456.789-00", 3000, 500);
        FuncionarioCLT funcionario2 = new FuncionarioCLT("Carlos Lima", "987.654.321-00", 4000, 700);


        FuncionarioPJ funcionario3 = new FuncionarioPJ("Marcos Silva", "456.789.123-00", 1500);
        FuncionarioPJ funcionario4 = new FuncionarioPJ("Fernanda Costa", "789.123.456-00", 1800);


        funcionario3.registrarProjeto();
        funcionario3.registrarProjeto(2); 

        funcionario4.registrarProjeto(4); 

      
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);

    
        gerarRelatorio();
    }

  
    public static void gerarRelatorio() {
        System.out.println("========== RELATÓRIO DE FUNCIONÁRIOS ==========");
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
        System.out.println("===============================================");
    }
}
