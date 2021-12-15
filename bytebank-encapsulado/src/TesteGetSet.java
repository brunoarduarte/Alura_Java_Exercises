public class TesteGetSet {

    public static void main(String[] args) {
        Conta contaDoBruno = new Conta();
        contaDoBruno.setNumero(1337);
        System.out.println(contaDoBruno.getNumero());

        Cliente bruno = new Cliente();
        bruno.setNome("Bruno Araujo Duarte");

        contaDoBruno.setTitular(bruno);
        System.out.println(contaDoBruno.getTitular());
    }
}
