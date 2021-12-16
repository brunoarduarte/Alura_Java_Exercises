public class TesteReferencias {

    public static void main(String[] args) {
        // polimorfismo
        Funcionario g2 = new Gerente();
        g2.setNome("Marlon Ramos");
        System.out.println(g2.getNome());
    }
}
