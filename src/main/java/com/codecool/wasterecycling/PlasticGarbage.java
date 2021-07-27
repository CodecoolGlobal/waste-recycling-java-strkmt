package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {

        String state;

        public PlasticGarbage(String state, String name) {
                this.name = name;
                if (isClean()) {
                        System.out.println("It's clean!");
                } else {
                        System.out.println("It's not clean!");
                        clean();
                        System.out.println("Now it's clean! How Amazing!");
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
