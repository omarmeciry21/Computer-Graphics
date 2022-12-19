/**
 * @(#)proj.java
 *
 * proj Applet application
 *
 * @author 
 * @version 1.00 2022/12/16
 */
 
import java.awt.*;
import java.applet.*;

public class proj extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		drawRightHand(g);
		drawLeftHand(g);
		
		
		drawLeg(g);
	}
	
	void drawHead(Graphics g){
		//SideHair
		g.setColor(Color.decode("#6D4319"));
		g.fillOval(580,340,120,140);
		
		//Face
		g.setColor(Color.decode("#E5BC70"));
		g.fillOval(585,345,110,140);
		
		//Hair
		g.setColor(Color.decode("#6D4319"));
		g.fillArc(615,310,70,70,180,180);
		g.fillArc(615,330,40,40,0,180);
		
		//EyeBrows
		g.setColor(Color.decode("#6D4319"));
		g.fillArc(600,390,10,10,90,180);
		g.fillRect(605,390,15,10);
		g.fillArc(615,390,10,10,270,180);
		g.fillArc(650,390,10,10,90,180);
		g.fillRect(655,390,15,10);
		g.fillArc(665,390,10,10,270,180);
	}
	
	void drawLeg(Graphics g){
		//Right leg 
		int [] red_short_x ={600,600,620,640,680};
		int [] red_short_y ={680,720,720,740,700};
		g.setColor(Color.red);
		g.fillPolygon(red_short_x,red_short_y,5);
		int [] R_leg_x ={640,700,720,760,750,680};
		int [] R_leg_y ={740,800,925,920,780,700};
		g.setColor(Color.orange);
		g.fillPolygon(R_leg_x,R_leg_y,6);
		//socks
		int [] S_x ={720,720,760,760};
		int [] S_y ={925,960,960,920};
		g.setColor(Color.cyan);
		g.fillPolygon(S_x,S_y,4);
		//sneakers
		g.setColor(Color.blue);
		g.fillArc(715,950,55,60,0,180);
		}
		
	void drawRightWeight(Graphics g){
		// right weight
		int [] A1 = {995,1025,995,965};
        int [] B1 = {310,319,574,565};


        g.setColor(Color.black);
        g.fillPolygon(A1,B1,4);
		
	  	int [] A2 = {1028,1058,1028,998};
        int [] B2 = {320,329,584,575};


        
        g.fillPolygon(A2,B2,4);
        
        int [] A3 = {1058,1088,1065,1035};
        int [] B3 = {351,360,560,551};


        
        g.fillPolygon(A3,B3,4);}
    
    void drawBelt(Graphics g){
    	// The Belt
	    // body of it
	    g.setColor(Color.black);
	    int [] x = {526, 693, 684, 516};
	    int [] y = {606, 631, 698, 674};
	    g.fillPolygon(x, y, 4);
	    
	    // steel
	    g.setColor(Color.lightGray);
	    int [] x1 = {577, 641, 633, 568};
        int [] y1 = {621, 630, 689, 679};
	    g.fillPolygon(x1, y1, 4);
	    
	    // inner of steel
	    g.setColor(Color.black);
	    int [] x2 = {587, 630, 627, 580};
        int [] y2 = {632, 638, 676, 668};
	    g.fillPolygon(x2, y2, 4);
	    
	    // pins of steel
	    g.setColor(Color.lightGray);
	    int [] x3 = {620, 649, 647, 619};
        int [] y3 = {642, 646, 651, 647};
	    g.fillPolygon(x3, y3, 4);
	    int [] x4 = {617, 645,644 ,616};
        int [] y4 = {664, 668,675 ,670};
	    g.fillPolygon(x4, y4, 4);
	
	    // circles on the right of the belt
	    g.setColor(Color.darkGray);
	    g.fillOval(654, 645, 11, 11);
	    g.fillOval(673, 648, 11, 11);
	    g.fillOval(652, 669, 11, 11);
	    g.fillOval(670, 672, 11, 11);
	}
	    
	void draweBar(Graphics g){
	  	int [] A = {130,140,1160,1150};
        int [] B = {320,340,480,460};


        g.setColor(Color.gray);
        g.fillPolygon(A,B,4);
    }
       
    void drawRightHand(Graphics g){
		g.setColor(Color.decode("#E5BC70"));
		int [] x5 = {750, 920, 890, 735};
		int [] y5 = {405, 430, 530, 505};
		g.fillPolygon(x5,y5,4);
		g.fillOval(840, 350, 90, 90);	
	}
	
	void drawLeftHand(Graphics g){
		g.setColor(Color.decode("#E5BC70"));
		int [] L_arm_x = {380, 400, 540, 520,  340, 355};
		int [] L_arm_y = {310, 360, 380, 470,  440, 355};
		g.fillPolygon(L_arm_x, L_arm_y, 6);
		g.fillOval(350, 285, 85, 85);
	}
}