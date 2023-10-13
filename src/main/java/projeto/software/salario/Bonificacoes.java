package projeto.software.salario;

public abstract class Bonificacoes implements Salario {
    protected Salario salario;

    public Bonificacoes(Salario salario) {
        this.salario = salario;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public abstract double calcularBonificacao();

    public double calcularSalario() {
        return this.salario.calcularSalario() + this.calcularBonificacao();
    }

    public abstract String getNomeBonificacao();

    public String getNome() {
        return this.salario.getNome() + " + " + this.getNomeBonificacao();
    }
}
