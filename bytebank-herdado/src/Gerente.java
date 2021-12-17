public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
    //reescrita ou sobrescrita do método
    @Override
    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do gerente");
        return super.getSalario();
    }
}
