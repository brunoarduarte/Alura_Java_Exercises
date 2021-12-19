public class Cliente implements Autenticavel {

    private AtenticacaoUtil autenticador;

    public Cliente() {
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
}
