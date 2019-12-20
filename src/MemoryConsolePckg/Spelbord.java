package MemoryConsolePckg;

import java.util.*;

public  class Spelbord {
    Scanner scanner = new Scanner(System.in);
    Kaart[] getallenArray = new Kaart[16];//16 elementen
    LinkedList<Kaart> getallenLinkedList;
    Map<Integer, Kaart> getallenHashmap;

    //Constructor
    public Spelbord() {
    }

    public Map<Integer, Kaart> getGetallenHashmap() {
        return getallenHashmap;
    }

    public  void SpelbordMaken() {
        //Array opvullen (16 elementen, 2x hetzelfde)
        for (int i = 0; i < 16; i+=2) {
            getallenArray[i] = new Kaart();
            getallenArray[i+1] = new Kaart();
            getallenArray[i].setGetal(i);
            getallenArray[i + 1].setGetal(i);
        }

        //linkedlist van array maken
        getallenLinkedList= new LinkedList<Kaart>(Arrays.asList(getallenArray));
        
        //getallenLinkedList shuffelen
        Collections.shuffle(getallenLinkedList);

        //Aanmaken van de hashmap
        getallenHashmap= new HashMap<>();
    }
    
    public void getallenToevoegenAanMap() {
        //getallen van de list toevoegen aan de map
        int y=0;
        for (Kaart kaart : getallenLinkedList) {
            getallenHashmap.put(/*key uniek*/y,kaart/*value zelfde*/);
            y++;
        }
    }


    public void afdrukkenMap(){
        //afdrukken van de Hashmap
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <=3 ; j++) {
                if(getallenHashmap.get(i * 4 + j).isGematched()){
                    System.out.print("x ");
                }else{
                    System.out.print(i*4+j +" ");
                }
                if(j==3){
                    System.out.println();
                }
            }
        }
    }


}

