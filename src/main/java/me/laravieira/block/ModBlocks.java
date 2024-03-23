package me.laravieira.block;

import me.laravieira.FabricBackup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(
            FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)
    ));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", new Block(
            FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)
    ));

    public static Block registerBlock(@NotNull String name, @NotNull Block block) {
        Registry.register(
                Registries.ITEM,
                new Identifier(FabricBackup.MODID, name),
                new BlockItem(block, new FabricItemSettings())
        );
        return Registry.register(Registries.BLOCK, new Identifier(FabricBackup.MODID, name), block);
    }

    public static void registerBlocks() {
        FabricBackup.LOGGER.info("Registering blocks.");
    }
}
