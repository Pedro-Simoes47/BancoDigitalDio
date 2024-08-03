package Contas;

import Interfaces.InterfaceConta;
import Cliente.Cliente;

public class Conta implements InterfaceConta {

    protected static int AGENCIA = 007;
    private static int SEQUENCIAL = 1;
    protected int numeroConta;
    protected double saldoConta;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldoConta < valor) {
            System.out.println("---- Saldo insuficiente para saque! ----");
        } else {
            saldoConta -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldoConta += valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
        if (!(saldoConta < valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular da conta: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %d\n", this.AGENCIA);
        System.out.printf("Conta: %d\n", this.numeroConta);
        System.out.printf("Saldo: %.2f\n", this.saldoConta);

    }
}
