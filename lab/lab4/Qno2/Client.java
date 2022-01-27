import java.io.*;
import java.net.*;
public class Client{
    public static void main(String[] args)throws IOException {
        
            
            Socket s=new Socket("localhost",2222);
            DataOutputStream d=new DataOutputStream(s.getOutputStream());
            d.writeUTF("hello server");
            d.flush();
            d.close();
            s.close();
            
        
    }
}