package MemoryConsolePckg;

public class Kaart {
    //declaratie variabelen
    int getal;
    boolean gematched;

    //default constructor
    public Kaart(){

    }

    //constructor met parameter
    public Kaart(int getal) {
        this.getal = getal;
        this.gematched = false;
    }

    //getter voor het getal
    public int getGetal() {
        return getal;
    }

    //setter voor het getal
    public void setGetal(int getal) {
        this.getal = getal;
    }

    //teruggeven als het gematched is
    public boolean isGematched() {
        return gematched;
    }

    //setter voor gematched
    public void setGematched(boolean gematched) {
        this.gematched = gematched;
    }
}
