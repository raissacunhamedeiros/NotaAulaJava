import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro cachorro = new Cachorro("Amora");
        cachorro.caminha();
        cachorro.late();

        Gato gato = new Gato("Penelope");
        gato.caminha();
        gato.mia();

        System.out.println("Digite mais um cachorro: ");
        String nomeCachorro= sc.nextLine();
        Cachorro cachorro1 = new Cachorro(nomeCachorro);
        cachorro1.caminha();
        cachorro1.late();

        sc.close();
    }
}