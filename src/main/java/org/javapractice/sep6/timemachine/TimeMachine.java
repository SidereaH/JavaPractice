package org.javapractice.sep6.timemachine;

public class TimeMachine {
    public void goToFuture(int currentYear){
        currentYear+=10;
    }
    public void goToPast(int currentYear){
        System.out.println("Метод паст начал работу");
        System.out.println("до работы " + currentYear);
        currentYear-=10;
        System.out.println("после " + currentYear);
    }
    public void goToFuture(Cat cat){
        cat = new Cat(cat.age);
        cat.age += 10;
    }
    public void goToPast(Cat cat){
        cat = new Cat(cat.age);
        cat.age -= 10;
    }
}
