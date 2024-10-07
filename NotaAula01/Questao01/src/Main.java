import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Programa de situação acadêmica:");
        System.out.println("Nome do aluno:" );
        aluno.nome= sc.nextLine();
        do {
            System.out.println("Nota: ");
            double notaInserida= sc.nextDouble();
            aluno.somaNotas += notaInserida;
            aluno.cont +=1;

            System.out.println("Deseja inserir mais uma nota? [S/N]");
            r= sc.next();
            if (r.equalsIgnoreCase("N")){
                break;
            } else if (!r.equalsIgnoreCase("S")) {
                System.out.println("Comando invalido!");
                System.out.println("Deseja inserir mais uma nota? [S/N]");
                r= sc.next();
                if(r.equalsIgnoreCase("N")){
                    break;
                }
            }
        } while (true);

        aluno.calcular_media();
        sc.close();

        System.out.println("-------------------------------------");
        System.out.println("O aluno: "+ aluno.nome);
        System.out.println("Média: "+ aluno.media);
        System.out.println("-------------------------------------");

        if(aluno.media >= 7.0){
            System.out.println("Situação: Aprovado!");
        } else if (aluno.media < 4.0) {
            System.out.println("Situação: Reprovado!");
        } else{
            System.out.println("Situação: Está na Final!");
        }
    }
}