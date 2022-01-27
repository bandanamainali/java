import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
public class Polygondraw extends JFrame{
public Polygondraw(){
    super("Drawing different shapes");
    setSize(900,900);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

}
public void paint(Graphics g){
    //FOR TRIANGLE
    int x[]={200,300,400};
    int y[]={70,45,70};
    Polygon p1=new Polygon(x,y,3);
    g.setColor(Color.RED);
    g.drawPolygon(p1);
    g.fillPolygon(p1);

    //FOR CIRCLE
    g.setColor(Color.GREEN);
    g.fillOval(200,100,80,80);
    

    //FOR ELLIPSE
    g.setColor(Color.YELLOW);
    g.fillOval(700,200,90,150);
    
    //FOR PENTAGON
    int x1[]={225,200,250,300,275};
    int y1[]={500,400,300,400,500};
    Polygon p2=new Polygon(x1,y1,5);
    g.setColor(Color.BLUE);
    g.drawPolygon(p2);
    g.fillPolygon(p2);

    //FOR HEXAGON
    int x2[]={225,200,225,275,300,275};
    int y2[]={700,650,600,600,650,700};
    Polygon p3=new Polygon(x2,y2,6);
    g.setColor(Color.BLACK);
    g.drawPolygon(p3);
    g.fillPolygon(p3);

}
public static void main(String[] args) {
    new Polygondraw();
}
}