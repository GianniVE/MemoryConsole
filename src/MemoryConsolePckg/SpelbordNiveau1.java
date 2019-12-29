package MemoryConsolePckg;

import java.util.*;

public  class SpelbordNiveau1 {
    Scanner scanner = new Scanner(System.in);

    //Aanmaken van de array, list en map
    Kaart[] getallenArray = new Kaart[20];//20 elementen //Hier wordt er een array van kaart elementen aangemaakt.
    LinkedList<Kaart> getallenLinkedList;
    Map<Integer, Kaart> getallenHashmap;

    //Constructor
    public SpelbordNiveau1() {
    }

    //getter van de hashmap
    public Map<Integer, Kaart> getGetallenHashmap() {
        return getallenHashmap;
    }

    public  void SpelbordMaken() {
        //Array opvullen (20 elementen, 2x hetzelfde)
        for (int i = 0; i < 20; i+=2) {
            getallenArray[i] = new Kaart();
            getallenArray[i+1] = new Kaart();
            getallenArray[i].setGetal(i);
            getallenArray[i + 1].setGetal(i);
        }

        //linkedlist van array maken
        getallenLinkedList= new LinkedList<Kaart>(Arrays.asList(getallenArray));
        
        //getallenLinkedList shuffelen
        Collections.shuffle(getallenLinkedList);
    }
    
    public void getallenToevoegenAanMap() {
        //Aanmaken van de hashmap
        getallenHashmap= new HashMap<>();

        //getallen van de list toevoegen aan de map
        int y=0;
        for (Kaart kaart : getallenLinkedList) {
            getallenHashmap.put(/*key uniek*/y,kaart/*value zelfde*/);
            y++;
        }
    }


    public void afdrukkenMap(){
        //afdrukken van de Hashmap
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 5; a++) {
                if (getallenHashmap.get(i * 4 + a).isGematched()){
                    String x="x";
                    System.out.printf("%-4s",x);
                }
                else
                    System.out.printf("%-4d",i*5+a);
            }
            System.out.println();
        }
        System.out.println();
    }


}

