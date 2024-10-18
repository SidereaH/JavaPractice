package org.javapractice.oct15.kt.animalseasy;

import org.javapractice.oct15.kt.animalseasy.exceptions.StringDoNotContainsNumbersException;
import org.javapractice.oct15.kt.animalseasy.exceptions.StringIsEmptyException;
import org.javapractice.oct15.kt.animalseasy.Animal.Type;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animaaals!!! Task 1 (Easy)");
        var cat = new Cat(12, "Murzi");
        var dog = new Dog("Nikitka", 18);
        var mumu = new Cow("Burenka", 30);

        Array animals = new Array(3);
        animals.add(cat);
        animals.add(dog);
        animals.add(mumu);
        for (Animal animal : animals.getArray()) {
            animal.makeSound();
        }


        var in = new Scanner(System.in);
        boolean isContinue = true;
        Animal animal = null;
        while(isContinue ==true) {

            Type typeOfAnimal = null;
            while(true) {
                System.out.println("Выберите тип животного: cat - 1, dog - 2, cow - 3");
                String num = null;
                try{
                    num = in.nextLine();
                    if (!checkForNum(num)){
                        throw new Exception();
                    }
                }catch (Exception e) {
                    System.out.println("Введите корректное число");
                    continue;
                }
                if (num.equals("1")) {
                    animal = new Cat();
                }
                else if (num.equals("2")) {
                    animal = new Dog();
                }
                else if (num.equals("3")) {
                    animal = new Cow();
                }
                else {
                    System.out.println("Введите корректное число");
                    continue;
                }
                break;
            }

            String animalName = null;
            while(true) {
                System.out.println("Введите имя для " + animal.getType());
                String name = null;
                try{
                    name = in.nextLine();
                    if (name.isEmpty()){
                        throw new StringIsEmptyException();
                    }
                    else if (checkForNum(name)){
                        throw new StringDoNotContainsNumbersException();
                    }
                    else if (name == null){
                        throw new NullPointerException();
                    }
                } catch (StringIsEmptyException e){
                    System.out.println(e.getMessage());
                    continue;
                }
                catch (StringDoNotContainsNumbersException e){
                    System.out.println(e.getMessage());
                    continue;
                }
                catch (NullPointerException e){
                    System.out.println("String cant be null");
                    continue;
                }
                animalName = name;
                break;
            }
            int age = 0;
            while(true) {
                System.out.println("Введите возраст для " + animal.getType());
                String ag = null;
                try{

                    ag = in.nextLine();
                    if (ag.isEmpty()){
                        throw new StringIsEmptyException();
                    }
                    else if (!checkNum(ag)){
                        throw new StringDoNotContainsNumbersException();
                    }
                    else if (ag.equals("0")){
                        throw new NullPointerException();
                    }
                } catch (StringIsEmptyException e){
                    System.out.println(e.getMessage());
                    continue;
                }
                catch (StringDoNotContainsNumbersException e){
                    System.out.println("Age must contain numbers");
                    continue;
                }
                catch (NullPointerException e){
                    System.out.println("Age can`t be 0");
                    continue;
                }
                age = Integer.parseInt(ag);
                break;
            }
            animal.setName(animalName);
            animal.setAge(age);
            System.out.println(animal);
            animals.add(animal);
            while (true){
                System.out.println("Add more? Y/n");
                String cont = in.nextLine();
                if (cont.equalsIgnoreCase("Y")){
                    isContinue = true;

                }
                else if (cont.equalsIgnoreCase("n")){
                    isContinue = false;
                }
                else {
                    continue;
                }
                break;
            }
        }
        for(Animal bro : animals.getArray()){
            bro.makeSound();
        }
    }
    public static boolean checkForNum(String integer) {
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(integer);
        return m.matches();
    }
    public static boolean checkNum(String integer) {
        Pattern p = Pattern.compile("^(?<![-.])\\b[0-9]+\\b(?!\\.[0-9])$");
        Matcher m = p.matcher(integer);
        return m.matches();
    }
}
