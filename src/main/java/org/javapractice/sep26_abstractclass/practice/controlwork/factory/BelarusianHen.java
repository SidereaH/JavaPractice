package org.javapractice.sep26_abstractclass.practice.controlwork.factory;

public class BelarusianHen extends Hen {
    private String country = "Belarus";
    private int countOfEggsPerMonth = 14;
    @Override
    public int getCountOfEggsPerMonth() {
        return this.countOfEggsPerMonth;
    }
    public String getCountry() {
        return this.country;
    }
    @Override
    public String getDescription() {
        return String.format("%s. Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(),getCountry(),getCountOfEggsPerMonth());
    }
}
