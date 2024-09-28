package org.javapractice.sep26_abstractclass.practice.controlwork.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        String again = "да";
        do{
            String country = null;
            var in = new Scanner(System.in);
            do {
                System.out.println("Выберите страну курицы: Беларусь - 1, Молдова - 2, Россия - 3, Украина - 4");
                country = in.nextLine();
            }while (!country.equals("1") && !country.equals("2") && !country.equals("3") && !country.equals("4"));
            if (country.equals("1")) {

                Hen hen = HenFactory.getHen(Country.BELARUS);
                System.out.println(hen.getDescription());
            }
            else if (country.equals("2")) {
                Hen hen = HenFactory.getHen(Country.MOLDOVA);
                System.out.println(hen.getDescription());
            }
            else if (country.equals("3")) {
                Hen hen = HenFactory.getHen(Country.RUSSIA);
                System.out.println(hen.getDescription());
            }
            else {
                Hen hen = HenFactory.getHen(Country.UKRAINE);
                System.out.println(hen.getDescription());
            }

            do {
                System.out.println("Просмотреть еще породы? да/нет");
                again = in.nextLine();
            }while (!again.equalsIgnoreCase("да") && !again.equalsIgnoreCase("нет"));

        }while(again.equalsIgnoreCase("да")); ;


    }
}
