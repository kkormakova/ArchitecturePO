package Rewards.Platinum;

import Classes.IGameItem;

/**
 * Класс платины
 */

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Платина");
    }
}
