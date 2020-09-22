package com.company;

public class SomeClass {
    private String name;
    public final int instanceNumber;
    public static int counter;

    public SomeClass(String name) {
        this.name = name;
        counter++;
        this.instanceNumber = counter;
    }

    public String getName() {
        return name;
    }
}
