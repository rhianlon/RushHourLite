package ch.rhianlon.game;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Class 'PlayGround' is tested")
class TestPlayGround {

	@Test
	@DisplayName("Method 'isOverlappin' Scenario 1 is tested")
	void test1() {

		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(1, 1);
		Point position2 = new Point(4, 3);
		Brick brick1 = new Brick(Orientation.HORIZONTAL, 1, false, position1);
		Brick brick2 = new Brick(Orientation.VERTICAL, 1, false, position2);

		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
		Assertions.assertEquals(true, playground1.isTouching(brick1, brick2).isEmpty());
	}

	@Test
	@DisplayName("Method 'isOverlappin' Scenario 2 is tested")
	void test2() {
		PlayGround playground2 = new PlayGround();
		Point position3 = new Point(1, 1);
		Point position4 = new Point(1, 1);
		Brick brick3 = new Brick(Orientation.HORIZONTAL, 1, false, position3);
		Brick brick4 = new Brick(Orientation.HORIZONTAL, 1, false, position4);

		Assertions.assertEquals(true, playground2.isOverlapping(brick3, brick4));
		Assertions.assertEquals(true, playground2.isTouching(brick3, brick4).isEmpty());

	}

	@Test
	@DisplayName("Method 'isOverlappin' Scenario 3 is tested")
	void test3() {

		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(1, 1);
		Point position2 = new Point(4, 3);
		Brick brick1 = new Brick(Orientation.HORIZONTAL, 1, false, position1);
		Brick brick2 = new Brick(Orientation.VERTICAL, 2, false, position2);

		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
		Assertions.assertEquals(true, playground1.isTouching(brick1, brick2).isEmpty());
	}
//	-------------------------------------------------------------------------------------------------------------------------------
	@Test
	@DisplayName("Method 'isTouching' Scenario righttouch is tested")
	void testIsTouchingRightTouch() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(1, 2);
		Point position2 = new Point(3, 1);
		Brick brick1 = new Brick(Orientation.HORIZONTAL, 2, false, position1);
		Brick brick2 = new Brick(Orientation.VERTICAL, 3, false, position2);
		List<Direction> myTestList = playground1.isTouching(brick1, brick2);
		
