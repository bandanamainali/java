import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;


class AwtGui implements ActionListener{
  
        
        Frame f=new Frame("Frame with association");
        Label l1=new Label("Number1:");
        Label l2=new Label("Result:");
        
        TextField t1=new TextField();
        TextField t2=new TextField();
        
        Button b1=new Button("odd/even");
        
       
      
       AwtGui()
       {
        
       
         l1.setBounds(50, 50, 70, 30);
         l2.setBounds(50,100,70,30);
        
       
        f.setSize(500,500);
        f.add(l1);
        f.add(l2);
       
        f.add(t1);
        f.add(t2);
        
        f.add(b1);
        
        
    
        t1.setBounds(150, 50, 200, 30);
       
        t2.setBounds(150, 100, 200, 30);
       

        b1 .setBounds(50, 180, 50, 30);
		
	
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener(this);
       
        
       
        
    }
   
        public void actionPerformed(ActionEvent event)  {
        
               int Number1=Integer.parseInt(t1.getText());
               
               
               if(event.getSource()==b1){
                   if(Number1%2==0){
                    t2.setText("Even");  

                   }else{
                       t2.setText("odd");
                   }
                   

               }
}
              
           
           public static void main(String[] args) {
               new AwtGui();
           }
           
        
       }