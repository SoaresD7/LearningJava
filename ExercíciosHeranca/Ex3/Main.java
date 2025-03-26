public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arthur Guilherme", 3000.0);
        Gerente gerente = new Gerente("Paulo Roberto", 5000.0, 2000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Davi Soares", 4000.0);

        System.out.println("Salário do Funcionário " + funcionario.nome + ": R$ " + funcionario.calcularSalario());
        System.out.println("Salário do Gerente " + gerente.nome + ": R$ " + gerente.calcularSalario());
        System.out.println("Salário do Desenvolvedor " + desenvolvedor.nome + ": R$ " + desenvolvedor.calcularSalario());
    }
}