package Rewards.Gold;

import Classes.IGameItem;
import Classes.ItemGenerator;

/**
 * Фабрика создания золота
 */

public class GoldFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
