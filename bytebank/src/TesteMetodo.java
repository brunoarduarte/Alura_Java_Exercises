public class TesteMetodo {

    public static void main(String[] args) {
        Conta contaDoBruno = new Conta();
        contaDoBruno.deposita(150);
        System.out.println(contaDoBruno.saldo);

        boolean conseguiuSacar = contaDoBruno.saca(50);
        System.out.println(contaDoBruno.saldo);
        System.out.println(conseguiuSacar);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);
        if (contaMarcela.transfere(450, contaDoBruno)) {
            System.out.println("Transferêmcia efetivada!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo Marcela: " + contaMarcela.saldo);
        System.out.println("Saldo Bruno: " + contaDoBruno.saldo);
    }
}
