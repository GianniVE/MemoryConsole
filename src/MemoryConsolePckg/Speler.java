package MemoryConsolePckg;

public class Speler {
    private String naam;
    private int score;
    private int gespeeldeBeurten;

    //Constructor maken voor nieuwe speler aan te maken.
    public Speler(String naam) {
        this.naam = naam;
    }

    //setters voor score en gespeeldeBeurten
    public void setScore(int score) {
        this.score = score;
    }

    public void setGespeeldeBeurten(int gespeeldeBeurten) {
        this.gespeeldeBeurten = gespeeldeBeurten;
    }

    //getters voor score, gespeeldeBeurten en naam
    public String getNaam() {
        return naam;
    }

    public int getScore() {
        return score;
    }

    public int getGespeeldeBeurten() {
        return gespeeldeBeurten;
    }
}
