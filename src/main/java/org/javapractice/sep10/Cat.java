package org.javapractice.sep10;

public class Cat {
    private String name;
    private int age;
    private static int count = 0;
    private int id;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        this.id = count;
    }
    public Cat(){
        this.name = "Уличный кот";
        this.age = -1;
        count++;
        this.id = count;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }
    @Override
    public String toString(){
        return String.format("""
                Id: %d,
                Имя: %s,
                Возраст: %d.
                """, getId(),  getName(), getAge() );
    }
}
