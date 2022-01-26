import java.sql.*;

public class Create{
public static void main(String[] args) throws ClassNotFoundException, SQLException{
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    
 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "");
    
    
    
    Statement st = con.createStatement();
    
  
    
    String query = "INSERT INTO students (`name`, `address`, `roll`) VALUES ('XYZ', 'ABC', 7)";
    
    int rows = st.executeUpdate(query);
    
    System.out.println("Number of rows affected =" + rows);
    
   
    con.close();
    
}

}