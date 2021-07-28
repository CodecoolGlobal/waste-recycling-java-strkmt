package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) {
            Dustbin kuka = new Dustbin("Green");
            System.out.println(kuka.getColor());
            Garbage szemet = new PlasticGarbage("sajt", "gloves");
            Garbage szemet2 = new PaperGarbage("azaz", "box");
            Garbage szemet3 = new Garbage("dirty", "thermonuclear house waste");

    }
}
