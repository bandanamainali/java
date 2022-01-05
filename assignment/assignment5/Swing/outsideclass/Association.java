import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
class Association  {
      JFrame f=new JFrame();
        JLabel l1=new JLabel("Number1:");
        JLabel l2=new JLabel("Number2:");
        JLabel l3=new JLabel("Result:");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JButton b1=new JButton("ADD");
        JButton b2=new JButton("SUB");
        JButton b3=new JButton("MUL");
        JButton b4=new JButton("DIV");
     Association()
       {
        
       
         l1.setBounds(50, 50, 70, 30);
         l2.setBounds(50,100,70,30);
         l3.setBounds(50,150,70,30);
       
        f.setSize(500,500);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
    
        t1.setBounds(150, 50, 200, 30);
       
        t2.setBounds(150, 100, 200, 30);
        t3.setBounds(150, 150, 200, 30);

        b1 .setBounds(50, 180, 50, 30);
		b2.setBounds(102, 180, 50, 30);
	    b3.setBounds(154, 180, 50, 30);
		b4.setBounds(206, 180, 50, 30);
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener(new OutsideClass(this));
        b2.addActionListener(new OutsideClass(this));
        b3.addActionListener(new OutsideClass(this));
        b4.addActionListener(new OutsideClass(this));
       
        
    }
     public static void main(String[] args) {
               new Association();
           }
           
        
       
}
class OutsideClass  implements ActionListener
{
	Association obj;
	public OutsideClass(Association obj)
	{
        this.obj = obj;

    }
   public void actionPerformed(ActionEvent event)  {
        
               int Number1=Integer.parseInt(obj.t1.getText());
               int Number2=Integer.parseInt(obj.t2.getText());
               try{
               if(event.getSource()==obj.b1){
                   obj.l3.setText(String.valueOf(Number1+Number2));

               }else if(event.getSource()==obj.b2){
                       obj.l3.setText(String.valueOf(Number1-Number2));
                   }
                   else if(event.getSource()==obj.b3){
                     obj.l3.setText(String.valueOf(Number1*Number2));
                   }
                   
                   else if(event.getSource()==obj.b4){
                    
                       obj.l3.setText(String.valueOf(Number1/Number2));
                   }
                   
                } catch(ArithmeticException ef){
                    System.out.println("invalid");
                }
}
}