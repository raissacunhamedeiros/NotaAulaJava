public class Programador extends Funcionario{
    private String linguagem;
    public Programador(String nome, int nasc, double salario, String linguagem){
        super(nome, nasc, salario);
        this.linguagem= linguagem;
    }

    public void informarLinguagem(){
        System.out.println("A linguagem que o programador trabalha é: "+ this.linguagem);
    }
}
