package edu.umsl.reproduction;

public class Clicker extends Fungi {
    public Clicker() { System.out.println("Clicker created."); }

    public String toString() {
        return super.toString() + "I am also a Clicker. \nI eat via " + this.eatFood() +
                " and reproduce through " + this.modeOfReproduction() +
                ".\nI am from 'The Last of Us' zombie game, but my ability to take over " +
                "my host is based on the real life cordyceps fungi.";
    }

    public static void main(String[] args) {
        Clicker ellie = new Clicker();
        System.out.println(ellie.toString());
    }
}