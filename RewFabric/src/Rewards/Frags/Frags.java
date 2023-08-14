package Rewards.Frags;

import Classes.IGameItem;

/**
 * Класс фрагментов героя
 */

public class Frags implements IGameItem {
    @Override
    public void open() {
        System.out.println("Фрагмент героя");
    }
}
