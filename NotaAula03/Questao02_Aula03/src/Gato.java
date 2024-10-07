public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }
    public void mia(){
        System.out.println(this.nome + " está miando: miau!");
    }
}
