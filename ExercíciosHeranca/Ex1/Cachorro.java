public class Cachorro extends Animal {
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cachorro (){

        super ();
    }
    public void FazerSom (){
        super.FazerSom();
            System.out.println("O " + nome + " late: au au");
        }
    }
