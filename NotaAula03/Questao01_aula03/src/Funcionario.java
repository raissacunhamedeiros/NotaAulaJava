public class Funcionario {
    protected String nome;
    protected double salario;
    protected int nasc;

    public Funcionario(String nome, int nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }


    public void informarSalario() {
        System.out.println("O salario do funcionário é: R$ " + this.salario);
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - this.nasc;
    }
}
