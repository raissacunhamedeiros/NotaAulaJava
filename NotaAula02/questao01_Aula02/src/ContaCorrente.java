public class ContaCorrente {
    double saldo = 0;
    double chequeEspecial=1000.00;
    String resp;
    double saldoLimite;

    public void depositar(double valor){

        saldo += valor;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void usarCheque(double valor){
        if (saldo <= 0){
            saldo = chequeEspecial -= valor;
        } else if (saldo < valor) {
            System.out.println("Atenção! seu saldo é de: " + saldo + "\n" +
                    "você entrará no cheque Especial.");
                saldoLimite = saldo + chequeEspecial;
                if (saldoLimite < valor){
                    System.out.println("Não é possivel realizar transação, valor superior ao cheque especial.");
                } else{
                    saldo = valor-saldoLimite;
                }
            }
        }

    public void dadosContaCorrente(){
        System.out.println("------------------------------------");
        System.out.println("saldo conta corrente: R$ "+ saldo);
        System.out.println("------------------------------------");

    }

}
