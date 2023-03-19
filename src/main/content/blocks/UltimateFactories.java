package main.content.blocks;

import arc.graphics.Color;
import main.content.items.UltimateItems;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawFlame;
import mindustry.world.draw.DrawMulti;

import static mindustry.type.ItemStack.with;

public class UltimateFactories {

    public static Block duralumin;

    public static void load()
    {
        duralumin = new GenericCrafter("duralumin-factory")
        {{
            ambientSound = Sounds.smelter;
            ambientSoundVolume = .07f;
            craftEffect = Fx.smeltsmoke;
            craftTime = 35f;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("FFEF99")));
            hasPower = true;
            hasLiquids = false;
            localizedName = "Duralumin Factory";
            outputItem = new ItemStack(UltimateItems.duralumin, 1);
            requirements(Category.crafting, with(Items.copper, 75, UltimateItems.aluminum, 95));
            size = 2;
            consumeItems(with(Items.copper, 1, UltimateItems.aluminum, 2));
            consumePower(.50f);
        }};

    }

}
