package Rewards.Platinum;

import Classes.IGameItem;
import Classes.ItemGenerator;

/**
 * Фабрика создания платины
 */

public class PlatinumFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
