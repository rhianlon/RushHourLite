package ch.rhianlon.game;

import java.util.HashSet;
import java.util.Set;


public class PlayGround {
	private final int height = 6;
	private final int length = 6;
	private final Set<Brick> bricks = new HashSet<>();

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
		
	}

}
