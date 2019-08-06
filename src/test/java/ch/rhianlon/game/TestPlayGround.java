package ch.rhianlon.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Class 'PlayGround' is tested")
class TestPlayGround {

	@Test
	@DisplayName("Method 'isOverlappin' is tested")
	void test() {
		
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(1,1);
		Point position2 = new Point(4,3);
		Brick brick1 = new Brick(1,1,false,position1);
		Brick brick2 = new Brick(1,1,false,position2);
		
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
	

		PlayGround playground2 = new PlayGround();
		Point position3 = new Point(1,1);
		Point position4 = new Point(1,1);
		Brick brick3 = new Brick(1,1,false,position3);
		Brick brick4 = new Brick(1,1,false,position4);
		
		Assertions.assertEquals(true, playground1.isOverlapping(brick3, brick4));

	}
}
