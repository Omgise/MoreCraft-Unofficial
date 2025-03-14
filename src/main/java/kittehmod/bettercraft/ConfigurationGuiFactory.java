package kittehmod.bettercraft;

import cpw.mods.fml.client.IModGuiFactory;  
import net.minecraft.client.Minecraft;  
import net.minecraft.client.gui.GuiScreen;

import java.util.Set;

public class ConfigurationGuiFactory implements IModGuiFactory {  
    @Override
    public void initialize(Minecraft minecraftInstance) {

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return ConfigurationGui.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
}