public class Principal {
    public static void main(String[] args) {

        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Boleto();
        Pagamento pagamento3 = new CartaoCredito();
        Pagamento pagamento4 = new Boleto();

        pagamento1.realizarPagamento(150.0);
        pagamento2.realizarPagamento(89.90);
        pagamento3.realizarPagamento(1200.0);
        pagamento4.realizarPagamento(50.5);
    }
}