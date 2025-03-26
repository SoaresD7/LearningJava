public class Produto {
    private String Nome;
    private String Marca;
    private double Valor;
    private int Quantidade;

    public Produto(String nome, String marca, double valor, int quantidade) {
        this.Nome = nome;
        this.Marca = marca;
        this.Valor = valor;
        this.Quantidade = quantidade;
    }

    public Produto() {
    }


    public void ExibirProdutos (){
        System.out.println("-------- Informações do Produto --------");
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Valor: " + getValor());
        System.out.println("Quantidade: " + getQuantidade());
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        this.Valor = valor;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.Quantidade = quantidade;
    }
}
