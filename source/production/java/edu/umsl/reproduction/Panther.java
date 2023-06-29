package edu.umsl.reproduction;

public class Panther extends Animal {
    public Panther() { System.out.println("Panther created."); }

    public String toString() {
        return super.toString() + "I am also a Panther. \nI eat via " + this.eatFood() +
                " and reproduce through " + this.modeOfReproduction() +
                ".\nYou don't want me to bite you.";
    }

    public static void main(String[] args) {
        Panther pan = new Panther();
        System.out.println(pan.toString());
    }
}
