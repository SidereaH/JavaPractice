package org.javapractice.oct15.kt.game;

public class Enemy implements GameObject {
    private int damage;
    private int x, y;

    public Enemy(int damage) {
        this.damage = damage;
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update() {
        System.out.println("враг получил с такой силой: " + damage);
    }

    @Override
    public void render() {
        System.out.println("враг переместился (" + x + "," + y + ")");
    }

    public int getDamage() {
        return damage;
    }
}