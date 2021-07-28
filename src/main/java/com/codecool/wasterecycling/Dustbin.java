package com.codecool.wasterecycling;

import java.util.*;

public class Dustbin {

        private String color;
        private static ArrayList<String> dustBin = new ArrayList<String>();

        public Dustbin(String color) {
                this.color = color;
        }

        public String getColor() {
                return this.color;
        }

        public static void throwOutGarbage(String name) {
                dustBin.add(name);
                System.out.println(dustBin);
        }



}
