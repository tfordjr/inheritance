package edu.umsl.reproduction;

public class Platypus extends Animal {
    public Platypus() { System.out.println("Platypus created."); }

    public String toString() {
        return super.toString() + "I am also a Platypus. \nI eat via " + this.eatFood() +
                " and reproduce through " + this.modeOfReproduction() +
                ".\nI am Perry the Platypus, international super spy.";
    }

    public static void main(String[] args) {
        Platypus perry = new Platypus();
        System.out.println(perry.toString());
    }
}
