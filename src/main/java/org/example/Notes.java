package org.example;

public class Notes {
    public static void main(String[] args) {
        Integer x = new Integer(2); // reference type - refers to something in memory
        int y = 2;// primitive type - stores data locally - passes value to functions rather than address
        //Integer is a wrapper class - reference-type counterparts to normal primitive type init
        Person a = new Student("name", 1, "100000");
        //^             ^- looks at this for constructors
        //looks at this for methods
        //Java looks up the extension tree for methods, but looks down for override
        // finds a method first by looking up then look down for override
        // blank reference type have null as their value
        // .class files are for computers to read, DO NOT USE THEM
    }
}
