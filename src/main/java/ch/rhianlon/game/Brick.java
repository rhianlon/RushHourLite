package ch.rhianlon.game;

public class Brick {

	private final int length;
	private final boolean isMainBrick;
	private final Orientation orientation;
	private Point position;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Brick(Orientation orientation,int length, boolean isMainBrick, Point position) {
		this.orientation = orientation;
		this.length = length;
		this.isMainBrick = isMainBrick;
		this.position = position;
	}

	public int getLength() {
		return length;
	}

	public boolean isMainBrick() {
		return isMainBrick;
	}

	public Point getPosition() {
		return position;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public int getHeight() {
		if(orientation == Orientation.HORIZONTAL) {
			return 1;
		}
		else {
			return length;
		}
	}
	public int getWidth() {
		if(orientation == Orientation.VERTICAL) {
			return 1;
		}
		else {
			return length;
		}
		
	}	
		

}
