package org.javapractice.oct15.kt.library;

import org.javapractice.oct15.kt.animalseasy.Cat;
import org.javapractice.oct15.kt.animalseasy.Cow;
import org.javapractice.oct15.kt.animalseasy.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.javapractice.oct15.kt.animalseasy.Main.checkForNum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        var book = new Book("EugenOnegin");
        var book2 = new Book("TomSoyer");
        var book3 = new Book("TomSoyer");


        book.checkout();
        System.out.println(book.getCheckoutDate());
        System.out.println(book.getFee());
        System.out.println(book.calculateLateFees(10) + "рублей");
        System.out.println("Вас приветствует система управления библиотекой");
        var in = new Scanner(System.in);
        Library lib = new Library();
        lib.addBooks(book, book2, book3);
        while(true){
            String num = null;
            while(true){
                System.out.println("Выберите категорию: 1 - книги, 2 - DVD, 3 - журналы");
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
                    System.out.println("books");

                }
                else if (num.equals("2")) {
                    System.out.println("DVD");
                }
                else if (num.equals("3")) {
                    System.out.println("magazines");
                }
                else {
                    System.out.println("Введите корректное число");
                    continue;
                }
                break;
            }
            int choose = Integer.parseInt(num);
            if (choose == 1) {
                System.out.println(lib.getBooks());
                Book bookForManipulating = null;
                while(true){
                    System.out.println("Введите порядковый номер книги для манипуляций");
                    String input = in.nextLine();
                    try{
                        bookForManipulating = lib.getBook(Integer.parseInt(input));
                    }catch (NumberFormatException e){
                        System.out.println("id do not match");
                        continue;
                    }
                    catch (NullPointerException e){
                        System.out.println("This is not number");
                        continue;
                    }
                    break;
                }
                while(true){
                    System.out.println("Выберите тип операции: 1 - отдать книгу, 2 - вернуть книгу, 3 - проверить дату истечения срока аренды");
                    String input = in.nextLine();
                    try {
                        int idOperation = Integer.parseInt(input);
                        switch (idOperation) {
                            case 1: bookForManipulating.checkout();
                            break;
                            case 2: bookForManipulating.returnItem();
                            break;
                            case 3: bookForManipulating.getDueDate();
                            break;
                            default: throw new NullPointerException();
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Write number");
                        continue;
                    }
                    catch (NullPointerException e) {
                        System.out.println("this type of operation is not supported");
                        continue;
                    }
                    break;
                }
            }
            if (choose == 2) {
                System.out.println(lib.getDvds());
                DVD dvdForManipulating = null;
                while(true){
                    System.out.println("Введите порядковый dvd книги для манипуляций");
                    String input = in.nextLine();
                    try{
                        dvdForManipulating = lib.getDVD(Integer.parseInt(input));
                    }catch (NumberFormatException e){
                        System.out.println("id do not match");
                        continue;
                    }
                    catch (NullPointerException e){
                        System.out.println("This is not number");
                        continue;
                    }
                    break;
                }
                while(true){
                    System.out.println("Выберите тип операции: 1 - отдать книгу, 2 - вернуть книгу, 3 - проверить дату истечения срока аренды");
                    String input = in.nextLine();
                    try {
                        int idOperation = Integer.parseInt(input);
                        switch (idOperation) {
                            case 1: dvdForManipulating.checkout();
                                break;
                            case 2: dvdForManipulating.returnItem();
                                break;
                            case 3: dvdForManipulating.getDueDate();
                                break;
                            default: throw new NullPointerException();
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Write number");
                        continue;
                    }
                    catch (NullPointerException e) {
                        System.out.println("this type of operation is not supported");
                        continue;
                    }
                    break;
                }
            }
            if (choose == 3) {
                System.out.println(lib.getMagazines());
                Magazine magazineForManipulating = null;
                while(true){
                    System.out.println("Введите порядковый номер книги для манипуляций");
                    String input = in.nextLine();
                    try{
                        magazineForManipulating = lib.getMagazine(Integer.parseInt(input));
                    }catch (NumberFormatException e){
                        System.out.println("id do not match");
                        continue;
                    }
                    catch (NullPointerException e){
                        System.out.println("This is not number");
                        continue;
                    }
                    break;
                }
                while(true){
                    System.out.println("Выберите тип операции: 1 - отдать книгу, 2 - вернуть книгу, 3 - проверить дату истечения срока аренды");
                    String input = in.nextLine();
                    try {
                        int idOperation = Integer.parseInt(input);
                        switch (idOperation) {
                            case 1: magazineForManipulating.checkout();
                                break;
                            case 2: magazineForManipulating.returnItem();
                                break;
                            case 3: magazineForManipulating.getDueDate();
                                break;
                            default: throw new NullPointerException();
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Write number");
                        continue;
                    }
                    catch (NullPointerException e) {
                        System.out.println("this type of operation is not supported");
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
