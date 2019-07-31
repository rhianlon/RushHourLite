package ch.rhianlon.game;

public class Brick {
	private final int height;
	private final int length;
	private final boolean isMainBrick;

	private int x;
	private int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Brick(int height, int length, boolean isMainBrick) {
		this.height = height;
		this.length = length;
		this.isMainBrick = isMainBrick;
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
