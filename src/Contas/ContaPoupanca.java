package Contas;
import Cliente.Cliente;
public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("---- Extrato Contas.Conta Poupança! ----");
        super.imprimirExtrato();
    }
}
