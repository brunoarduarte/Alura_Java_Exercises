package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorSacado = valor + 0.2;
        super.saca(valorSacado);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
