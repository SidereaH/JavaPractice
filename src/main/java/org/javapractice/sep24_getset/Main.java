package org.javapractice.sep24_getset;

public class Main {
    public static void main(String[] args) throws EmptyException {
        var cat = new IncredibleCat("nikitka", 1,200);
        System.out.println(cat);
        String name  = cat.getName();
        cat.setName("");
        cat.setAge(22);
        cat.setWeight(22);
        System.out.println("oldname = " + name);
        System.out.println(cat);

    }
}
