public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    //reescrita ou sobrescrita do método
//    @Override
    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do gerente");
        return super.getSalario();
    }
}
