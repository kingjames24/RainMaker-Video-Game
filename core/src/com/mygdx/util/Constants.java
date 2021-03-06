package com.mygdx.util;
/**
 * Variables that wont change throughout the game. 
 * Adam Standke
 */
public class Constants 
{
	// Visible game world is 5 meters wide
	public static final float VIEWPORT_WIDTH = 5.0f;
	// Visible game world is 5 meters high
	public static final float VIEWPORT_HEIGHT =	5.0f;
	// Location of description file for texture atlas
	public static final String TEXTURE_ATLAS_OBJECTS = "images/rainmaker.atlas";
	// Location of image file for level 01
	public static final String LEVEL_01 = "levels/level-01.png";
	//GUI  width pixels
    public static final float VIEWPORT_GUI_WIDTH = 800.0f;
	// GUI height pixels
	public static final float VIEWPORT_GUI_HEIGHT = 480.0f;
	// Location of packed images for skin used 
	public static final String TEXTURE_ATLAS_LIBGDX_UI ="images/neutralizer-ui.atlas";
	// Location of json file for skin used 
	public static final String SKIN_LIBGDX_UI ="images/neutralizer-ui.json";
	//Location of packed image for the main menu ui
	public static final String TEXTURE_ATLAS_UI = "images-ui/rainmaker-ui.atlas";
	//Location of json file for the main menu ui
	public static final String SKIN_RainMaker_UI ="images/rainmaker-ui.json";
	// Game preferences file
	public static final String PREFERENCES = "rainmaker.prefs";
	//a 3 second delay is played at the end of game to dispaly player's death and Game over label
	public static final float TIME_DELAY_GAME_OVER = 1;
	
}