package org.javapractice.sep26_abstractclass.practice.controlwork.factory;

public class UkrainianHen extends Hen {

    private String country = "Ukraine";
    private int countOfEggsPerMonth = 10;
    @Override
    public int getCountOfEggsPerMonth() {
        return this.countOfEggsPerMonth;
    }
    public String getCountry() {
        return this.country;
    }
    @Override
    public String getDescription() {
        return String.format("%s. Моя країна - %s. Я несу %d яєць в місяць.", super.getDescription(),getCountry(),getCountOfEggsPerMonth());
    }
}
