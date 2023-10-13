package projeto.software.salario;

public class FuncionarioDoMes extends Bonificacoes {
    public FuncionarioDoMes(Salario salario) {
        super(salario);
    }

    @Override
    public double calcularBonificacao() {
        return 200;
    }

    @Override
    public String getNomeBonificacao() {
        return "Funcionario do Mes";
    }
}
