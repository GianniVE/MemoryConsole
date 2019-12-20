package MemoryConsolePckg;

public class Kaart {
    int getal;
    boolean gematched;

    public Kaart(){

    }

    public Kaart(int getal) {
        this.getal = getal;
        this.gematched = false;
    }

    public int getGetal() {
        return getal;
    }

    public void setGetal(int getal) {
        this.getal = getal;
    }

    public boolean isGematched() {
        return gematched;
    }

    public void setGematched(boolean gematched) {
        this.gematched = gematched;
    }
}
