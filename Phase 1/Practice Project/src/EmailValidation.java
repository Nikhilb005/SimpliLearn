import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;  

public class EmailValidation{  
    public static void main(String args[]){  
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter an Email");
    	String str =sc.next();		;
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add(str);  
        
        String regex = "^(.+)@(.+)$";  
        
        Pattern pattern = Pattern.compile(regex);  
       
        for(String email : emails){    
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches());  
        }  
    }  
} 