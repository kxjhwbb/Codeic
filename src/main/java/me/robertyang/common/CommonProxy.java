package me.robertyang.common;

import me.robertyang.codeic.BlockLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockLoader.loadBlock();
    }

    public void init(FMLInitializationEvent event)
    {
        
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
