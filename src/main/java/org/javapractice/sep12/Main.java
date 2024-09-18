package org.javapractice.sep12;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(" a + b =  " + (a + b));
        System.out.println("day of week");
        if (in.hasNextLine()){
            String day = in.nextLine();
            if (day.equalsIgnoreCase("понедельник") || day.equalsIgnoreCase("вторник") || day.equalsIgnoreCase("среда") || day.equalsIgnoreCase("четверг") || day.equalsIgnoreCase("пятница")){
                System.out.println("its workday");
            } else if (day.equalsIgnoreCase("Суббота") || day.equalsIgnoreCase("Воскресенье")) {
                System.out.println("its holiday");
            }
            else{
                System.out.println("you write a piece of " + day);
            }

            switch (day.toLowerCase()) {
                case "понедельник":
                    System.out.println("работаем");
                    break;
                case "вторник":
                    System.out.println("работаем");
                    break;
                case "среда":
                    System.out.println("работаем");
                    break;
                case "четверг":
                    System.out.println("работаем");
                    break;
                case "пятница":
                    System.out.println("работаем");
                    break;
                case "суббота":
                    System.out.println("отдых");
                    break;
                case "воскресенье":
                    System.out.println("отдых");
                    break;

                default:
                    System.out.printf("что ты написал %s ??", day);
                    break;
            }
        }
        var inscan = new Scanner(System.in);
        System.out.println("write a");
        int a = 0, b = 0, c = 0;
        String operand = "";
        if (inscan.hasNextLine()){
            a = in.nextInt();
        }
        System.out.println("write b");
        if (inscan.hasNextLine()){
            b = in.nextInt();
        }
        System.out.println("write operator");
        operand = in.nextLine();
        switch (operand) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "/":
                c = a / b;
                break;
            case "*":
                c = a * b;
                break;
            default:
                System.out.printf("что ты написал %s ??", operand);
                break;
        }
        System.out.println("c = " + c);
    }
}

