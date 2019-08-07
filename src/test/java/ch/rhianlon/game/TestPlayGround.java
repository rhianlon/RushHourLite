package ch.rhianlon.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Class 'PlayGround' is tested")
class TestPlayGround {

	@Test
	@DisplayName("Method 'isOverlappin' Scenario 1 is tested")
	void test1() {
		
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(1,1);
		Point position2 = new Point(4,3);
		Brick brick1 = new Brick(Orientation.HORIZONTAL,1,false,position1);
		Brick brick2 = new Brick(Orientation.VERTICAL,1,false,position2);
		
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
	}
	

	@Test
	@DisplayName("Method 'isOverlappin' Scenario 2 is tested")
	void test2() {
		PlayGround playground2 = new PlayGround();
		Point position3 = new Point(1,1);
		Point position4 = new Point(1,1);
		Brick brick3 = new Brick(Orientation.HORIZONTAL,1,false,position3);
		Brick brick4 = new Brick(Orientation.HORIZONTAL,1,false,position4);
		
		Assertions.assertEquals(true, playground2.isOverlapping(brick3, brick4));

	}
	@Test
	@DisplayName("Method 'isOverlappin' Scenario 3 is tested")
	void test3() {
		
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(1,1);
		Point position2 = new Point(4,3);
		Brick brick1 = new Brick(Orientation.HORIZONTAL,1,false,position1);
		Brick brick2 = new Brick(Orientation.VERTICAL,2,false,position2);
		
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
	}
}
