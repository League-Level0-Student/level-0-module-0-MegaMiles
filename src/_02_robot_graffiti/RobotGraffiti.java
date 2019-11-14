package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

public static void main(String[] args) {
Robot jeff = new Robot ();
jeff.setSpeed(100);
jeff.penDown();
jeff.move(200);
for(int i=0;i<180; i++) {
jeff.move(1);
jeff.turn(1);
}
jeff.move(150);
jeff.turn(180);
jeff.move(150);
for(int i=0;i<180; i++) {
jeff.move(1);
jeff.turn(1);
}
jeff.move(200);

}	
	
}
