package MemoryConsolePckg;

import java.util.*;

public class MemoryDemo {
    public static void main(String[] args) {

        //Spel starten
        Spel spelStart = new Spel();
        spelStart.StartSpel();

        //aanmaken van een spelbord
        Spelbord spel1 = new Spelbord();
        spel1.SpelbordMaken();
        spel1.getallenToevoegenAanMap();
        spel1.afdrukkenMap();

    }
}
