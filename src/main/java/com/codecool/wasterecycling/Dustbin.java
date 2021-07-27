package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {

        private String color;
        ArrayList<String> dustBin = new ArrayList<String>();

        public Dustbin(String color) {
                this.color = color;
        }

        public String getColor() {
                return this.color;
        }

        public void throwOutGarbage(Garbage name) {
                if (true) {
                        dustBin.add("thrown");
                } else {
                        System.out.println("Exception");
                }
        }



}
