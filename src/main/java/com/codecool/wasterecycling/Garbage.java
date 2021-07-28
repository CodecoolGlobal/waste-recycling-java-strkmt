package com.codecool.wasterecycling;

public class Garbage {

        protected String name;
        protected static String state;

        public Garbage(String state, String name){
                this.name = name;
                this.state = state;
        }

        public Garbage() {

        }

        public String getName() {
                return this.name;
        }
}
