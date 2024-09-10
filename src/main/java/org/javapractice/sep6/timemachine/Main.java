package org.javapractice.sep6.timemachine;

public class Main {
    public static void main(String[] args) {
        var timeMachine = new TimeMachine();
        int currentyear = 2023;
        System.out.println("Сейчас " + currentyear);
        timeMachine.goToFuture(2023);
        System.out.println("После готуфутуре" + currentyear);

        timeMachine.goToPast(2023);

        var catik = new Cat(20);

        System.out.println("до путешествия" + catik.age);
        timeMachine.goToFuture(catik);
        System.out.println("кот после путешествия в ьулущее" + catik.age);
        //магия!!! объекты передаются по ссылке и изменяются в памятиии!!! а обычные примитивы не изменяются потому что передаются по значению
        timeMachine.goToPast(catik);
        System.out.println("on vernulsa" + catik.age);
    }
}
