package me.technogeek48.JavaBird.Main;

/**
 * Created by michael on 2014-05-20.
 */

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class JavaBird extends StateBasedGame {

    public static String gameName = "JavaBird!";
    public static int MENU = 0;
    public static int PLAY = 1;

    public JavaBird(String gameName) {
        super(gameName);
        this.addState(new Menu(MENU));
        this.addState(new Play(PLAY));
    }


    public static void main(String[] args) {
        AppGameContainer appgc;
        try {
            appgc = new AppGameContainer(new JavaBird(gameName));
            appgc.setDisplayMode(1280, 720, false);
            appgc.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(MENU).init(gc, this);
        this.getState(PLAY).init(gc, this);
        this.enterState(MENU);
    }
}
