package org.javapractice.oct10.practice.easy;

import org.javapractice.sep24_getset.EmptyException;

public class User {
    //medium/hard
    //Поработай обработчиком
    //Для начала разберись, что делает программа, а затем.
    //1. В методе addUser обработай значение, возвращаемое методом
    //setName:
    //если setName вернул -1, выведи сообщение: "Имя не может быть
    //null."
    //если -2, выведи сообщение: "Имя не может быть пустым."
    //если -3, выведи сообщение: "Имя не может содержать цифры."
    //если другое значение, кроме 0, выведи сообщение: "Неизвестная ошибка."
    //2. В методе addUser обработай значение, возвращаемое методом
    //setAge:
    //если setAge вернул -1, выведи сообщение: "Возраст не может быть меньше О."
    //если -2, выведи сообщение: "Возраст не может быть больше 150."
    //если другое значение, кроме 0, выведи сообщение "Неизвестная ошибка."
    //3. В методе findUserindex обработай значение, возвращаемое методом indexof:
    //если indexOf вернул -1, выведи сообщение "Пользователь 'имя пользователя> ' не найден."
    //иначе — оставь текущее сообщение
    //4. Класс User не изменяй.
    private String firstName;
    private String lastName;
    private int age;
    private String group;

    public User(String firstName, String lastName, int age, String group) {
        this.firstName = firstName;
        this.lastName = lastName;


        setAge(age);
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public int setFirstName(String firstName) {
        try{
            if (firstName == null){
                throw new NullPointerException();
            }
            else if (firstName.isEmpty()){
                throw new EmptyFieldException("");
            }
            else if (firstName.contains("1") || firstName.contains("2") || firstName.contains("3") || firstName.contains("4") || firstName.contains("5") || firstName.contains("6") || firstName.contains("7") || firstName.contains("8") || firstName.contains("9")){
                throw new RuntimeException();
            }

        } catch (NullPointerException e){
            System.out.println("first name can`t be null");
            return -1;
        } catch (EmptyFieldException e) {
            System.out.println("first name can`t be empty");
            return -2;
        } catch (RuntimeException e){
            System.out.println("First name can`t contains nums");
            return -3;
        }
        this.firstName = firstName;
        return 1;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        try{
            if (age < 0) {
                throw new ArithmeticException("Age cannot be negative");
            }
            else if (age > 150) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArithmeticException e){
            System.out.println("Age can`t be negative");
            return -1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Age can`t be bigger than 150");
            return -2;
        }

        this.age = age;
        return 1;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}
