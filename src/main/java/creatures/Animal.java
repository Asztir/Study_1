package main.java.Zajecia_1;

public class Animal {

    //private static final double DEFAULT_WEIGHT_ = 6.00;
    String species;
    String name;
    Double weight;
    Boolean isAlive;

    public Animal(String species){
        this.isAlive = true;
        this.species = species;
        //switch (species){
          //  case "canis" -> weight = DEFAULT_WEIGHT_;
        }


    void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Yes! Of course");
        } else {
            System.out.println("no, too late");
        }
    }

    void feed(Double weightOfFood) {
        weight += weightOfFood;
        if (isAlive == true) {
            weight += 0.5;
            System.out.println("thx ");
        } else {
            System.out.println("too late");
        }
    }

        void life () {
        if (isAlive == false) {
            System.out.println("Dog is dead call the police");
        } else {
            weight -= 0.5;
            if(weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("thx for walk");
            }
        }

        }

    }

