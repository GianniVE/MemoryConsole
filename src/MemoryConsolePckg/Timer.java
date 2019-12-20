package MemoryConsolePckg;

import java.time.Duration;
import java.time.LocalDateTime;

public class Timer {
    Duration totaleSpeeltijd;
    LocalDateTime startTijd;
    LocalDateTime eindTijd;

    public void startTijd(){
        startTijd = LocalDateTime.now();
    }
    public void Eindtijd()
    {
        eindTijd = LocalDateTime.now();
    }
    public void totaleSpeeltijdBerekenen()
    {
        totaleSpeeltijd = Duration.between(eindTijd, startTijd);
        totaleSpeeltijd.toSeconds();
    }
}
