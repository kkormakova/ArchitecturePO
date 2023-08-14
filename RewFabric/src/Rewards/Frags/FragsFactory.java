package Rewards.Frags;

import Classes.IGameItem;
import Classes.ItemGenerator;

/**
 * Фабрика созлания фрагментов героя
 */

public class FragsFactory extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Frags();
    }
}
