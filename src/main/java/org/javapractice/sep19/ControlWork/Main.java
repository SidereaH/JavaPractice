package org.javapractice.sep19.ControlWork;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Напишите консольное приложение на Java, которое
//        реализует простой калькулятор. Калькулятор
//        должен поддерживать следующие операции: сложение, вычитание,
//        умножение и деление. Пользователь должен вводить операцию
//        (например, "+") и два числа.
        ArrayList<Double> results = new ArrayList<>();
        boolean exit = false;
        while(exit == false){
            System.out.println("Калькулятор\n Введите действие +, -, *, /");
            boolean actionSelected = false;
            String action = "";
            var in = new Scanner(System.in);
            while (actionSelected == false){
                action = in.nextLine();
                if (action.equals("+") || action.equals("-") ||  action.equals("/")  || action.equals("*")){
                    actionSelected = true;
                    System.out.printf("Вы выбрали %s\n", action);
                }
                else {
                    System.out.println("Введите корректную операцию");
                }
            }
            System.out.println("Введите первое число");
            String astr = "";
            String bstr = "";
            boolean isCorrect;

            do {
                System.out.println("Введите число a");
                Scanner scanner = new Scanner(System.in);
                astr = scanner.nextLine();
                isCorrect = check(astr);
            } while (!isCorrect);
            isCorrect = false;
            do {
                System.out.println("Введите число b");
                Scanner scanner = new Scanner(System.in);
                bstr = scanner.nextLine();
                isCorrect = check(bstr);
                if (isCorrect){
                    double bstrint = Double.parseDouble(bstr);
                    if (bstrint == 0 && action.equals("/")){
                        isCorrect = false;
                        System.out.println("На ноль нельзя делиить");
                    }
                }
            } while (!isCorrect);
            double a =  Double.parseDouble(astr);
            double b = Double.parseDouble(bstr);
            double success = 0;
            switch (action){
                case "+":
                    success = sum(a,b);
                    break;
                case "-":
                    success = minus(a,b);
                    break;
                case "*":
                    success = multiply(a,b);
                    break;
                case "/":
                    success = divide(a,b);
                    break;
                default:
                    System.out.println("Ошибка!");
                    break;
            }
            System.out.printf("%s%s%s = %s",a,action,b,success);
            results.add(success);
            System.out.println("Хотите вычислить факториал? +/-");
            String typeOf = in.nextLine();

            if (typeOf.equals("+")){
                isCorrect = false;
                String number = "";
                double num;
                do {
                    System.out.println("Введите число");
                    Scanner scanner = new Scanner(System.in);
                    number = scanner.nextLine();
                    isCorrect = check(number);
                } while (!isCorrect);
                num = Integer.parseInt(number);
                double fact =factorial(num);
                System.out.println(fact);
                results.add(fact);
            }
            System.out.println("Ваши результаты операций");
            System.out.println(results);
            System.out.println("Повторить? + / -");
            if(in.hasNextLine()){
                String answer = in.nextLine();
                if (answer.equals("-")){
                    exit = true;
                }
            }
        }

//      2)Создать Java-приложение, которое выводит таблицу умножения для указанного пользователем числа.
        String number;
        boolean isCorrect;
        do {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextLine();
            isCorrect = check(number);
        } while (!isCorrect);
        int num = Integer.parseInt(number);
        for (int i = 1; i <= 9; i++){
            int answer = i*num;
            System.out.printf("%d * %d = %d\n",num , i, answer);
        }
//        Задание 3
//        Создать Java-приложение, которое реализует поиск заданного пользователем символа в заданной пользователем строке
        System.out.println("Введите строку");
        var in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println("Введите символ");
        String search = in.nextLine();
        if (search.contains(string)){
            System.out.println("Такого нет");
        }
        else{
            System.out.println("Найдено");
            System.out.println(string.indexOf(search));
        }
//        Задание 4
//        Создать Java-приложение, которое по номеру дня недели выводит его название
        String dayOfWeek;
        do {
            System.out.println("Введите номер дня недели");
            Scanner scanner = new Scanner(System.in);
            dayOfWeek = scanner.nextLine();
            isCorrect = check(dayOfWeek);
        } while (!isCorrect);
        int day = Integer.parseInt(dayOfWeek);
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Нет такого дня");
        }
    }
    static double factorial(double a){
        double result = 1;
        for(int i = 1; i <= a; i++){
            result = result * i;
        }
        return result;
    }
    public static boolean check(String integer) {
        Pattern p = Pattern.compile("^[0-9]{1,9}$");
        Matcher m = p.matcher(integer);
        return m.matches();
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(double a, double b){
        return (int) (a + b);
    }
    static int minus(int a, int b){
        return a - b;
    }
    static int minus(double a, double b){
        return (int) (a - b);
    }
    static int divide(int a, int b){
        return a / b;
    }
    static int divide(double a, double b){
        return (int) (a / b);
    }
    static int multiply(int a, int b){
        return a * b;
    }
    static int multiply(double a, double b){
        return (int) (a * b);
    }
}
