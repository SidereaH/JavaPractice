package org.example;

public class Main {

    public static void main(String[] args) {
        var cat = new Cat("Барсик", 12, "Andrey");
        System.out.println(cat);
        var catOleg = new Cat("Олег", 2, "papa");
        System.out.println(catOleg);
        int catAge = cat.getAge();
        String catName = cat.getName();
        cat.setAge(18);
        cat.setName("Сергей");
        cat.setOwner("Pepe");
        System.out.println("Изменили первого кота: \n" + cat);

    }

}