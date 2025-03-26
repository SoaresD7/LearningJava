//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Carro();
        veiculos[1] = new Bicicleta();


        for (Veiculo v : veiculos) {
            v.mover();
        }
    }
}