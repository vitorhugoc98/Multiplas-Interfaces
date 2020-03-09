package multiplasinterfaces;

public class MultiplasInterfaces {

    public static void main(String[] args) {
        
        Cachorro cachorro00 = new Cachorro("Pitbull");
        
        cachorro00.emitirSom();
        cachorro00.locomover();
        cachorro00.mamar();
        
        AveDeRapina ave00 = new AveDeRapina("Aguia"); 
        
        ave00.bicar();
        ave00.emitirSom();
        ave00.locomover();
    }
    
}
