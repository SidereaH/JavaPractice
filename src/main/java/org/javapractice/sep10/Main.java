package org.javapractice.sep10;


public class Main {
    public static void main(String[] args) {

        Runnable cats = () -> {
            var homie = new Cat("Олег", 10);
            var streety = new Cat();
            System.out.println(homie);
            System.out.println(streety);
            System.out.println("Всего котов: " + Cat.getCount());
        };
        Runnable cycles = () -> {
            System.out.println("whiles:");
            int i = 0;
            while (i != 8){
                System.out.println(i);
                i++;
            }

            int z = 100;
            while(z!= 0){
                System.out.println(z);
                z = z - 10;
            }
            System.out.println("dowhiles");
            int k = 0;
            do{
                System.out.println(k);
                k++;
            } while (k!=8);

            int j = 100;
            do{
                System.out.println(j);
                j-=10;
            } while (j!=0);
            System.out.println("fores");
            for(int ij = 0; ij <=7; ij++){
                System.out.println(ij);
            }
            for (int kj = 100; kj >=10; kj-=10){
                System.out.println(kj);
            }
            System.out.println("foreach");
            String[] daysOfWeek  = new String[]{
                    "Пн",
                    "Вт",
                    "Cр",
                    "Чт",
                    "Пт",
                    "Сб",
                    "Вс"
            };
            for(String day : daysOfWeek){
                System.out.println(day);
            }
        };
        new Thread(cats).start();
        new Thread(cycles).start();



    }

}
