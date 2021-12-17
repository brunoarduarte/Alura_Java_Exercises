public class TesteGerente {

    public static void main(String[] args) {
        Gerente marcelo = new Gerente();
        marcelo.setNome("Marcelo de Nóbrega");
        marcelo.setCpf("23423423456");
        marcelo.setSalario(6000.00);
        marcelo.setSenha(3005);
        boolean autenticou = marcelo.autentica(3005);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(marcelo);
        System.out.println(controle.getSoma());
    }
}
