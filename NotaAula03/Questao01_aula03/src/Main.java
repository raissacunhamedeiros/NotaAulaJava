import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);


        System.out.println("Cadastro de Gerente:");
        System.out.println("Nome: ");
        String nomeGerente= sc.nextLine();
        System.out.println("Ano Nascimento: " );
        int nasGerente= teclado.nextInt();
        System.out.println("Salario: ");
        double salarioGerente= teclado.nextDouble();
        System.out.println("Digite o nome do projeto: ");
        String projeto = sc.nextLine();

        Gerente gerente = new Gerente(nomeGerente, nasGerente, salarioGerente, projeto);
        System.out.println("----------------------------------");
        System.out.println(" Informações do Gerente: ");
        System.out.println("----------------------------------");
        gerente.informarProjeto();
        gerente.informarSalario();
        System.out.println("Idade: "+ gerente.calcularIdade(2024));

        System.out.println("Cadastro do Programador:");
        System.out.println("Nome: ");
        String nomeProgramador= sc.nextLine();
        System.out.println("Ano Nascimento: " );
        int nasProgramador= teclado.nextInt();
        System.out.println("Salario: ");
        double salarioProgramador= teclado.nextDouble();
        System.out.println("Digite a linguagem de programação: ");
        String linguagem = sc.nextLine();

        Programador programador = new Programador(nomeProgramador, nasProgramador, salarioProgramador, linguagem);
        System.out.println("----------------------------------");
        System.out.println(" Informações do Programador: ");
        System.out.println("----------------------------------");
        programador.informarSalario();
        programador.informarLinguagem();
        System.out.println("Idade: "+ programador.calcularIdade(2024));

        teclado.close();
        sc.close();
    }
}