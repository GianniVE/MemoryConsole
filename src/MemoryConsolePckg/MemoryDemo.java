package MemoryConsolePckg;

import java.util.*;

import static MemoryConsolePckg.Spelbord.cards;

public class MemoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Naam vragen van speler en deze aanmaken.
        String naamSpeler;
        System.out.print("Geef de naam van de speler en duw op enter. ");
        naamSpeler = scanner.nextLine();
        Speler speler1 = new Speler(naamSpeler);
        speler1.setGespeeldeBeurten(speler1.getGespeeldeBeurten() + 1);

        //Naam van speler weergeven en succes wensen.
        System.out.println("Welkom " + speler1.getNaam() + ". Veel succes!");

        //spel opstarten
        Spelbord.setup();
        //Spelbord.spel(Spelbord.upDown, Spelbord.cards); // calls the game


    }

}
