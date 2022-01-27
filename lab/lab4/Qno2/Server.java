import java.io.*;
import java.net.*;
public class Server{
    public static void main(String[] args) throws IOException{
        
            ServerSocket ss=new ServerSocket(2222);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            System.out.println((String) dis.readUTF());
            ss.close();
            
        
    }
}