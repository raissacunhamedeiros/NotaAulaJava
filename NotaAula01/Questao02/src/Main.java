//Crie um sistema para controle de um produto com atributos código, nome,
//tamanho/peso, cor, valor e quantidade no estoque. O sistema deve permitir
// o cadastro dos dados, além de realizar a venda e fazer o controle do estoque.
//Para o pagamento, temos os seguintes benefícios:
//Pix, Espécie, Transferência ou Débito, 5% de desconto.
//Crédito, parcelar em 3x sem juros.
//Observação: Espécie, caso o valor pago seja maior que o valor do produto, informar o troco.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x;
        int op_venda;
        int quantidadeVendida;
        double cal_valor;
        boolean confirmacao_venda;
        double desconto;
        double pagamento_especie;
        double troco;
        int parcelas;
        Produto produto= new Produto();
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Bem vindo ao programa de controle de estoque:");
            System.out.println("Digite o número da opção desejada:\n" +
                    "[1] - Cadastro de Produto\n" +
                    "[2]- Venda de Produto\n" +
                    "[0] - Sair");
            x=teclado.nextInt();
            switch (x){
                case 1:
                    System.out.println("Controle de Produtos:");
                    System.out.println("Digite o nome do Produto: ");
                    produto.nome_produto= teclado.next();
                    System.out.println("Digite o código do Produto: ");
                    produto.codigo = teclado.nextInt();
                    System.out.println("Digite o tamanho/peso do Produto: ");
                    produto.peso= teclado.nextDouble();
                    System.out.println("Digite a cor do Produto: ");
                    produto.cor= teclado.next();
                    System.out.println("Digite o valor do Produto: R$ ");
                    produto.valor=teclado.nextDouble();
                    System.out.println("Digite a quantidade do estoque do Produto: ");
                    produto.quantidade_estoque= teclado.nextInt();
                    System.out.println("Cadastro Realizado com Sucesso!");
                    System.out.println("O Dados cadastrados foram: \n" +
                            "Produto: "+ produto.nome_produto + "\n"+
                            "Codigo do produto: " + produto.codigo +"\n"+
                            "Tamanho / peso: " + produto.peso +"\n"+
                            "or do Produto: " + produto.cor +"\n"+
                            "Valor do produto: R$ " + produto.valor +"\n"+
                            "Estoque do produto: " + produto.quantidade_estoque);
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("                   Vendas                    ");
                    System.out.println("---------------------------------------------");
                    System.out.println("Qual quantidade do Produto você deseja: ");
                    quantidadeVendida= teclado.nextInt();
                    confirmacao_venda= produto.realizarVenda(quantidadeVendida);
                    if (confirmacao_venda == true){
                        cal_valor= produto.valor* quantidadeVendida;
                        System.out.println("O valor da sua compra foi de R$ "+ cal_valor);
                        System.out.println("Digite a opção que deseja efetuar a venda: \n" +
                                "[1] Pix \n" +
                                "[2] Especie \n" +
                                "[3] Transferência ou Débito\n" +
                                "[4] Crédito");
                        op_venda= teclado.nextInt();
                        switch (op_venda){
                            case 1:
                                System.out.println("Você escolheu a forma de pagamento Pix");
                                desconto= cal_valor- (cal_valor*0.05) ;
                                System.out.println("O valor total: R$ "+ cal_valor+
                                        "\n Com 5% de desconto: R$ " + desconto);
                                System.out.println("QR code / código de pagamento: 0547820548612187465");
                                break;
                            case 2:
                                System.out.println("Você escolheu a forma de pagamento Especie");
                                desconto= cal_valor- (cal_valor*0.05);
                                System.out.println("O valor total: R$ "+ cal_valor+
                                        "\n Com 5% de desconto: R$ " + desconto);
                                System.out.println("Digite o valor que você irá pagar: R$ ");
                                pagamento_especie= teclado.nextDouble();
                                troco = pagamento_especie-desconto;
                                System.out.println("Seu troco é de: R$ " + troco);
                                break;
                            case 3:
                                System.out.println("Você escolheu a forma de Transferência ou Débito:");
                                desconto= cal_valor- (cal_valor*0.05);
                                System.out.println("O valor total: R$ "+ cal_valor+
                                        "\n Com 5% de desconto: R$ " + desconto);
                                break;
                            case 4:
                                System.out.println("Você escolheu a forma de pagamento Crédito:");
                                System.out.println("O valor total: R$ "+ cal_valor);
                                System.out.println("Em quantas parcelas você deseja dividir: \n" +
                                        "[1] parcelar em 1x sem juros\n" +
                                        "[2] parcelar em 2x sem juros\n"+
                                        "[3] parcelar em 3x sem juros");
                                parcelas= teclado.nextInt();
                                if( parcelas == 1){
                                    System.out.println("Você parcelou em 1x: R$" + cal_valor);
                                } else if (parcelas == 2) {
                                    System.out.println("Você parcelou em 2x sem juros: \n" +
                                            "Suas parcelas ficaram de R$ " + cal_valor/2);
                                } else if (parcelas ==3) {
                                    System.out.println("Você parcelou em 3x sem juros: \n" +
                                            "Suas parcelas ficaram de R$ " + cal_valor/3);
                                } else{
                                    System.out.println("Digite uma quantidade de parcelas validas!");
                                }
                                break;
                        }
                        System.out.println("Pagamento realizado com sucesso!");

                    } else {
                        System.out.println("Não é possivel realizar a venda pois o produto não tem estoque!");
                    }
            }

        } while (x != 0);
        System.out.println("Programa encerrado! Obrigado e volte sempre!");

        teclado.close();
    }
}