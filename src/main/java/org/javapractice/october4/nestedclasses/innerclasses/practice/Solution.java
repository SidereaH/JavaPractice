package org.javapractice.october4.nestedclasses.innerclasses.practice;

public class Solution {
    public void main(String[] args) {
        Cat cat = new Cat("Tom");
        System.out.println(cat.getName());
    }
    class Cat {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Cat(String name) {
            this.name = name;
        }
    }
}