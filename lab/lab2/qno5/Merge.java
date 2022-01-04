import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
class Merge{
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("file3.txt");
        FileWriter fw=new FileWriter("file1.txt");
        fw.write("hey i am file no1 ");
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        FileWriter fwf=new FileWriter("file2.txt");
        fwf.write("hey i am file no2 ");
        fwf.close();
        br = new BufferedReader(new FileReader("file2.txt"));
          
        line = br.readLine();
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
        pw.flush();
        br.close();
        pw.close();
    }
}