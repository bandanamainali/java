import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;


class borderLayout implements ActionListener{
  
        
        JFrame f=new JFrame("Frame with association");
        JLabel l1=new JLabel("Num1:");
        JLabel l2=new JLabel("Num2:");
        JLabel l3=new JLabel("Result:");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JButton b1=new JButton("ADD");
        JButton b2=new JButton("SUB");
        
     borderLayout()
       {
        
       
         
        f.setLayout(new BorderLayout(20,15));
        f.setSize(500,500);
        f.add(l1,BorderLayout.CENTER);
        l1.setBounds(50, 50, 70, 30);
        f.add(l2,BorderLayout.CENTER);
        l2.setBounds(50,100,70,30);
        f.add(l3,BorderLayout.CENTER);
        l3.setBounds(50,150,70,30);
        f.add(t1,BorderLayout.CENTER);
        t1.setColumns(5);
        t1.setBounds(150, 50, 200, 30);
        f.add(t2,BorderLayout.CENTER);
        t2.setColumns(5);
        t2.setBounds(150, 100, 200, 30);
        f.add(t3,BorderLayout.CENTER);
        t3.setColumns(5);
        t3.setBounds(150, 150, 200, 30);
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
         
        
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
       
        
    }
   
        public void actionPerformed(ActionEvent event)  {
        
               int Number1=Integer.parseInt(t1.getText());
               int Number2=Integer.parseInt(t2.getText());
           
               if(event.getSource()==b1){
                   t3.setText(String.valueOf(Number1+Number2));

               }else if(event.getSource()==b2){
                       t3.setText(String.valueOf(Number1-Number2));
                   }
                  
}
              
           
           public static void main(String[] args) {
               new borderLayout();
           }
           
        
       }