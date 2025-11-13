public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[7];

        // === Preenchendo funcionarios ===
        // Desenvolvedores
        funcionarios[0] = new Desenvolvedor("Kitasan Black", 5000, 5);
        funcionarios[1] = new Desenvolvedor("Matikane Fukukitaru", 4500, 4);
        funcionarios[2] = new Desenvolvedor("Oguri Cap", 4725, 3);
        funcionarios[3] = new Desenvolvedor("Matikane Tannhauser", 4600, 2);
        funcionarios[4] = new Desenvolvedor("Haru Urara", 2500, 1);

        // Gerentes
        funcionarios[0] = new Gerente("Symboli Rudolf", 7000, 1000);
        funcionarios[1] = new Gerente("The Scout", 6750, 2000);
        
        // Calculo de funcionarios
        System.err.println("--- Calculando Salários ---");
        for (Funcionario f: funcionarios) {
            if (f != null) {
                f.calcularSalario();
            }
        }

        // Exibição das informações dos funcionários
        System.out.println("=== Informações dos funcionários ===");
        for (Funcionario f: funcionarios) {
            if (f != null) {
                f.mostrarInformacoes();
                System.out.println("---------------------------------------------------");
            }
        }
    }
}
