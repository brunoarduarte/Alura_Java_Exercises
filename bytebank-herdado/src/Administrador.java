public class Administrador extends Funcionario implements Autenticavel {

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

    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do gerente");
        double bonif = super.getSalario() * 5;
        return bonif;
    }

}
