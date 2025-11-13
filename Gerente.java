public class Gerente extends Funcionario{
    double salarrioFinal, bonus;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        salarrioFinal = salarioBase + bonus;
    }
}
