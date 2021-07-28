package com.codecool.wasterecycling;

import static com.codecool.wasterecycling.Dustbin.throwOutGarbage;

public class Main {

    public static void main(String[] args) {
            Dustbin kuka = new Dustbin("Green");
            System.out.println(kuka.getColor());
            throwOutGarbage(new PlasticGarbage("sajt", "gloves"));
            throwOutGarbage(new PaperGarbage("azaz", "box"));
            throwOutGarbage(new Garbage("dirty", "thermonuclear house waste"));
            System.out.println(Dustbin.dustBin);

    }
}
