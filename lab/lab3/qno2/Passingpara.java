import java.applet.Applet;
import java.awt.Graphics;

class Passingpara extends Applet{
    String name;
   public  void init(){
        name=getParameter("name");
    }
   public  void paint(Graphics g){
        g.drawString(name,100,100);
    }

}