//Elabore um programa para um sistema bancário básico com Conta Corrente e Conta Poupança. Cada conta bancária terá
// um nome de titular e um saldo inicial zerado. Inicialmente, a pessoa usuária deve selecionar o tipo de conta.
//Após selecionada, o sistema deve exibir o menu de opções:
//1. Conta Corrente: Depositar, sacar, usar cheque especial, exibir dados da conta
//2. Conta Poupança: Depositar, sacar, calcular rendimento, exibir dados da conta
// Observação 1) Cheque especial de 1.000,00
//Observação 2) Calcular rendimento deve seguir a seguinte regra:
//• Quando a taxa básica de juros (Selic) está acima de 8,5% ao ano, a poupança rende 0,5% ao mês.
//• Quando a Selic está igual ou abaixo de 8,5% ao ano, a poupança tem um rendimento de 70% da Selic.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        DadosBancarios dadosBancarios = new DadosBancarios();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        int selecaoConta;
        int opcaoCC;
        int opcaoCP;

        System.out.println("-----------------------------------------------");
        System.out.println("        Bem vindo ao BDR (Banco da Rah)        ");
        System.out.println("-----------------------------------------------");
        System.out.println("Para seu cadastro, digite por favor o nome do titular: ");
        dadosBancarios.titular=(sc.nextLine());
        System.out.println("Conta criada com Sucesso!");

        do{
            System.out.println("Qual conta você gostaria de acessar: \n" +
                    "[1] Conta corrente \n" +
                    "[2] Conta poupança \n"+
                    "[0] Sair");
            selecaoConta = teclado.nextInt();
            if (selecaoConta ==1 ) {
                do {
                    System.out.println("CONTA CORRENTE: \n" +
                            "opções: \n" +
                            "[1]- Depositar \n" +
                            "[2]- Sacar \n" +
                            "[3]- Usar cheque especial \n" +
                            "[4]- Exibir dados bancarios \n" +
                            "[0]- Voltar ao menu");
                    opcaoCC = teclado.nextInt();
                    switch (opcaoCC) {
                        case 1:
                            System.out.println("Quanto você gostaria de depositar? R$ ");
                            contaCorrente.depositar(sc.nextDouble());
                            System.out.println("Seu saldo atual é: R$ " + contaCorrente.saldo);
                            break;

                        case 2:
                            System.out.println("Quanto você gostaria de sacar? R$ ");
                            contaCorrente.sacar(sc.nextDouble());
                            System.out.println("Seu saldo atual é: R$ " + contaCorrente.saldo);
                            break;

                        case 3:
                            System.out.println("------------ Cheque Especial ------------");
                            System.out.println("Quanto você gostaria de sacar? R$ ");
                            contaCorrente.usarCheque(sc.nextDouble());
                            break;

                        case 4:
                            System.out.println("------------ Dados da conta ------------");
                            dadosBancarios.dadosConta();
                            contaCorrente.dadosContaCorrente();
                            break;


                        default:
                            System.out.println("opção inválida!");

                    }
                } while (opcaoCC != 0);
            }else if (selecaoConta == 2) {
                do{
                    System.out.println("CONTA POUPANÇA: \n" +
                            "opções: \n" +
                            "[1]- Depositar \n" +
                            "[2]- Sacar \n" +
                            "[3]- Calcular Rendimentos \n" +
                            "[4]- Exibir dados bancarios \n" +
                            "[0]- Voltar ao menu");
                opcaoCP = teclado.nextInt();
                switch (opcaoCP){
                    case 1:
                        System.out.println("Quanto você gostaria de depositar? R$ ");
                        contaPoupanca.depositar(sc.nextDouble());
                        System.out.println("Seu saldo atual é: R$ "+ contaPoupanca.saldo);
                        break;

                    case 2:
                        System.out.println("Quanto você gostaria de sacar? R$ ");
                        contaPoupanca.sacar(sc.nextDouble());
                        System.out.println("Seu saldo atual é: R$ "+ contaPoupanca.saldo);
                        break;

                    case 3:
                        System.out.println("------------ Calculo de Rendimentos ------------");
                        System.out.println("digite qual a taxa da Selic: ");
                        contaPoupanca.selic = sc.nextDouble();
                        contaPoupanca.calcularRendimento(contaPoupanca.selic);
                        break;

                    case 4:
                        System.out.println("------------ Dados da conta ------------");
                        dadosBancarios.dadosConta();
                        contaPoupanca.dadosContaPoupanca();
                        break;

                    default:
                        System.out.println("opção inválida!");

                }
            } while (opcaoCP !=0);
            } else {
                System.out.println("Escolha uma opção valida!");
                selecaoConta = teclado.nextInt();
            }
        }while (selecaoConta!= 0);
        System.out.println("Encerrando sessão no BRD! Obrigada pela Preferência!");

        sc.close();
        teclado.close();
    }
}