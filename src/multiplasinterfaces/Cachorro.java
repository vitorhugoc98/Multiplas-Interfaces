package multiplasinterfaces;

public class Cachorro extends ClasseAnimal implements Mamifero, Animal{

    public Cachorro(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au au au.");
    }

    @Override
    public void locomover() {
        System.out.println("Estou correndo.");
    }

    @Override
    public void mamar() {
        System.out.println("Estou mamando.");
    }
}
