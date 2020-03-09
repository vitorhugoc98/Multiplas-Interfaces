package multiplasinterfaces;

public class AveDeRapina extends ClasseAnimal implements Animal, Ave{

    public AveDeRapina(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Emitindo som");
    }

    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void bicar() {
        System.out.println("Bicando.");
    }
   
}
