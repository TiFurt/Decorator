package projeto.software.salario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalarioTest {

    @Test
    void deveRetornarSalarioBase() {
        Salario salario = new SalarioBase(1000);
        assertEquals(1000, salario.calcularSalario());
    }

    @Test
    void deveRetornarSalarioBaseComDezAnosDeCasa() {
        Salario salario = new SalarioBase(1000);
        salario = new DezAnosDeCasa(salario);
        assertEquals(1500, salario.calcularSalario());
    }

    @Test
    void deveRetornarSalarioBaseComFuncionarioDoMes() {
        Salario salario = new SalarioBase(1000);
        salario = new FuncionarioDoMes(salario);
        assertEquals(1200, salario.calcularSalario());
    }

    @Test
    void deveRetornarSalarioBaseComDezAnosDeCasaEFuncionarioDoMes() {
        Salario salario = new SalarioBase(1000);
        Salario salarioComBonificacao = new FuncionarioDoMes(new DezAnosDeCasa(salario));
        assertEquals(1700, salarioComBonificacao.calcularSalario());
    }

    @Test
    void deveRetornarSalarioBaseCom2FuncionarioDoMesEDezAnosDeCasa() {
        Salario salario = new SalarioBase(1000);
        Salario salarioComBonificacao = new FuncionarioDoMes(new FuncionarioDoMes(new DezAnosDeCasa(salario)));
        assertEquals(1900, salarioComBonificacao.calcularSalario());
    }
}