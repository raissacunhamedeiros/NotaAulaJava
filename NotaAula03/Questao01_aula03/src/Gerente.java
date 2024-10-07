public class Gerente extends Funcionario{
    private String projeto;

    public Gerente(String nome, int nasc, double salario, String projeto){
        super(nome, nasc, salario);
        this.projeto= projeto;
    }

    public void informarProjeto(){
        System.out.println("O projeto que o gerente gerencie é o "+ this.projeto);

    }
}