public class Desenvolvedor extends Funcionario {
    public String nome;

    public Desenvolvedor(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        return salarioBase * 1.10;
    }
}
