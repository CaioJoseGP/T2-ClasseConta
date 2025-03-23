public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        
        //depositar
        conta1.depositar(50.99);
        System.out.println(conta1.saldo + "\n");

        //sacar
        conta1.sacar(0.99);
        System.out.println(conta1.saldo + "\n");

        //transferir
        conta2.depositar(5);
        System.out.println("Saldo Conta2: " + conta2.saldo + "\n");
        conta1.transferir(10.5, conta2);
        System.out.println("Saldo Conta1: " + conta1.saldo + "\n");
        System.out.println("Saldo Conta2: " + conta2.saldo + "\n");
    }
}
