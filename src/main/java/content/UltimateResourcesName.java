//package main.java.content;
//
//import arc.files.Fi;
//import arc.struct.ObjectMap;
//import arc.struct.Seq;
//import arc.util.serialization.Json;
//import arc.util.serialization.JsonReader;
//
//import mindustry.mod.Mods.LoadedMod;
//import mindustry.Vars;
//
//import main.java.UltimateResourcesJavaMain;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//
//import static arc.math.Mathf.rand;
//
//public class UltimateResourcesName {
//
//    public static String generate()
//    {
//
//        class CharMap extends ObjectMap<String, Seq<String>>
//        { }
//
//        LoadedMod mod = Vars.mods.getMod(UltimateResourcesJavaMain.class);
//        Fi file = mod.root.child("NameMarkovChain.json");
//
//        ObjectMap<String, CharMap> nameMap = new Json().readValue(ObjectMap.class, CharMap.class, new JsonReader().parse(file));
//
//        List<String> name = new ArrayList<>();
//        Seq<String> chars = nameMap.keys().toSeq();
//        int c = chars.size-1;
//        String f = "-";
//        String obj;
//
//        while (Objects.equals(f, "-"))
//        {
//            f = chars.get(rand.random(c));
//        }
//        name.add(f.toUpperCase());
//        chars = nameMap.get(f).keys().toSeq();
//        c = chars.size - 1;
//        String string = chars.get(rand.random(c));
//        name.add(string);
//
//        for (int i = 0; i < rand.random(10); i++)
//        {
//            if (!nameMap.get(f).containsKey(string)) break;
//            c = nameMap.get(f).get(string).size - 1;
//            obj = nameMap.get(f).get(string).get(rand.random(c));
//            name.add(obj);
//            f= string;
//            string = obj;
//        }
//        return String.join("", name);
//    }
//}
