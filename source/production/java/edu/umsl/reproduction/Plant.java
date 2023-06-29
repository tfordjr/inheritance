package edu.umsl.reproduction;

public abstract class Plant extends Creature implements Reproduction {
    public Plant() {   System.out.print("Plant created. ");  }

    public String eatFood() {   return "sunlight (aka photosynthesis)";   }

    public String modeOfReproduction() { return "seeds";  }

    public String toString() {  return super.toString() + "But more specifically, I am a Plant. ";   }
}
