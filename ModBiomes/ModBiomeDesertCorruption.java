package Terracraft.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;

import Terracraft.ModBlocks.ModBlock;

public class ModBiomeDesertCorruption extends ModBiome
{
    public ModBiomeDesertCorruption()
    {
        super();
        this.topBlock = (byte)ModBlock.ebonsand.blockID;
        this.fillerBlock = (byte)ModBlock.ebonsand.blockID;
        this.waterColorMultiplier = 8272766;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }
}
