package com.Tone.letsmodreboot.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerKeyBindings() {
		
		ClientRegistry.registerKeyBinding(null);
		
	}

}
