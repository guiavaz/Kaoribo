package robo;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Kaoribo - a robot by Guiavaz
 */
public class Kaoribo extends Robot
{
	/**
	 * run: Kaoribo's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		setColors(Color.pink,Color.pink,Color.pink); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnRight(90);
			ahead(100);
			turnRight(90);
			ahead(100);
			turnRight(90);
			ahead(100);
			turnRight(90);
			//turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		ahead(100);
		fire(3);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		ahead(30);
		fire(2);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(150);
		turnGunRight(180);
	}	
	
}
