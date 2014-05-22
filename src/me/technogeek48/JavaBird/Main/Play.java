package me.technogeek48.JavaBird.Main;

/**
 * Created by michael on 2014-05-20.
 **/

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Play extends BasicGameState {
    public Play(int state){

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        Logger logger = Logger.getLogger("LogHelper");
        logger.log(Level.INFO, "Play State Initialized");
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{

    }

    public int getID(){
        return 1;
    }
}
