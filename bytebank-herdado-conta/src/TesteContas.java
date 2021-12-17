public class TesteContas {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1111, 12345);
        cc.deposita(250.0);

        Conta cp = new ContaPoupanca(1111, 22223);
        cp.deposita(200.0);

        cc.transfere(50.0, cp);

        System.out.println(cc.getSaldo());
    }
}
