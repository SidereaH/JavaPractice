package org.javapractice.oct15.kt.game;

public class Player implements GameObject {
    private int health;
    private int x, y;

    public Player() {
        this.health = 100;
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void update() {
        System.out.println("либо получил, либо получил. здоровье куррент: " + health);
    }

    @Override
    public void render() {
        System.out.println("игрок на позиции (" + x + "," + y + ")");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) health = 100;
    }
}