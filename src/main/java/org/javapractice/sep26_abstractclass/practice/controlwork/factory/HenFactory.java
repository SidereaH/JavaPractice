package org.javapractice.sep26_abstractclass.practice.controlwork.factory;

public class HenFactory {
    public static Hen getHen(String country) {
        switch (country) {
            case "Ukraine":
                return new UkrainianHen();
            case "Russia":
                return new RussianHen();
            case "Moldova":
                return new MoldovanHen();
            case "Belarus":
                return new BelarusianHen();
            default:
                return null;
        }
    }
}
