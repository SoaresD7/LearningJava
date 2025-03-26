public class Funcionario {
    protected String nome;
    protected Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario() {
        return salarioBase;
    }
}