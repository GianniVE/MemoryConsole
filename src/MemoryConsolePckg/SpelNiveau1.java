package MemoryConsolePckg;

import java.util.Map;
import java.util.Scanner;

public class SpelNiveau1 {
    public void SpelEersteNiveauStart(){
        //Timer aanmaken
        Timer timer1 = new Timer();
        Scanner scanner = new Scanner(System.in);

        SpelbordNiveau1 spel1 = new SpelbordNiveau1();
        //Spelbord aanmaken
        spel1.SpelbordMaken();
        //Getallen die in de list staan toevoegen aan de map
        spel1.getallenToevoegenAanMap();
        timer1.startTijd();


        //Variabele voor het aantal gevonden kaarten bij te houden, als deze gelijk is aan het totale te zoeken kaarten stopt het spel.
        int aantalGevondenKaarten = 0;
        //While-loop voor als
        while (aantalGevondenKaarten < 20) {
            spel1.afdrukkenMap();
            //Controleren
            //-----------------------------------------------------------------

            Map<Integer, Kaart> secondHash = spel1.getGetallenHashmap();

            //Vragen voor een eerste getal in te geven
            System.out.println("\nGeef een eerste getal in en druk op enter.");
            int eersteGetal;
            if(scanner.hasNextInt()) {
                eersteGetal = scanner.nextInt();
            }else {
                throw new IllegalArgumentException();
            }

            Kaart x = new Kaart(3001);
            Kaart y = new Kaart(3000);
            for (Integer integer : secondHash.keySet()) {
                if (eersteGetal == integer) {
                    x = secondHash.get(integer);
                    System.out.println(x.getGetal());
                }
            }

            //vragen voor een tweede getal in te geven.
            System.out.println("\nGeef een tweede getal in en druk op enter.");
            int tweedeGetal;

            if(scanner.hasNextInt()) {
                tweedeGetal = scanner.nextInt();
            }else {
                throw new IllegalArgumentException();
            }
            for (Integer integer : secondHash.keySet()) {
                if (tweedeGetal == integer) {
                    y = secondHash.get(integer);
                    System.out.println(+y.getGetal());
                }
            }


            //Controleren of er al dan niet een match is.
            if (x.getGetal() == y.getGetal()) {
                System.out.println("Je hebt een match gevonden.");
                x.setGematched(true);
                y.setGematched(true);
                aantalGevondenKaarten += 2;
            } else {
                System.out.println("Jammer, probeer het opnieuw.");
            }

        }
        System.out.println("Gefeliciteerd je hebt alle matches gevonden!");

        //einde van de tijd
        timer1.stopTijd();
        //Berekenen van de gespeelde tijd en deze afdrukken.
        timer1.totaleSpeeltijdBerekenen();
    }
}
