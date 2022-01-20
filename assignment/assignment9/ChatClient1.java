import java.io.*;
import java.net.*;
  
class ChatClient1 {
  
    public static void main(String args[]) throws Exception
    {
  
        ServerSocket ss = new ServerSocket(888);
  
       
        Socket s = ss.accept();
        System.out.println("Connection established");
  
        
        PrintStream ps= new PrintStream(s.getOutputStream());
  
        
        BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
  
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  
        
        while (true) {
  
            String str, str1;
  
  
            
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                str1 = b.readLine();
  
                
                ps.println(str1);
            }
  
            
            ps.close();
            br.close();
            b.close();
            ss.close();
            s.close();
  
            System.exit(0);
  
        } 
    }
}