// Terry Ford Jr - Project 5 - Inheritance - CS 2261
// Project is completed, exciting new OOP concepts.
// Let me know if there is anything I can improve or change @ tgfkf9@umsystem.edu Thank you!

package edu.umsl.reproduction;
import java.util.ArrayList;

public abstract class Creature {
    public Creature() {  System.out.print("Creature Created. ");  }

    public abstract String eatFood();

    public String toString() {  return "I am a Creature. ";  }

    public static void main (String[] args) {

        System.out.println("Animal List:");
        ArrayList<Animal> animalList = new ArrayList<>();
        Panther panther = new Panther();
        Platypus platypus = new Platypus();
        animalList.add(panther);
        animalList.add(platypus);

        for (int i = 0; i < 2; i++) {
            System.out.println(animalList.get(i));
        }

        System.out.println("\nPlant List:");
        ArrayList<Plant> plantList = new ArrayList<>();
        Bellsprout bellsprout = new Bellsprout();
        Kudzu kudzu = new Kudzu();
        plantList.add(bellsprout);
        plantList.add(kudzu);

        for (int i = 0; i < 2; i++) {
            System.out.println(plantList.get(i));
        }

        System.out.println("\nFungi List:");
        ArrayList<Fungi> fungiList = new ArrayList<>();
        Clicker clicker = new Clicker();
        Mushroom mushroom = new Mushroom();
        fungiList.add(clicker);
        fungiList.add(mushroom);

        for (int i = 0; i < 2; i++) {
            System.out.println(fungiList.get(i));
        }
    }
}

// The ArrayList Class can store objects in an array. The arrayList class has unlimited size.
// An array could do this also but with static size; size is fixed once created