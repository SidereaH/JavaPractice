package org.javapractice.sep5;

public class Main {

    public static void main(String[] args) {
        Runnable task = () -> {
            var cat = new Cat("Барсик", 12, "Andrey");
            System.out.println(cat);
            int catAge = cat.getAge();
            String catName = cat.getName();
            cat.setAge(18);
            cat.setName("Сергей");
            cat.setOwner("Pepe");
            System.out.println("Изменили первого кота: \n" + cat);
            cat.print();
        };
        Runnable catolega = () -> {
            var catOleg = new Cat("Олег", 2, "papa");
            System.out.println(catOleg);
        };
        new Thread(task).start();
        new Thread(catolega).start();
    }
}