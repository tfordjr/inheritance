package edu.umsl.reproduction;

public abstract class Animal extends Creature implements Reproduction {
    public Animal() {
        System.out.print("Animal created. ");
    }

    public String eatFood() { return "ingestion"; }

    public String modeOfReproduction() { return "sexual reproduction";  }

    public String toString() { return super.toString() + "But more specifically, I am an Animal. ";  }
}
