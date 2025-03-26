package Pagamentos;

public class Main {
    public static void main(String[] args) {

            Pagamento[] pagamentos = new Pagamento[2];
            pagamentos[0] = new PagamentoCartao();
            pagamentos[1] = new PagamentoDinheiro();


            for (Pagamento p : pagamentos) {
                p.realizarPagamento();

            }
        }
    }
