public class TesteGerente {

    public static void main(String[] args) {
        Gerente marcelo = new Gerente();
        marcelo.setNome("Marcelo de Nóbrega");
        marcelo.setCpf("23423423456");
        marcelo.setSalario(6000.00);
        marcelo.setSenha(3005);

        System.out.println(marcelo.getNome());
        System.out.println(marcelo.getBonificacao());
        boolean autenticou = marcelo.autentica(3005);
        System.out.println(autenticou);
    }
}
