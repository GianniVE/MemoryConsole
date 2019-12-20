package MemoryConsolePckg;


import java.util.Map;
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

        //aanmaken van een spelbord
        Spelbord spel1 = new Spelbord();
        spel1.SpelbordMaken();
        spel1.getallenToevoegenAanMap();


        int aantalGevondenKaarten = 0;
        while (aantalGevondenKaarten<16){
            spel1.afdrukkenMap();
            //Controleren
            //-----------------------------------------------------------------

            //De controle zelf
            Map<Integer, Kaart> secondHash = spel1.getGetallenHashmap();

            //Vragen voor een eerste getal in te geven
            System.out.println("\nGeef een eerste getal in en druk op enter.");
            int eersteGetal= scanner.nextInt();

            Kaart x=new Kaart(3001);
            Kaart y=new Kaart(3000);
            for (Integer integer : secondHash.keySet()) {
                if (eersteGetal == integer){
                    x= secondHash.get(integer);
                    System.out.println(x.getGetal());
                }
            }


            //vragen voor een tweede getal in te geven.
            System.out.println("\nGeef een tweede getal in en druk op enter.");
            int tweedeGetal= scanner.nextInt();

            for (Integer integer : secondHash.keySet()) {
                if (tweedeGetal == integer){
                    y= secondHash.get(integer);
                    System.out.println(+y.getGetal());
                }
            }


            if (x.getGetal()==y.getGetal()){
                System.out.println("Je hebt een match gevonden.");
                x.setGematched(true);
                y.setGematched(true);
                aantalGevondenKaarten+=2;
            }
            else{
                System.out.println("Jammer, probeer het opnieuw.");
            }

        }
        System.out.println("Gefeliciteerd " +speler1.getNaam()+" je hebt alle matches gevonden!");







    }
}
