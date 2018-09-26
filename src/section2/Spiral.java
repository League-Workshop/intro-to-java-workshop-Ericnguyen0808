package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot r2d2=new Robot();
		
		r2d2.penDown();
		
		r2d2.setSpeed(100);
		
		for(int i=0; i<3;i++) {
			r2d2.setPenWidth(1);
	
		}
		
			r2d2.setPenColor(Color.RED);
		
			
				r2d2.turn(5*90);
	            // 2. Turn the robot 360/7 degrees to the right
			}
		
		r2d2.setPenWidth(1);
			
	}

