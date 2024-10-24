package org.javapractice.oct15.kt.game;

public class GameManager {
    private GameObject[] gameObjects;

    public GameManager() {
        gameObjects = new GameObject[] {
                new Player(),
                new Enemy(20),
                new Powering("health")
        };
    }

    public void gameLoop() {

        for (GameObject obj : gameObjects) {
            obj.update();
            obj.render();
        }

        System.out.println("взаимодействие объектов:");
        if (gameObjects[0] instanceof Player && gameObjects[1] instanceof Enemy) {
            Player player = (Player) gameObjects[0];
            Enemy enemy = (Enemy) gameObjects[1];
            player.takeDamage(enemy.getDamage());
        }
    }
}