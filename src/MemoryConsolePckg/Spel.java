package MemoryConsolePckg;

import java.util.Scanner;

public class Spel {
    public void StartSpel(){
        Scanner scanner = new Scanner(System.in);

        //Naam vragen van speler en deze aanmaken.
        String naamSpeler;
        System.out.print("Geef de naam van de speler en duw op enter. ");
        naamSpeler = scanner.nextLine();
        Speler speler1 = new Speler(naamSpeler);
        speler1.setGespeeldeBeurten(speler1.getGespeeldeBeurten() + 1);

        //Naam van speler weergeven en succes wensen.
        System.out.println("Welkom " + speler1.getNaam() + ". Veel succes!");
    }

    public void Controle(){
        Scanner scanner = new Scanner(System.in);

        //Controleren
        //-----------------------------------------------------------------
        //Vragen voor een eerste getal in te geven
        System.out.println("\nGeef een eerste getal in en druk op enter.");
        int eersteGetal= scanner.nextInt();

        //vragen voor een tweede getal in te geven.
        System.out.println("\nGeef een tweede getal in en druk op enter.");
        int tweedeGetal= scanner.nextInt();
    }
}
