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
        catch (IllegalStateException s){
            System.out.println("Je kan enkel kiezen tussen niveau 1 en niveau 2.");
        }

    }
}
