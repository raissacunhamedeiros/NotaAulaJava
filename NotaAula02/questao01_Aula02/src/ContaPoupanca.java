public class ContaPoupanca {
    double saldo = 0;
    double selic;
    double rendimento;

    public void depositar(double valor){

        saldo += valor;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void calcularRendimento(double selic){
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
            System.out.println("Seus rendimentos foram: R$" + rendimento);
        }
        else {
            rendimento = 0.007 * selic * saldo;
            System.out.println("Seus rendimentos foram: R$" + rendimento);
        }

    }
    public void dadosContaPoupanca(){
        System.out.println("------------------------------------");
        System.out.println("saldo conta corrente: R$ "+ saldo);
        System.out.println("------------------------------------");
    }
}
