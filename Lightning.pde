int startX, startY, endX, endY, r;

void setup()
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
void draw()
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
void mousePressed()
{
	startX = 0;
	startY = 150;
	endX = 0;
	endY = 150;
	redraw();
}

