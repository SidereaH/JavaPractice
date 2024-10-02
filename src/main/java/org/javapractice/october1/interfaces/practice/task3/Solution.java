package org.javapractice.october1.interfaces.practice.task3;

//Интерфейс SimpleObject


public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String> {
        private static String object = "this is object";
        @Override
        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }

}