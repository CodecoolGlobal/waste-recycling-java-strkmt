package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {


        public PlasticGarbage(String state, String name) {
                this.name = name;
                this.state = state;

        }

        public static boolean isClean() {
                if (state != "clean") {
                        return false;
                } else {
                        return true;
                }
        }

        public static void clean() {
                state = "clean";
        }
}
