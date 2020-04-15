/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Draw pictures of lollipops on the graphics pane
 *
 * @author Takumi G
 * @version 16/04/20
 */
public class Lollipop{
    public static final double X = 300.0;       // horizontal center of lollipop
    public static final double Y = 180.0;       // vertical center of lollipop
    public static final double SIZE = 80.0;     // diameter of lollipop
    public static final double STICK = 200.0;   // length of lollipop stick
    
    /**
     * Constructor for objects of class Lollipop 
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /** Draw a red lollipop on a stick*/
    private void drawLollipop() {
        double left = X-SIZE/2.0;                       // left of lollipop
        double top = Y-SIZE/2.0;                        // top of lollipop
        double bottom = Y+STICK;                        // bottom of stick
        
        UI.setLineWidth(SIZE/8.0);                      // set line width
        UI.drawLine(X,Y,X,bottom);                     // draw line
        UI.setLineWidth(1);                             // set line width
        UI.setColor(Color.red);                         // set color to red
        UI.fillOval(left,top,SIZE,SIZE);   // fill oval
    }

    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }

}

