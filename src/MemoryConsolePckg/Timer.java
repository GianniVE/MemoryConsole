package MemoryConsolePckg;

import java.time.Duration;
import java.time.LocalTime;

public class Timer {
    Duration totaleSpeeltijd;
    LocalTime startTijd;
    LocalTime stopTijd;

    public void startTijd(){
        startTijd = LocalTime.now();
    }

    public void stopTijd()
    {
        stopTijd = LocalTime.now();
    }

    //Methode voor de gespeelde tijd te berekenen
    public void totaleSpeeltijdBerekenen()
    {
        totaleSpeeltijd = Duration.between(stopTijd, startTijd);
        System.out.println("Je hebt "+Math.abs(totaleSpeeltijd.toMinutes())+" minuten gespeeld."); //Math.abs voor de absolute waarde van de minuten
        // anders krijgen we een negatief getal.
    }
}
