package com.codecool.wasterecycling;

import java.util.*;

public class Dustbin {

        private String color;
        private static int houseWaste = 0;
        private static int paperWaste = 0;
        private static int plasticWaste = 0;
        public static ArrayList<Garbage> dustBin = new ArrayList<Garbage>();

        public Dustbin(String color) {
                this.color = color;
        }

        public String getColor() {
                return this.color;
        }

        public static void throwOutGarbage(Garbage garbage) {

                if (garbage instanceof PaperGarbage) {
                        if (PaperGarbage.isSqueezed()) {
                                System.out.printf("%s is squeezed! Throw it come on!", garbage.getName());
                                dustBin.add(garbage);
                                paperWaste++;
                                System.out.println("Good job!");
                        } else {
                                System.out.printf("What are you thinking? %s is not squeezed! Go squeeze it!", garbage.getName());
                                PaperGarbage.squeeze();
                                System.out.printf("Now %s is squeezed! How Amazing!", garbage.getName());
                                dustBin.add(garbage);
                                paperWaste++;
                                System.out.println("Perfetto!");
                        }
                }

                if (garbage instanceof PlasticGarbage) {
                        if (PlasticGarbage.isClean()) {
                                System.out.printf("%s is clean! Throw it come on!", garbage.getName());
                                dustBin.add(garbage);
                                plasticWaste++;
                                System.out.println("Good job!");
                        } else {
                                System.out.printf("What are you thinking? %s is not clean! Go clean it!", garbage.getName());
                                PlasticGarbage.clean();
                                System.out.printf("Now %s is cleaned!", garbage.getName());
                                dustBin.add(garbage);
                                plasticWaste++;
                                System.out.println("Planet Earth loves you!");
                        }
                }

                if (garbage instanceof Garbage) {
                        dustBin.add(garbage);
                        houseWaste++;
                } else {
                        System.out.println("Thats not garbage!");
                }


        }

        public int getHouseWasteCount() {
                return houseWaste;
        }

        public int getPaperWasteCount() {
                return paperWaste;
        }

        public int getPlasticWasteCount() {
                return plasticWaste;
        }



}
