public class FuncionarioCLT extends Funcionario {
    private double salarioBase;
    private double bonus;

    public FuncionarioCLT(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + 
               " | Regime: CLT" + 
               " | Salário Base: R$" + salarioBase + 
               " | Bônus: R$" + bonus + 
               " | Salário Final: R$" + calcularSalario();
    }
}
