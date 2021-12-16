public class TesteReferencias {

    public static void main(String[] args) {
        // polimorfismo
        Gerente g2 = new Gerente();
        g2.setNome("Marlon Ramos");
        g2.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        // polimorfismo
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());

    }
}
