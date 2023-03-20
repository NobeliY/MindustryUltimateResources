package main.java.content.items;

import arc.graphics.Color;
import mindustry.type.Item;

public class UltimateItems {

    // Raw materials
    public static Item iron, aluminum;

    // Alloys/Inter-metallic
    public static Item duralumin;

    // Load Items
    public static void load()
    {

        // Raw materials
        iron = new Item("iron", Color.valueOf("A19D94"))
        {{
            hardness = 3;
            localizedName = "Iron";
        }};
        aluminum = new Item("aluminum", Color.valueOf("ADB2BD"))
        {{
            hardness = 2;
            localizedName = "Aluminium";
        }};

        // Alloys
        duralumin = new Item("duralumin", Color.valueOf("ADB2BD"))
        {{
            hardness = 2;
            localizedName = "Duralumin";
        }};
    }

}
