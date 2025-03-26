public class Periférico extends Produto{

    private String TipoDeConexão;

    public Periférico () {

    }

    public Periférico(String nome, String marca, double valor, int quantidade, String tipoDeConexão) {
        super(nome, marca, valor, quantidade);
        this.TipoDeConexão = tipoDeConexão;
    }

    public String getTipoDeConexão() {
        return TipoDeConexão;
    }

    public void setTipoDeConexão(String tipoDeConexão) {
        this.TipoDeConexão = tipoDeConexão;
    }

    @Override
    public void ExibirProdutos() {
        super.ExibirProdutos();
        System.out.println("Tipos de Conexão: " + getTipoDeConexão());
        System.out.println("-----------------------------");
    }
}
