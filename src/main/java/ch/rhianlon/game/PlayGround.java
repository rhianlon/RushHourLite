package ch.rhianlon.game;

import java.util.HashSet;
import java.util.Set;


public class PlayGround {
	private final int height = 6;
	private final int length = 6;
	private final Set<Brick> bricks = new HashSet<>();
	
	public PlayGround() {
		
	}
	

	public void addBrick(Brick brick) {
		if (brick == null) {
			throw new NullPointerException("The Brick cannot be null you damn idiot");
		}
		bricks.add(brick);
		
	}
	public void removeBrick(Brick brick) {
		if (brick == null) {
			throw new NullPointerException("The Brick cannot be null you damn idiot");
		}
		bricks.remove(brick);
	}
	public boolean isOverlapping(Brick brick1, Brick brick2) {
	 
		int length1 = brick1.getLength();
		int height1 = brick1.getHeight();
		Point l1 = new Point(brick1.getPosition().x,brick1.getPosition().y+height1);
		Point r1 = new Point(brick1.getPosition().x+length1,brick1.getPosition().y);
		
		int length2 = brick2.getLength();
		int height2 = brick2.getHeight();
		Point l2 = new Point(brick2.getPosition().x,brick2.getPosition().y+height2);
		Point r2 = new Point(brick2.getPosition().x+length2,brick2.getPosition().y);
		
		// If one rectangle is on left side of other 
	    if (l1.x > r2.x || l2.x > r1.x) { 
	        return false; 
	    }
	    // If one rectangle is above other 
	    if (l1.y < r2.y || l2.y < r1.y) {
	        return false; 
	    }
	    return true; 
		
	}

}
