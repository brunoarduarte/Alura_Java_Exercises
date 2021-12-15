public class TesteGetSet {

    public static void main(String[] args) {
        Conta contaDoBruno = new Conta(1337, 24226);
        System.out.println(contaDoBruno.getAgencia());
        System.out.println(contaDoBruno.getNumero());

        Cliente bruno = new Cliente("Bruno Araujo Duarte", "34534534567", "programador");

        contaDoBruno.setTitular(bruno);
        System.out.println(contaDoBruno.getTitular());

        Conta contaJohn = new Conta(1337, 24227);
        System.out.println(Conta.getTotal());
        Conta contaMarlon = new Conta(1337, 24228);
        System.out.println(Conta.getTotal());
    }

}
