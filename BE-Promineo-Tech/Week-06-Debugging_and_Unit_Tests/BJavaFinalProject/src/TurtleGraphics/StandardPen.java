package TurtleGraphics;

import java.awt.Rectangle;

public class StandardPen extends AbstractPen {

   // Constructors ------------------------------

	public void drawCircle() {
		int i,angle = 0;
		
		   for(i=0;i<18; i++) {
			   this.setDirection(0+angle);
			   angle = angle + 10;
			   this.move(4);
		   }
	   }
	
   public StandardPen(){
      this(new SketchPadWindow(new SketchPad()));
   }

   public StandardPen (SketchPad p){
      initialize (p);
   }

   public StandardPen(SketchPadWindow win){
      initialize(win.pad);
   }

   // Public methods ----------------------------
   
   public void drawString (String text) {
      pad.setColor (color);
      pad.drawString(text, xPos, yPos, color);
   }
   
 
   // Protected methods -------------------------

   protected void drawLine (double x, double y){
      if (isDown){
         pad.setColor (color);
         pad.setPenWidth(width);
         pad.drawLine (xPos, yPos, x, y, color, width);
      }
      xPos = x;
      yPos = y;
   }   
   
}
