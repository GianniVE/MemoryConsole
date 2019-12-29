package MemoryConsolePckg;

import java.util.*;

public  class SpelbordNiveau2 {
    Scanner scanner = new Scanner(System.in);

    //Aanmaken van de array, list en map
    Kaart[] getallenArray = new Kaart[36];//36 elementen //Hier wordt er een array van kaart elementen aangemaakt.
    LinkedList<Kaart> getallenLinkedList;
    Map<Integer, Kaart> getallenHashmap;

    //Constructor
    public SpelbordNiveau2() {
    }

    //getter van de hashmap
    public Map<Integer, Kaart> getGetallenHashmap() {
        return getallenHashmap;
    }

    public void SpelbordMaken() {
        //Array opvullen (36 elementen, 2x hetzelfde)
        for (int i = 0; i < 36; i += 2) {
            getallenArray[i] = new Kaart();
            getallenArray[i + 1] = new Kaart();
            getallenArray[i].setGetal(i);
            getallenArray[i + 1].setGetal(i);
        }

        //linkedlist van array maken
        getallenLinkedList = new LinkedList<Kaart>(Arrays.asList(getallenArray));

        //getallenLinkedList shuffelen
        Collections.shuffle(getallenLinkedList);
    }

    public void getallenToevoegenAanMap() {
        //Aanmaken van de hashmap
        getallenHashmap = new HashMap<>();

        //getallen van de list toevoegen aan de map
        int y = 0;
        for (Kaart kaart : getallenLinkedList) {
            getallenHashmap.put(/*key uniek*/y, kaart/*value zelfde*/);
            y++;
        }
    }


    public void afdrukkenMap() {
        //afdrukken van de Hashmap
        for (int i = 0; i < 6; i++) {
            for (int a = 0; a < 6; a++) {
                if (getallenHashmap.get(i * 6 + a).isGematched()) {
                    String x="x";
                    System.out.printf("%-4s",x);
                } else
                    System.out.printf("%-4d",i*6+a);
            }
            System.out.println();
        }
        System.out.println();
    }
}


