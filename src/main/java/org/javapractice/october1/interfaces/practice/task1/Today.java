package org.javapractice.october1_interface.practice.task1;

public class Today implements org.javapractice.october1_interface.practice.task1.Weather {
    private String type;
    public Today(String type) {
        this.type = type;
    }

    @Override
    public String getWeatherType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Today{" +
                "type='" + type + '\'' +
                '}';
    }
}
