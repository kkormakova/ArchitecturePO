package Rewards.Coin;

import Classes.IGameItem;

/**
 * Класс монетки
 */

public class Coin implements IGameItem {
    @Override
    public void open() {
        System.out.println("Монетка!");
    }

}
