import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	 Robot r = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
String color = JOptionPane.showInputDialog("What color would you like the Robot to draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(color.equals("red")) {
	r.setPenColor(250, 0, 0);
}
else {
	r.setPenColor(0, 0, 250);
}
   	 // 2. set the pen width to 10
r.setPenWidth(10);
r.penDown();
   	 // 1. make the Robot draw a shape
  
   	 for(int i = 0; i <3; i++) {
   		r.setSpeed(10);
   		r.move(100);
   		r.turn(120);
   	 }
    }

}
