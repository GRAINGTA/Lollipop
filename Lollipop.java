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
    
    /**
     * Constructor for objects of class Lollipop 
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /** Draw 3 lollipops, asking the user for their size */
    public void doDrawLollipop() {
        double diam = UI.askDouble("Diameter: ");
        drawLollipop(300,180,diam,200);
        drawLollipop(50,60,diam/2.0,90);
        drawLollipop(400,100,diam,70);
    }
    
    /** Draw a red lollipop on a stick*/
    private void drawLollipop(double x, double y, double size, double stick) {
        double left = x-size/2.0;           // left of lollipop
        double top = y-size/2.0;            // top of lollipop
        double bottom = y+stick;            // bottom of stick
        
        UI.setColor(Color.black);           // set color to black
        UI.setLineWidth(size/8.0);          // set line width
        UI.drawLine(x,y,x,bottom);          // draw line
        UI.setLineWidth(1);                 // set line width
        UI.setColor(Color.red);             // set color to red
        UI.fillOval(left,top,size,size);    // fill oval
    }

    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }

}