		Assertions.assertEquals(1, myTestList.size());
		Assertions.assertEquals(Direction.RIGHT, myTestList.get(0));
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));		
		
	}
	
	@Test
	@DisplayName("Method 'isTouching' Scenario NO righttouch is tested")
	void testIsNotTouchingRightTouch() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(0, 3);
		Point position2 = new Point(1, 2);
		Brick brick1 = new Brick(Orientation.HORIZONTAL, 3, false, position1);
		Brick brick2 = new Brick(Orientation.VERTICAL, 1, false, position2);
		
		Assertions.assertEquals(true, playground1.isTouching(brick1, brick2).isEmpty());	
	}
	@Test
	@DisplayName("Method 'isTouching' Scenario lefttouch is tested")
	void testIsTouchingLeftTouch() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(2, 2);
		Point position2 = new Point(1, 1);
		Brick brick1 = new Brick(Orientation.HORIZONTAL, 2, false, position1);
		Brick brick2 = new Brick(Orientation.VERTICAL, 3, false, position2);
		List<Direction> myTestList = playground1.isTouching(brick1, brick2);
		
		Assertions.assertEquals(1, myTestList.size());
		Assertions.assertEquals(Direction.LEFT, myTestList.get(0));
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
		
	}
	@Test
	@DisplayName("Method 'isTouching' Scenario NO lefttouch is tested")
	void testIsNotTouchingLeftTouch() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(3, 2);
		Point position2 = new Point(1, 1);
		Brick brick1 = new Brick(Orientation.HORIZONTAL, 2, false, position1);
		Brick brick2 = new Brick(Orientation.VERTICAL, 3, false, position2);
		
		Assertions.assertEquals(true, playground1.isTouching(brick1, brick2).isEmpty());	
		
	}
	
	@Test
	@DisplayName("Method 'isTouching' Scenario toptouch is tested")
	void testIsTouchingOnTop() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(2, 1);
		Point position2 = new Point(1, 3);
		Brick brick1 = new Brick(Orientation.VERTICAL, 2, false, position1);
		Brick brick2 = new Brick(Orientation.HORIZONTAL, 3, false, position2);
		List<Direction> myTestList = playground1.isTouching(brick1, brick2);
		
		Assertions.assertEquals(1, myTestList.size());
		Assertions.assertEquals(Direction.UP, myTestList.get(0));
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
		
	}
	@Test
	@DisplayName("Method 'isTouching' Scenario NO toptouch is tested")
	void testIsNotTouchingOnTop() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(2, 1);
		Point position2 = new Point(1, 4);
		Brick brick1 = new Brick(Orientation.VERTICAL, 2, false, position1);
		Brick brick2 = new Brick(Orientation.HORIZONTAL, 3, false, position2);
		
		Assertions.assertEquals(true, playground1.isTouching(brick1, brick2).isEmpty());	
		
	}
	
	@Test
	@DisplayName("Method 'isTouching' Scenario bottomtouch is tested")
	void testIsTouchingOnBottom() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(3, 2);
		Point position2 = new Point(2, 1);
		Brick brick1 = new Brick(Orientation.VERTICAL, 2, false, position1);
		Brick brick2 = new Brick(Orientation.HORIZONTAL, 3, false, position2);
		List<Direction> myTestList = playground1.isTouching(brick1, brick2);
		
		Assertions.assertEquals(1, myTestList.size());
		Assertions.assertEquals(Direction.DOWN, myTestList.get(0));
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
	}
	@Test
	@DisplayName("Method 'isTouching' Scenario Cornertouch is tested")
	void testIsTouchingCornor() {
		PlayGround playground1 = new PlayGround();
		Point position1 = new Point(1, 1);
		Point position2 = new Point(3, 2);
		Brick brick1 = new Brick(Orientation.HORIZONTAL, 2, false, position1);
		Brick brick2 = new Brick(Orientation.VERTICAL, 3, false, position2);
		
		Assertions.assertEquals(true, playground1.isTouching(brick1, brick2).isEmpty());	
		Assertions.assertEquals(false, playground1.isOverlapping(brick1, brick2));
		
	}
	
//	-------------------------------------------------------------------------------------------------------------------------------
	
	@Test
	@DisplayName("Method 'moveBrick' Scenario: move Brick to the right , is tested")
	void testMoveToTheRight() {

		PlayGround playground = new PlayGround();
		Point position = new Point(1, 1);
		Point positionNew = new Point(2, 1);
		Brick brick = new Brick(Orientation.HORIZONTAL, 1, false, position);

		playground.moveBrick(brick, Direction.RIGHT);

		Assertions.assertEquals(positionNew, brick.getPosition());
	}

	@Test
	@DisplayName("Method 'moveBrick' Scenario : move Brick to the left, is tested")
	void testMoveToTheLeft() {
		PlayGround playground = new PlayGround();
		Point position = new Point(2, 1);
		Point positionNew = new Point(1, 1);
		Brick brick = new Brick(Orientation.HORIZONTAL, 1, false, position);

		playground.moveBrick(brick, Direction.LEFT);

		Assertions.assertEquals(positionNew, brick.getPosition());
	}

	@Test
	@DisplayName("Method 'moveBrick' Scenario : move Brick up, is tested")
	void testMoveUp() {
		PlayGround playground = new PlayGround();
		Point position = new Point(1, 1);
		Point positionNew = new Point(1, 2);
		Brick brick = new Brick(Orientation.VERTICAL, 1, false, position);

		playground.moveBrick(brick, Direction.UP);

		Assertions.assertEquals(positionNew, brick.getPosition());
	}

	@Test
	@DisplayName("Method 'moveBrick' Scenario : move Brick down, is tested")
	void testMoveDown() {
		PlayGround playground = new PlayGround();
		Point position = new Point(1, 2);
		Point positionNew = new Point(1, 1);
		Brick brick = new Brick(Orientation.VERTICAL, 1, false, position);

		playground.moveBrick(brick, Direction.DOWN);

		Assertions.assertEquals(positionNew, brick.getPosition());
	}

}
