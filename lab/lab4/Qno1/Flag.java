import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Flag extends JFrame
{
	public Flag()
	{
		super("drawing triangle and mapof nepal");
		setSize(900, 900);
		setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
        
        Color crimson=new Color(153,0,0);
        
        int []x1points={30,30,30,30,30};
        int []y1points={30,60,90,120,300};
        Polygon p3=new Polygon(x1points,y1points,5);
        g.setColor(Color.BLUE);
        g.drawPolygon(p3);
        
      
         int []x2points={30,120,30,120,30};
         int []y2points={30,90,120,200,250};
         Polygon p4=new Polygon(x2points,y2points,5);
         g.drawPolygon(p4);
         g.setColor(crimson);
         g.fillPolygon(p4);
         //star making
         int []x3points={45,40,35,40,45,55,60,55};
         int []y3points={150,185,185,195,230,195,185,185};
         Polygon p5=new Polygon(x3points,y3points,8);
         g.drawPolygon(p5);
         g.setColor(Color.WHITE);
         g.fillPolygon(p5);
         //moon making
         g.setColor(Color.WHITE);
         g.fillArc(35,45,10,45,0,-180);



        

	}

	public static void main(String[] args)
	{
		new Flag();
	}

}