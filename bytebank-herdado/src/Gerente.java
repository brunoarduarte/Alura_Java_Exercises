public class Gerente extends Autenticavel {

    //reescrita ou sobrescrita do método
    @Override
    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do gerente");
        return super.getSalario();
    }
}
