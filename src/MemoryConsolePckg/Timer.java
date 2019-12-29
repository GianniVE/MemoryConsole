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
        System.out.println("Je hebt "+totaleSpeeltijd.toMinutes()+" minuten gespeeld.");
    }
}
