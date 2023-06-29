package edu.umsl.reproduction;

public class Bellsprout extends Plant {
    public Bellsprout() { System.out.println("Bellsprout created."); }

    public String toString() {
        return super.toString() + "I am also a Bellsprout. \nI eat via " + this.eatFood() +
                " and reproduce through " + this.modeOfReproduction() +
                ".\nI am a funny looking Pokemon.";
    }

    public static void main(String[] args) {
        Bellsprout belle = new Bellsprout();
        System.out.println(belle.toString());
    }
}
