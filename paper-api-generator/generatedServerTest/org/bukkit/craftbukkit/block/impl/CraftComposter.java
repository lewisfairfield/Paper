package org.bukkit.craftbukkit.block.impl;

import io.papermc.paper.generated.GeneratedFrom;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.bukkit.block.data.Levelled;
import org.bukkit.craftbukkit.block.data.CraftBlockData;
import org.jetbrains.annotations.Range;

@GeneratedFrom("1.20.4")
@SuppressWarnings("unused")
public class CraftComposter extends CraftBlockData implements Levelled {
    private static final IntegerProperty LEVEL = ComposterBlock.LEVEL;

    public CraftComposter(BlockState state) {
        super(state);
    }

    @Override
    @Range(
            from = 0,
            to = 8
    )
    public int getLevel() {
        return this.get(LEVEL);
    }

    @Override
    public void setLevel(@Range(from = 0, to = 8) final int level) {
        this.set(LEVEL, level);
    }

    @Override
    public int getMinimumLevel() {
        return LEVEL.min;
    }

    @Override
    public int getMaximumLevel() {
        return LEVEL.max;
    }
}
