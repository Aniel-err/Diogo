public class FuncionarioPJ extends Funcionario {
    private double valorPorProjeto;
    private int quantidadeProjetos;

    public FuncionarioPJ(String nome, String cpf, double valorPorProjeto) {
        super(nome, cpf);
        this.valorPorProjeto = valorPorProjeto;
        this.quantidadeProjetos = 0;
    }


    public void registrarProjeto() {
        quantidadeProjetos++;
    }

    public void registrarProjeto(int quantidade) {
        if (quantidade > 0) {
            quantidadeProjetos += quantidade;
        }
    }

    @Override
    public double calcularSalario() {
        return valorPorProjeto * quantidadeProjetos;
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Regime: PJ" +
               " | Valor por Projeto: R$" + valorPorProjeto +
               " | Projetos Entregues: " + quantidadeProjetos +
               " | Salário Final: R$" + calcularSalario();
    }
}
