package me.laravieira.item;

import me.laravieira.FabricBackup;
import me.laravieira.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(FabricBackup.MODID, "rubies"),
        FabricItemGroup
            .builder()
            .displayName(Text.translatable("itemgroup."+FabricBackup.MODID+".rubies"))
            .icon(() -> new ItemStack(ModItems.RUBY))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.RAW_RUBY);
                entries.add(ModItems.RUBY);
                entries.add(ModBlocks.RAW_RUBY_BLOCK);
                entries.add(ModBlocks.RUBY_BLOCK);
            })
            .build()
    );

    public static void registerItemGroups() {
        FabricBackup.LOGGER.info("Registering item groups.");
    }
}
