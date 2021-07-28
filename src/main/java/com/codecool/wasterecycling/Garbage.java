package com.codecool.wasterecycling;

public class Garbage {

        String name;
        String state;

        public Garbage(String state, String name){
                this.name = name;
                this.state = state;
                Dustbin.throwOutGarbage(name);
        }

        public Garbage() {

        }

        public String getName() {
                return this.name;
        }
}
