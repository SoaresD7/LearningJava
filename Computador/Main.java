public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("Davi Soares");

        System.out.println(p1.getNome());

        Produto p2 = new Produto("Mouse", "Logitech", 100, 10);

        p2.ExibirProdutos();

        Produto p3 = new Hardware();

        p3.setQuantidade(10);

        Produto p4 = new Hardware("Memória Ram", "Kingston", 1000, 10, "ddr5 32gb 5000Ghz bala de mais da conta");

        p4.ExibirProdutos();

        Produto p5 = new Periférico("Teclado", "Red Dragon", 150, 10, "Wireless");

        p5.ExibirProdutos();



    }
}