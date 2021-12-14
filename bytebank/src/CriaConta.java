public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmíssima conta");
        } else {
            System.out.println("São contas diferentes!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
