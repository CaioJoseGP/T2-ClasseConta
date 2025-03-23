public class ContaCorrente {
    double saldo;
    String numConta, titular, numAgencia, cpfTitular, banco;

    public double depositar(double valor) {
        if(valor <= 0) {
            return 0;

        } else {
            return this.saldo = this.saldo + valor;
        }
    }

    public double sacar(double valor) {
        if(this.saldo < valor && valor <= 0) {
            return 0;

        } else {
            return this.saldo = this.saldo - valor;
        }
    }
    
    public double transferir(double valor, ContaCorrente contaTransferencia) {
        if(this.saldo < valor && valor <= 0) {
            return 0;

        } else {
            contaTransferencia.saldo = contaTransferencia.saldo + valor;
            return this.saldo = this.saldo - valor;
        }
    }
}