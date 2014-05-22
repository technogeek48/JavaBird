package me.technogeek48.JavaBird.Main;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Font;

/**
 * Created by michael on 2014-05-20.
 */

public class Menu extends BasicGameState{

    public Menu(int state){

    }

    TrueTypeFont titleFont;



    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        Logger logger = Logger.getLogger("LogHelper");
        logger.log(Level.INFO, "&a Menu State Initialized");
        Font awtFont = new Font("Helvetica", Font.PLAIN, 24);
        titleFont = new TrueTypeFont(awtFont, false);
    }

    private void drawMenu(Graphics g, GameContainer gc) throws SlickException{
        Image bird = new Image("resources/GreenBird.png");
        titleFont.drawString(568, 118, "JavaBird", Color.blue);
        int mouseX = gc.getInput().getMouseX();
        int mouseY = gc.getInput().getMouseY();
        g.drawString("X: " + mouseX + " Y: " + mouseY, 1025, 10);
        g.drawImage(bird, 480, 160);
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{ //480 177
        drawMenu(g, gc);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{

    }

    public int getID(){
        return 0;
    }


}
