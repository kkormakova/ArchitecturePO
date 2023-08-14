package Rewards.Gold;

import Classes.IGameItem;

/**
 * Класс золота
 */

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Золото");
    }
}
