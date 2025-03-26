public class Hardware extends Produto {

    private String descrição;

    public Hardware (){
        super();
    }

    public Hardware(String nome, String marca, double valor, int quantidade, String descrição) {
        super(nome, marca, valor, quantidade);
        this.descrição = descrição;
    }

    @Override
    public void ExibirProdutos() {
        super.ExibirProdutos();
        System.out.println("Descrição: " + getDescrição());
        System.out.println("-------------------");
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
