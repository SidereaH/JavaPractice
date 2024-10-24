package org.javapractice.oct15.kt.game;

public class Powering implements GameObject {
    private String type;
    private int x, y;

    public Powering(String type) {
        this.type = type;
        this.x = 50;
        this.y = 50;
    }

    @Override
    public void update() {
        System.out.println("нвоое состояние усиления " + type);
    }

    @Override
    public void render() {
        System.out.println("усиление находится на координатах (" + x + "," + y + ")");
    }

    public String getType() {
        return type;
    }
}