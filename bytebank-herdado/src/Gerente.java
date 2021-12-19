public class Gerente extends Funcionario implements Autenticavel{

    private AtenticacaoUtil autenticador;

    public Gerente() {
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

    //reescrita ou sobrescrita do método
    @Override
    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do gerente");
        return super.getSalario();
    }
}
