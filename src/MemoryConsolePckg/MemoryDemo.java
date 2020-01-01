package MemoryConsolePckg;

import java.util.Scanner;

//Gianni Versées en Lara Bertels
//MEMORY CONSOLEVERSIE

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
            System.out.println("Het spel zal worden herstart. Denk er aan om de de juiste waarden in te vullen.");
            Spel spel2 = new Spel();
            spel2.StartSpel();
        }
        catch (IllegalArgumentException i){
            System.out.println("Gelieve een getal in te voeren");
            System.out.println("Het spel zal worden herstart. Denk er aan om de de juiste waarden in te vullen.");
            Spel spel2 = new Spel();
            spel2.StartSpel();
        }
        catch (Exception e){
            System.out.println("Je gebruikte dit programma foutief.");
            System.out.println("Het spel zal worden herstart. Denk er aan om de de juiste waarden in te vullen.");
            Spel spel2 = new Spel();
            spel2.StartSpel();
        }
        //Niet in de finally, anders geeft hij dit ook als het spel correct is uitgespeeld.
//        finally {
//            System.out.println("Het spel zal worden herstart. Denk er aan om de de juiste waarden in te vullen.");
//            Spel spel2 = new Spel();
//            spel2.StartSpel();
//        }

    }
}
