            import java.sql.*;
            public class Delete{
            public static void main(String[] args)throws ClassNotFoundException, SQLException{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "");
                Statement st = con.createStatement();
                String query = "delete from info where roll=7";
                int rows = st.executeUpdate(query);
                System.out.println("delete  data of info");
            con.close();
            }
        }