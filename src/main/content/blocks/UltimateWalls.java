package main.content.blocks;

import main.content.items.UltimateItems;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.with;

public class UltimateWalls {

    public static Block ironWall, ironWallLarge;

    public static void load()
    {

        int wallHealthMultiplier = 4;
        ironWall = new Wall("iron-wall")
        {{
            requirements(Category.defense, with(UltimateItems.iron, 9));
            health = 90 * wallHealthMultiplier;
            researchCostMultiplier = .1f;
            envDisabled |= Env.scorching;
        }};
        ironWallLarge = new Wall("iron-wall-large")
        {{
            requirements(Category.defense, ItemStack.mult(ironWall.requirements, 4));
            health = 130 * wallHealthMultiplier;
            size = 2;
            envDisabled |= Env.scorching;
        }};

    }
}
