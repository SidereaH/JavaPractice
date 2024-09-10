package org.javapractice.sep5;

/**
 * @author Siderea
 * @version 1.0
 */
public class Cat extends Animal {
    private String owner;

    /**
     * Конструктор кота
     * @param name Имя кота
     * @param age Возраст кота
     * @param owner Хохяин кота
     */
    public Cat(String name, int age, String owner){
        super(name, age);
        this.owner = owner;
    }
    /**
     * Установка нового хозяина для кота
     * @param newOwner установка нового хозяина
     */
    public void setOwner(String newOwner){
        this.owner = newOwner;
    }

    /**
     * Возвращает хохяина кота
     * @return хозяин кота
     */
    public String getOwner(){
        return this.owner;
    }

    public void meow(){
        System.out.println("meow!");
    }
    public void jump(){
        System.out.println("jumps!");
    }

    /**
     * Переопределение метода toString
     * @return Описание кота.
     */
    @Override
    public String toString(){

        return String.format("""
                Cat name is: %s;
                Cat age is: %d;
                Cats owner: %s;
                Cats counted:%d.
                """,
                super.getName(),
                super.getAge(),
                this.owner,
                super.getCount()
        );
    }
}
