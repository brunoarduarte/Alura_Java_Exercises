public class Administrador extends Funcionario implements Autenticavel {

    private AtenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AtenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
    @Override
    public boolean autentica(int senha) {
        boolean auth = this.autenticador.autentica(senha);
        return auth;
    }

    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do gerente");
        double bonif = super.getSalario() * 5;
        return bonif;
    }

}
