public class Produto {
    String nome_produto, cor;
    double peso, valor;
    int quantidade_estoque, codigo;

    public boolean realizarVenda(int quantidadeVendida){
        if (quantidadeVendida <= quantidade_estoque){
            quantidade_estoque -= quantidadeVendida;
            System.out.println("Quantidade do estoque atualizada para:" + quantidade_estoque);
            return true;
        } else{
            System.out.println("Quantidade em estoque insuficiente.");
            return false;
        }

    }
}
