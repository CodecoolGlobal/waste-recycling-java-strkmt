package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {


        public PlasticGarbage(String state, String name) {
                this.name = name;
                if (isClean()) {
                        System.out.println("It's clean!");
                        Dustbin.throwOutGarbage(name);
                } else {
                        System.out.println("It's not clean!");
                        clean();
                        System.out.println("Now it's clean! How Amazing!");
                        Dustbin.throwOutGarbage(name);
                }

        }

        public boolean isClean() {
                if (state != "clean") {
                        return false;
                } else {
                        return true;
                }
        }

        public void clean() {
                this.state = "clean";
        }
}
