package MemoryConsolePckg;

import java.util.Scanner;

public class MemoryDemo {
    public static void main(String[] args) {
        try{
            //Aanmaken van een nieuw spel
            Spel spel = new Spel();
            //Spel starten
            spel.StartSpel();
        }
        catch (IllegalStateException s){
            System.out.println("Je kan enkel kiezen tussen niveau 1 en niveau 2.");
            Spel spel2 = new Spel();
            spel2.StartSpel();
        }
        catch (IllegalArgumentException i){
            System.out.println("Gelieve een getal in te voeren");
            Spel spel3 = new Spel();
            spel3.StartSpel();
        }
        catch (Exception e){
            System.out.println("Je gebruikte dit programma foutief.");
            Spel spel4 = new Spel();
            spel4.StartSpel();
        }

    }
}
