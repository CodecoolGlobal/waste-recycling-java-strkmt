package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {

        String state;

        public PaperGarbage(String state, String name) {
                this.name = name;
                if (isSqueezed()) {
                        System.out.println("It's squeezed!");
                } else {
                        System.out.println("It's not squeezed!");
                        squeeze();
                        System.out.println("Now it's squeezed! How Amazing!");
                }

        }

        public boolean isSqueezed() {
                if (state != "squeezed") {
                        return false;
                } else {
                        return true;
                }
        }

        public void squeeze() {
                this.state = "squeezed";
        }
}
