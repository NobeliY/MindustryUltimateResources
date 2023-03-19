package main.content.blocks;

import main.content.items.UltimateItems;
import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;

public class UltimateOres {

    public static Block oreIron, oreAluminum;

    public static void load()
    {
        oreIron = new OreBlock("iron-ore")
        {{
            variants = 3;
            oreThreshold = .95f;
            oreScale = 20.38953f;
            itemDrop = UltimateItems.iron;
        }};
        oreAluminum = new OreBlock("aluminum-ore")
        {{
            variants = 3;
            oreThreshold = .95f;
            oreScale = 20.38953f;
            itemDrop = UltimateItems.aluminum;
        }};
    }
}
