import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
class EventwithInheritance extends Frame implements ActionListener{
      
        Label l1=new Label("Number1:");
        Label l2=new Label("Number2:");
        Label l3=new Label("Result:");
        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField t3=new TextField();
        Button b1=new Button("ADD");
        Button b2=new Button("SUB");
        Button b3=new Button("MUL");
        Button b4=new Button("DIV");
      EventwithInheritance()
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
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
       
        
    }
   
        public void actionPerformed(ActionEvent event)  {
        
               int Number1=Integer.parseInt(t1.getText());
               int Number2=Integer.parseInt(t2.getText());
               try{
               if(event.getSource()==b1){
                   l3.setText(String.valueOf(Number1+Number2));

               }else if(event.getSource()==b2){
                       l3.setText(String.valueOf(Number1-Number2));
                   }
                   else if(event.getSource()==b3){
                     l3.setText(String.valueOf(Number1*Number2));
                   }
                   
                   else if(event.getSource()==b4){
                    
                       l3.setText(String.valueOf(Number1/Number2));
                   }
                   
                } catch(ArithmeticException ef){
                    System.out.println("invalid");
                }
}
              
           
           public static void main(String[] args) {
               new EventwithInheritance();
           }
           
        
       
}