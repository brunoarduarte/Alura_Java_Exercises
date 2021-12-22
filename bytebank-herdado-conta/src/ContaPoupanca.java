public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) {
        double valorSacado = valor + 0.5;
        super.saca(valorSacado);
    }
}
