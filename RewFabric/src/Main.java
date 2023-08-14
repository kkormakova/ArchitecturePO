import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Classes.ItemGenerator;
import Rewards.Bio.BioFactory;
import Rewards.Coin.CoinFactory;
import Rewards.Frags.FragsFactory;
import Rewards.Gem.GemFactory;
import Rewards.Gold.GoldFactory;
import Rewards.Platinum.PlatinumFactory;

/**
 * Вход в программу
 */
public class Main {
    public static void main(String[] args) {
        ItemGenerator bioFactory = new BioFactory();
        ItemGenerator coinFactory = new CoinFactory();
        ItemGenerator fragsFactory = new FragsFactory();
        ItemGenerator gemFactory = new GemFactory();
        ItemGenerator goldFactory = new GoldFactory();
        ItemGenerator platinumFactory = new PlatinumFactory();

        List<ItemGenerator> fabricList = new ArrayList<>(
                Arrays.asList(bioFactory,
                        coinFactory,
                        fragsFactory,
                        gemFactory,
                        goldFactory,
                        platinumFactory));

        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}
