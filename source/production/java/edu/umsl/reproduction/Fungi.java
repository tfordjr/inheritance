package edu.umsl.reproduction;

public abstract class Fungi extends Creature implements Reproduction {
    public Fungi() {   System.out.print("Fungi created. ");   }

    public String eatFood() {  return "external digestion with hyphae";   }

    public String modeOfReproduction() { return "spores";  }

    public String toString() {  return super.toString() + "But more specifically, I am a Fungi. ";  }
}
