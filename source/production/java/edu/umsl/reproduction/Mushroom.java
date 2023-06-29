package edu.umsl.reproduction;

public class Mushroom extends Fungi {
    public Mushroom() { System.out.println("Mushroom created."); }

    public String toString() {
        return super.toString() + "I am also a Mushroom. \nI eat via " + this.eatFood() +
                " and reproduce through " + this.modeOfReproduction() +
                ".\nI am delicious on pizza.";
    }

    public static void main(String[] args) {
        Mushroom shroomish = new Mushroom();
        System.out.println(shroomish.toString());
    }
}