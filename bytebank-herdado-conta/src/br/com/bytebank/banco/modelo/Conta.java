package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 *
 * @author Bruno Duarte
 */

public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agência e número.
     *
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    /**
     *  Valor precisa ser maior que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo: " + this.saldo + ", Valor Sacado: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (agencia <= 0) {
            System.out.println("Valor deve ser maior que zero.");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Valor deve ser maior que zero.");
            return;
        }
        this.agencia = agencia;
    }

    public String getTitular() {
        return this.titular.getNome();
    }

    public void setTitular(Cliente novoCliente) {
        this.titular = novoCliente;
    }

    public static int getTotal() {
        return total;
    }
}
