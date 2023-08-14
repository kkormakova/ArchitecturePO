package Rewards.Gem;

import Classes.IGameItem;
import Classes.ItemGenerator;

/**
 * Фабрика создания брилиантов
 */
public class GemFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
