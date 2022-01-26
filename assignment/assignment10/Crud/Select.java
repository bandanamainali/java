import java.sql.*;
public class Select{
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "");
        Statement st = con.createStatement();
        String query="SELECT * from info";
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            String name=rs.getString("name");
            String address=rs.getString("address");
            int roll=rs.getInt("roll");
            //displaying the values
            System.out.println("name is "+name);
            System.out.println("address is "+address);
            System.out.println("rollno is "+roll);
        }
        con.close();

    }
}