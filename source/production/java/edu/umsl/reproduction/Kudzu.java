package edu.umsl.reproduction;

public class Kudzu extends Plant {
    public Kudzu() { System.out.println("Kudzu created."); }

    public String toString() {
        return super.toString() + "I am also a Kudzu. \nI eat via " + this.eatFood() +
                " and reproduce through " + this.modeOfReproduction() +
                ".\nI am one of the world's most invasive plants.";
    }

    public static void main(String[] args) {
        Kudzu kudzu = new Kudzu();
        System.out.println(kudzu.toString());
    }
}