package MemoryConsolePckg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MemoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Naam vragen van speler en deze aanmaken.
        String naamSpeler;
        System.out.print("Geef de naam van de speler en duw op enter. ");
        naamSpeler=scanner.nextLine();
        Speler speler1 = new Speler(naamSpeler);

        //Naam van speler weergeven en succes wensen.
        System.out.println("Welkom "+speler1.getNaam()+". Veel succes!");


        //STAPPEN
        //Spelbord maken in aparte klasse
        //speler laten spelen adhv werken met 1.1 en 1.5
        //foutmelding of juistmelding
        //verderspelen
        //helemaal klaar? score tonen en vragen om op nieuw te spelen.
    }
}
