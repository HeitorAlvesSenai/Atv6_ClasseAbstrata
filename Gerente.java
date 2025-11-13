public class Gerente extends Funcionario{
    double salarioFinal, bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    // Calculo do seu salário atraves da soma do salário mais bônus
    @Override
    public void calcularSalario() {
        salarioFinal = salarioBase + bonus;
    }

    // Metodo para exibir as informações dos funcionarios.
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Cargo: Gerente | Bônus: R$" + bonus);
        System.out.printf("Salário Final: R$%.2f\n", salarioFinal);
    }
}
