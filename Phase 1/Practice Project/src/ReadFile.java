import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
import java.io.FileReader;  
public class ReadFile {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("F:\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    