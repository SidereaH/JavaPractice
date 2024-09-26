package org.javapractice.sep26_abstractclass.practice.translator;

public class Main {
    public static void main(String[] args) {
        var trans = new EnglishTranslator("Russian");
        System.out.println(trans.getLanguage());
        trans.translate();
    }
}
