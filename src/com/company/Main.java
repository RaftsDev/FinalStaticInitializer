package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Create instance of Math - Error private acces to constructor.
        //Math m = new Math(); *** Error

        //Create subclasses of Math - Error Math class is Final
        /*public class m extends Math {   *** Error

        }*/

        System.out.println("PI="+Math.PI);// PI - static final constant

        SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");

        System.out.println(one.getName()+": "+one.instanceNumber);
        System.out.println(two.getName()+": "+two.instanceNumber);

        //Check acces to change value of final variable - Error
        //one.instanceNumber = 100; *** Error

        StaticInit sib = new StaticInit("Test");

    }
}
