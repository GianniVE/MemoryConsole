package MemoryConsolePckg;

public class MemoryDemo {
    public static void main(String[] args) {

        try{
            //Aanmaken van een nieuw spel
            Spel spel = new Spel();
            //Spel starten
            spel.StartSpel();
        }
        catch (IllegalArgumentException i){
            System.out.println("Gelieve een getal in te voeren.");
        }

    }
}
