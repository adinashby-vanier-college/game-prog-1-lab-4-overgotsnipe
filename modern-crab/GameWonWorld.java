// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(860, 860, 1);
        showTextWithBigOrangeFont("You won", 230, 450);
    }

    /**
     * 
     */
    public void showTextWithBigOrangeFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(100);
        bg.setFont(font);
        bg.setColor(Color.ORANGE);
        bg.drawString(message, x, y);
    }
}
