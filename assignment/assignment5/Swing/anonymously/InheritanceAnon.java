import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

class InheritanceAnon extends Frame {

 
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
         InheritanceAnon()
       {
        
       
         l1.setBounds(50, 50, 70, 30);
         l2.setBounds(50,100,70,30);
         l3.setBounds(50,150,70,30);
       
        setSize(500,500);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    
        t1.setBounds(150, 50, 200, 30);
       
        t2.setBounds(150, 100, 200, 30);
        t3.setBounds(150, 150, 200, 30);

        b1 .setBounds(50, 180, 50, 30);
		b2.setBounds(102, 180, 50, 30);
	    b3.setBounds(154, 180, 50, 30);
		b4.setBounds(206, 180, 50, 30);
        setLayout(null);
        setVisible(true);
        b1.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                int Number1=Integer.parseInt(t1.getText());
               int Number2=Integer.parseInt(t2.getText());
               l3.setText(String.valueOf(Number1+Number2));
                
                
            }
        });
        b2.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                int Number1=Integer.parseInt(t1.getText());
               int Number2=Integer.parseInt(t2.getText());
               l3.setText(String.valueOf(Number1-Number2));
                
                
            }
        });
        b3.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                int Number1=Integer.parseInt(t1.getText());
               int Number2=Integer.parseInt(t2.getText());
               l3.setText(String.valueOf(Number1*Number2));
                
                
            }
        });
        b4.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                int Number1=Integer.parseInt(t1.getText());
               int Number2=Integer.parseInt(t2.getText());
               try {
                    if(e.getSource()==b4)
                    {
                    l3.setText(String.valueOf(Number1/Number2));
                    }
                    
                } catch (Exception error) {
                    l3.setText("Invalid");
                }
                
                
            }
        });
       }
        public static void main(String[] args) {
        new InheritanceAnon();
    }
}