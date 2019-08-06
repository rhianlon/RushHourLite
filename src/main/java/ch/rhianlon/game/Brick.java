package ch.rhianlon.game;

public class Brick {
	private final int height;
	private final int length;
	private final boolean isMainBrick;
	
	private Point position;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Brick(int height, int length, boolean isMainBrick, Point position ) {
		this.height = height;
		this.length = length;
		this.isMainBrick = isMainBrick;
		this.position = position;
	}

	public int getHeight() {
		return height;
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

	

}
