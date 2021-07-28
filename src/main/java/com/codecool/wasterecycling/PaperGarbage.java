package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {

        public PaperGarbage(String state, String name) {
                this.name = name;
                this.state = state;

        }

        public static boolean isSqueezed() {
                if (state != "squeezed") {
                        return false;
                } else {
                        return true;
                }
        }

        public static void squeeze() {
                state = "squeezed";
        }

}
