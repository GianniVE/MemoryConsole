package MemoryConsolePckg;


import java.util.Map;
import java.util.Scanner;

public class Spel {

    public void StartSpel() {
        Scanner scanner = new Scanner(System.in);

        //Naam van speler aanvragen en speler aanmaken.
        String naamSpeler;
        System.out.print("Geef de naam van de speler en duw op enter. ");
        naamSpeler = scanner.nextLine();
        Speler speler1 = new Speler(naamSpeler);
        speler1.setGespeeldeBeurten(speler1.getGespeeldeBeurten() + 1);

        //De speler een niveau laten kiezen
        int niveau;
        System.out.println("Welk niveau kies je?");
        System.out.println("Niveau 1: beginner");
        System.out.println("Niveau 2: gevorderd");
        niveau = scanner.nextInt();

        //Naam van de speler weergeven met succesboodschap
        System.out.println("Welkom " + speler1.getNaam() + ". Veel succes!");

        //Timer aanmaken
        Timer timer1 = new Timer();

        //Aan de hand van het gekozen niveau het juiste spelbord aanmaken.
        if (niveau == 1) {
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
                int eersteGetal = scanner.nextInt();
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
                int tweedeGetal = scanner.nextInt();
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
            System.out.println("Gefeliciteerd " + speler1.getNaam() + " je hebt alle matches gevonden!");

            //einde van de tijd
            timer1.Eindtijd();
            //Berekenen van de gespeelde tijd en deze afdrukken.
            timer1.totaleSpeeltijdBerekenen();


        } else {
            SpelbordNiveau2 spel2 = new SpelbordNiveau2();
            //Spelbord aanmaken
            spel2.SpelbordMaken();
            //Getallen die in de list staan toevoegen aan de map
            spel2.getallenToevoegenAanMap();
            timer1.startTijd();


            //Variabele voor het aantal gevonden kaarten bij te houden, als deze gelijk is aan het totale te zoeken kaarten stopt het spel.
            int aantalGevondenKaarten = 0;
            //While-loop voor als
            while (aantalGevondenKaarten < 36) {
                spel2.afdrukkenMap();
                //Controleren
                //-----------------------------------------------------------------

                Map<Integer, Kaart> secondHash = spel2.getGetallenHashmap();

                //Vragen voor een eerste getal in te geven
                System.out.println("\nGeef een eerste getal in en druk op enter.");
                int eersteGetal = scanner.nextInt();
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
                int tweedeGetal = scanner.nextInt();
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
            System.out.println("Gefeliciteerd " + speler1.getNaam() + " je hebt alle matches gevonden!");

            //einde van de tijd
            timer1.Eindtijd();
            //Berekenen van de gespeelde tijd en deze afdrukken.
            timer1.totaleSpeeltijdBerekenen();
        }
    }
}
