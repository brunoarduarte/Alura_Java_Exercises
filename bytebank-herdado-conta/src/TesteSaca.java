public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(1000);
        conta.saca(1000);

        System.out.println(conta.getSaldo());
    }
}
