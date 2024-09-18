package org.javapractice.sep5;

/**
 * @author Siderea
 * @version 1.0
 */
public class Animal implements AnimalTemp {
    private String name;
    private int age;
    private static int count = 0;

    /**
     * Конструктор класса животного
     * @param name Имя кота
     * @param age Возраст кота
     */
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }
    /**
     * @return Возвращает имя кота
     */
    public String getName(){
        return this.name;
    }
    /**
     * @param newName Новое имя кота
     */
    public void setName(String newName) {
        this.name = newName;
    }
    /**
     * @return Возвращает возраст кота
     */
    public int getAge(){
        return this.age;
    }
    /**
     * @param age Новый возраст кота
     */
    public void setAge(int age){
        this.age = age;
    }
    public int getCount(){
        return count;
    }
    /**
     * Переопределение метода toString
     * @return Описание кота
     */
    @Override
    public String toString(){
        return String.format("""
                Animal name is: %s;
                Animal age is: %d;
                Animals counted:%d.
                """, name, age, count);
    }
}
