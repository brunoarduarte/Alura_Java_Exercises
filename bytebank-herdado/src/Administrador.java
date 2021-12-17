public class Administrador extends Autenticavel {

    public double getBonificacao() {
        System.out.println("Chamado método de bonificação do gerente");
        double bonif = super.getSalario() * 5;
        return bonif;
    }

}
