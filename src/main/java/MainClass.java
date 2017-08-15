import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {   
    	try{
    	
    	String input = args[0];
    	String output = args[1];
        
    	
    	AbstractClass s = new TextFile();
    	try {
			s.call(input, output);
		
    	}catch (FileNotFoundException e){
    		System.out.println("file not found in the given input location");
		}
    	}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Please enter the arguments");
		}
    
    	   	
    	
    }
 		
        
    
    }
    