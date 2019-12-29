package MemoryConsolePckg;


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
        //Opvangen van fout bij het kiezen van een niveau
        if(scanner.hasNextInt()) {
            niveau = scanner.nextInt();
        }else {
            throw new IllegalArgumentException();
        }


        //Naam van de speler weergeven met succesboodschap
        System.out.println("Welkom " + speler1.getNaam() + ". Veel succes!");

        //Aan de hand van het gekozen niveau het juiste spelbord aanmaken.
        if (niveau == 1) {
           SpelNiveau1 spelniveau1 = new SpelNiveau1();
           spelniveau1.SpelEersteNiveauStart();
        } else {
            SpelNiveau2 spelniveau2 = new SpelNiveau2();
            spelniveau2.SpelTweedeNiveauStart();
        }
    }
}
