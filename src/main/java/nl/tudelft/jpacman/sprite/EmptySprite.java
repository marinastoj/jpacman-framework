package nl.tudelft.jpacman.sprite;

import java.awt.Graphics;

import nl.tudelft.jpacman.game.Dimension;

/**
 * Empty Sprite which does not contain any data. When this sprite is drawn,
 * nothing happens.
 * 
 * @author Jeroen Roosen 
 */
public class EmptySprite implements Sprite {

    @Override
    public void draw(Graphics g, int x, int y, Dimension d) {
        // nothing to draw.
    }

    @Override
    public Sprite split(int x, int y, Dimension dimension) {
        return new EmptySprite();
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
