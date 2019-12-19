package MemoryConsolePckg;

import java.util.*;

public class Spelbord {
    static int[][] kaarten = new int[4][4];
    static boolean[][] upDown = new boolean[4][4];
    static Scanner s = new Scanner(System.in);

    public static void setup() {
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 4; a++) {
                upDown[i][a]=false;
            }
        }
        kaarten = randomizer(); //Shuffle cards
    }


    public static void ToonSpelbord(boolean[][] upDown, int[][] kaarten) {

        System.out.println("     1 2 3 4 ");
        System.out.println("---+---------");

        for (int i = 0; i < 4; i++) {
            System.out.print(" " + (i + 1) + " | ");
            for (int a = 0; a < 4; a++) {
                if (upDown[i][a]) {
                    System.out.print(kaarten[i][a]);
                    System.out.print(" ");
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static int[][] randomizer() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        int[][] kaarten = new int[4][4];
        Random random = new Random();
        int temp, t;
        for (int j = 0; j <= 20; j++) {
            for (int x = 0; x < 16; x++) { //Randomize the card order
                t = random.nextInt(1000) % 15;
                temp = num[x];
                num[x] = num[t];
                num[t] = temp;

            }
            t = 0;
            for (int r = 0; r < 4; r++) // Cards receive Numbers
            {
                for (int s = 0; s < 4; s++) {
                    kaarten[r][s] = num[t];
                    t = t + 1;
                }
            }

        }
        return kaarten;
    }


    public static void spel(boolean[][] upDown, int[][] kaarten) {
        //Start the Game
        int noDownCards = 16;
        while (noDownCards > 0) {
            ToonSpelbord(upDown, kaarten);
            System.out.println("Geef het eerste coördinaat (verticaal en horizontaal cijfer aan elkaar, bvb. 12)");
            String coördinaat1 = s.next();
            int coördinaat1_1 = Integer.valueOf(coördinaat1.substring(0, 1))-1;
            int coördinaat1_2 = Integer.valueOf(coördinaat1.substring(1, 2))-1;
            System.out.println(cards[coördinaat1_1][coördinaat1_1]);

            System.out.println("Geef het tweede coördinaat (verticaal en horizontaal cijfer aan elkaar, bvb. 12)");
            String coördinaat2 = s.next();
            int coördinaat2_1 = Integer.valueOf(coördinaat2.substring(0, 1))-1;
            int coördinaat2_2 = Integer.valueOf(coördinaat2.substring(1, 2))-1;
            System.out.println(kaarten[coördinaat2_1][coördinaat2_2]);
            if (kaarten[coördinaat1_1][coördinaat1_2] == kaarten[coördinaat2_1][coördinaat2_2]) {
                System.out.println("Proficiat, je hebt twee gelijke cijfers gevonden.");
                upDown[coördinaat1_1][coördinaat1_2] = true;
                upDown[coördinaat2_1][coördinaat2_2] = true;
                noDownCards -= 2;
            }
            else {
                System.out.println("Jammer, je hebt geen gelijke cijfers gevonden.");
            }
        }
        ToonSpelbord(upDown, kaarten);
        System.out.println("Gefeliciteerd, je bent gewonnen.");

    }


    public static int[][] shuf() {
        int start[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        int kaarten[][] = new int[4][4];
        Random ran = new Random();
        int tmp, i;
        for (int s = 0; s <= 20; s++) {
            for (int x = 0; x < 16; x++) //randomize the card placements
            {
                i = ran.nextInt(100000) % 15;
                tmp = start[x];
                start[x] = start[i];
                start[i] = tmp;
            }
        }
        i = 0;

        for (int r = 0; r < 4; r++) // put values in cards here
        {
            for (int c = 0; c < 4; c++) {
                kaarten[r][c] = start[i];
                i = i + 1;
            }
        }
        return kaarten;

    }

}
