public class Cachorro extends Animal{
    private boolean late;

    public Cachorro(String nome){
        super(nome);
    }

    public void late(){
        System.out.println(this.nome + " está latindo: au au!");
    }
}
