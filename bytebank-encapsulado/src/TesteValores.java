public class TesteValores {

    public static void main(String[] args) {
        Conta glauConta = new Conta(1337, 25116);
        Cliente glauciane = new Cliente("Glauciane Goulart Gomes Duarte", "12312312300", "Gerente Financeiro");
        glauConta.setTitular(glauciane);
        System.out.println(glauConta.getTitular());
        System.out.println(glauciane.getCpf());
        System.out.println(glauciane.getProfissao());
    }
}
