import java.io.*;
import java.net.*;
  
class ChatClient2 {
  
    public static void main(String args[]) throws Exception
    {
  
        
        Socket s = new Socket("localhost", 888);
  
        
        DataOutputStream o = new DataOutputStream(s.getOutputStream());
  
        
        BufferedReader br = new BufferedReader( new InputStreamReader(s.getInputStream()));
  
        
        BufferedReader b= new BufferedReader( new InputStreamReader(System.in));
        String str, str1;
  
        
        while (!(str = b.readLine()).equals("exit")) {
  
            
            o.writeBytes(str + "\n");
  
            
            str1 = br.readLine();
  
            System.out.println(str1);
        }
  
       
        o.close();
        br.close();
        b.close();
        s.close();
    }
}
