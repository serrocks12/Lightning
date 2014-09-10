import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX, startY, endX, endY, r;

public void setup()
{

	size(300,300);
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
	r = (int)(Math.random()*256);
	strokeWeight(5);
	background(0);
	noLoop();
}
public void draw()
{
	stroke((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256));
	while (endX < 300) 
	{
		endX = startX + (int)(Math.random()*11);
		endY = startY + (int)(Math.random()*11) - 5;
		line(startX,startY,endX,endY);
		startX = endX;
		startY = endY;
		
	}	

}
public void mousePressed()
{
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
	redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
