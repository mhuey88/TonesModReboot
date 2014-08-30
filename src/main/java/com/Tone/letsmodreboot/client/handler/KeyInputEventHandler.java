package com.Tone.letsmodreboot.client.handler;

import com.Tone.letsmodreboot.client.settings.Keybindings;
import com.Tone.letsmodreboot.reference.Key;
import com.Tone.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
	
	private static Key getPressedKeybinding(){
		if(Keybindings.charge.isPressed()){
			return Key.CHARGE;
			
		} else if (Keybindings.release.isPressed()){
			return Key.RELEASE;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
		
		LogHelper.info(getPressedKeybinding());
	};

}
