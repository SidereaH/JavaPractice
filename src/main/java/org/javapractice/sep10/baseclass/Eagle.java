package org.javapractice.sep10.baseclass;

public class Eagle extends Animal{
    private int razmahkrylev;

    public Eagle(String brain, String heart, int razmahkrylev) {

        super(brain, heart);
        this.razmahkrylev = razmahkrylev;
        System.out.println("Конструктор орла вызван");
    }

    public int getRazmahkrylev() {
        return razmahkrylev;
    }

    public void setRazmahkrylev(int razmahkrylev) {
        this.razmahkrylev = razmahkrylev;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Eagle{" +
                "razmahkrylev=" + razmahkrylev +
                '}';
    }
}
