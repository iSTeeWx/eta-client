package net.minecraft.world.gen.feature;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public abstract class WorldGenerator {
    private final boolean doBlockNotify;

    public WorldGenerator() {
        this(false);
    }

    public WorldGenerator(boolean notify) {
        this.doBlockNotify = notify;
    }

    public abstract boolean generate(World worldIn, Random rand, BlockPos position);

    public void func_175904_e() {
    }

    protected void setBlockAndNotifyAdequately(World worldIn, BlockPos pos, IBlockState state) {
        if (this.doBlockNotify) {
            worldIn.setBlockState(pos, state, 3);
        } else {
            worldIn.setBlockState(pos, state, 2);
        }
    }
}