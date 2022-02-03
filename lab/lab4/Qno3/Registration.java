import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Registration extends JFrame{
    public Registration(){
        JFrame f=new JFrame("Registration demo");
        JLabel fname= new JLabel("Firstname");
        JLabel lname= new JLabel("Lastname");
        JLabel pass = new JLabel("Password");
        JLabel add=new JLabel("Address");
        JLabel mob =new JLabel("MobileNo");
        JLabel email=new JLabel("EmailId");
        JTextField tfname= new JTextField();
        JTextField tlname= new JTextField();
        JPasswordField tpass= new JPasswordField();
        JTextField tadd= new JTextField();
        JTextField tmob= new JTextField();
        JTextField temail=new JTextField();
        JButton regis=new JButton("Register");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(null);
        f.add(fname);
         f.add(tfname);
         f.add(lname);
         f.add(tlname);
         f.add(add);
         f.add(tadd);
         f.add(pass);
         f.add(tpass);
         f.add(mob);
         f.add(tmob);
         f.add(email);
         f.add(temail);
         f.add(regis);
        fname.setBounds(50,50,100,50);
        tfname.setBounds(150,50,100,30);
        lname.setBounds(50,100,100,50);
        tlname.setBounds(150,100,100,30);
        add.setBounds(50,150,100,50);
        tadd.setBounds(150,150,100,30);
        pass.setBounds(300,50,100,50);
        tpass.setBounds(400,50,100,30);
        mob.setBounds(300,100,100,50);
        tmob.setBounds(400,100,100,30);
        email.setBounds(300,150,100,50);
        temail.setBounds(400,150,150,30);
        regis.setBounds(250,200,100,50);
        regis.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               

                try {
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String query = " INSERT INTO information (`FirstName`, `LastName`, `Address`, `MobileNo`, `Email`, `Password`) VALUES (?, ?, ?, ?, ?, ?)";
                       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Students", "root", "");
                    Statement sta = connection.createStatement();
                   PreparedStatement pst=connection.prepareStatement(query);
                   pst.setString(1,tfname.getText());
                   pst.setString(2,tlname.getText());
                   pst.setString(3,tadd.getText());
                   pst.setString(4,tmob.getText());
                   pst.setString(5,temail.getText());
                   pst.setString(6,tpass.getText());
                   pst.executeUpdate();
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

    }
      public static void main(String[] args) {
        new Registration();
    }
}