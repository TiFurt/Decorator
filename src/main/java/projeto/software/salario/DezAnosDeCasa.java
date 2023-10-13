package projeto.software.salario;

public class DezAnosDeCasa extends Bonificacoes {
    public DezAnosDeCasa(Salario salario) {
        super(salario);
    }

    @Override
    public double calcularBonificacao() {
        return 500;
    }

    @Override
    public String getNomeBonificacao() {
        return "10 anos de casa";
    }
}
