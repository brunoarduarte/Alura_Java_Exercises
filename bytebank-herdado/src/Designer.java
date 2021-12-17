public class Designer extends Funcionario {

    //reescrita ou sobrescrita do método
    @Override
    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do designer");
        return super.getBonificacao() + 200;
    }
}
