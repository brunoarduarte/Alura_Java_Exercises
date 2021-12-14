public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        String template = "O saldo da primeira conta é %s";
        String result1 = String.format(template, primeiraConta.saldo);
        System.out.println(result1);

        Conta segundaConta = primeiraConta;
        String template2 = "O saldo da segunda conta é %s";
        String result2= String.format(template2, segundaConta.saldo);
        System.out.println(result2);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmíssima conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
