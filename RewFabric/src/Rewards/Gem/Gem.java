package Rewards.Gem;

import Classes.IGameItem;

/**
 * Класс брилианта
 */

public class Gem implements IGameItem {
    @Override
    public void open() {
        System.out.println("Брилиант");
    }
}
