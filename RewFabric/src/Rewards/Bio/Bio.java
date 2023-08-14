package Rewards.Bio;

import Classes.IGameItem;

/**
 * Класс биокапсул
 */

public class Bio implements IGameItem {
    @Override
    public void open() {
        System.out.println("Биокапсула");
    }
}
