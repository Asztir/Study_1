package Zajecia_1;

public class Phone extends urzadzenia {
    Integer id;
    String producer;
    String model;
    Double screeSize;
    Boolean isAndroid;

    void turnOn() {
        System.out.println("Push the button");
        System.out.println("weight");
        System.out.println("My phone " + producer + " is working");
    }
}


