package projeto.software.salario;

public class SalarioBase implements Salario {
    private double salario;

    public SalarioBase(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String getNome() {
        return "Salario Base";
    }
}
