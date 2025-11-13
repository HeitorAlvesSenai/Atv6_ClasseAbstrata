public class Desenvolvedor extends Funcionario {
    double salarioFinal;
    int quantidadeProjetos;

    public Desenvolvedor(String nome, double salarioBase, int quantidadeProjetos) {
        super(nome, salarioBase);
        this.quantidadeProjetos = quantidadeProjetos;
    }

    // Calculo do salário atraves da multiplicação de quantidade de projetos vezes 500
    @Override
    public void calcularSalario() {
        salarioFinal = salarioBase + (quantidadeProjetos * 500);
    }

    // Metodo para exibir as informações dos funcionarios.
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Cargo: Desenvolvedor | Projetos: " + quantidadeProjetos);
        System.out.printf("Salário Final: RS%.2f\n", salarioFinal);
    }
}
