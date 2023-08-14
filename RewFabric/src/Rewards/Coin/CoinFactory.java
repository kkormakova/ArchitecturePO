package Rewards.Coin;

import Classes.IGameItem;
import Classes.ItemGenerator;

/**
 * Фабрика создания монет
 */
public class CoinFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Coin();
    }

}
