package org.example;

public abstract class Animal implements AnimalTemp{
    private String name;
    private int age;
    private static int count = 0;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }
    /**
     *
     * @return Возвращает имя кота
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @param newName Новое имя кота
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     *
     * @return Возвращает возраст кота
     */
    public int getAge(){
        return this.age;
    }
    /**
     *
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
                Cat name is: %s;
                Cat age is: %d;
                Cats counted:%d.
                """, name, age, count);
    }

}
