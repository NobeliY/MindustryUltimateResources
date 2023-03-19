package main;

import arc.Events;
import arc.util.Log;
import arc.util.Time;
import main.content.blocks.UltimateFactories;
import main.content.blocks.UltimateOres;
import main.content.blocks.UltimateWalls;
import main.content.items.UltimateItems;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

public class UltimateResourcesJavaMain extends Mod
{

    public UltimateResourcesJavaMain()
    {

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Ultimate Resources");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                //dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
        Log.info("Loaded Ultimate Resources constructor.");

    }

    @Override
    public void loadContent()
    {

        Log.info("Loading content.");

        // Load contents
        UltimateItems.load();
        UltimateFactories.load();
        UltimateOres.load();
        UltimateWalls.load();

        Log.info("All contents loaded.");

    }
}



