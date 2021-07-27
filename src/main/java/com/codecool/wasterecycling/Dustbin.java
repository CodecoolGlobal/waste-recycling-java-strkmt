package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {

        private String color;
        String[] dustBin;

        public Dustbin(String color) {
                this.color = color;
        }

        public String getColor() {
                return this.color;
        }

        public void throwOutGarbage(Garbage name) {
                if (garbage.throwable()) {
                        dustBin.add(garbage.getName());
                } else {
                        System.out.println("Exception");
                }
        }



}
