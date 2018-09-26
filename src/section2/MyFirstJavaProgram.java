package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot r2d2=new Robot();
		r2d2.setSpeed(15);
		r2d2.penDown();

		for(int i=0;i<8;i++) {
			r2d2.move(120);
			r2d2.turn(360/8);
		}

	
		
		
	}
}
