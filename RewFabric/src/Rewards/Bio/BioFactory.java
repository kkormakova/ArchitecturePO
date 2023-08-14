package Rewards.Bio;

import Classes.IGameItem;
import Classes.ItemGenerator;

/**
 * Фабрика создания биокапсул
 */

public class BioFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Bio();
    }
}
