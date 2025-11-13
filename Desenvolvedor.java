public class Desenvolvedor extends Funcionario {
    double salarrioFinal;
    int quantidadeProjetos;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        salarrioFinal = salarioBase + (quantidadeProjetos + 500);
    }
}
