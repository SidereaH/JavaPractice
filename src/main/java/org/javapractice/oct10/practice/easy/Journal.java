package org.javapractice.oct10.practice.easy;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Journal {
    private HashMap<Integer, User> journal;
    private int countUsers;
    public Journal(HashMap<Integer, User> journal) {
        this.journal = journal;
    }
    public Journal(){
        journal = new HashMap<>();
        journal.put(1, new User("Nikita", "Eliseev", 18 , "Java"));
        journal.put(2, new User("Nikita", "Eliseev", 18 , "Java"));
        journal.put(3, new User("Nikita", "Eliseev", 18 , "Java"));
        journal.put(4, new User("Nikita", "Eliseev", 18 , "Java"));
        journal.put(5, new User("Nikita", "Eliseev", 18 , "Java"));
        journal.put(6, new User("Nikita", "Eliseev", 18 , "Java"));
        journal.put(7, new User("Nikita", "Eliseev", 18 , "Java"));
        journal.put(8, new User("Nikita", "Eliseev", 18 , "Java"));
        countUsers = journal.size();
    }
    public void addUser(User user) {
        journal.put(countUsers++, user);
    }
    public void addUser(String firstName, String lastName, int age, String group){
        journal.put(countUsers++, new User(firstName, lastName, age, group));
    }
    public void getToDesk() throws UserDoNotMatch {
        User bro = null;
        var in = new Scanner(System.in);
        int idu = 0;
        boolean statusOfUser = false;
        while(true){
            while(statusOfUser == false){
                try {
                    if (in.hasNextLine()){
                        String num = in.nextLine();
                        if (check(num)){
                            idu = Integer.parseInt(num);
                        }
                        else{
                            throw new InputMismatchException();
                        }
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Нужно ввести целое число");
                    continue;
                }
                bro = journal.get(idu);
                try{
                    if (bro == null){
                        System.out.println("Не существует такого юзера c id = " + idu);
                        throw new UserDoNotMatch("Не существует такого юзера");
                    }
                    else {
                        System.out.println(bro);
                    }
                }
                catch (UserDoNotMatch e){
                    continue;
                }
                break;
            }
        }
    }

    public static boolean check(String integer) {
        Pattern p = Pattern.compile("^[0-9]*[.]?[0-9]+$");
        Matcher m = p.matcher(integer);
        return m.matches();
    }
}
