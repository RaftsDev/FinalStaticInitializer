package com.company;

public class StaticInit {
    private String name;
    private static String someProperty;

    static {
        someProperty = "1st call of static bloc";
        System.out.println(someProperty);
    }

    public StaticInit(String name) {
        this.name = name;
        System.out.println("Call constructor");
    }

    static {
        someProperty+=" 2nd call of static bloc";
        System.out.println(someProperty);
    }
}
