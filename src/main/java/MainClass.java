import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException  {    	
   	String input = args[0];
    	String output = args[1];
//    	String dummy = "C:\\Users\\kaush\\Downloads\\op.txt";
//    	String dataUrl = "C:\\Users\\kaush\\Downloads\\Telegram Desktop\\sample.txt";
    	AbstractClass s = new TextFile();
    	try {
			s.call(input, output);
		}catch (FileNotFoundException e){
    		System.out.println("file not found in the given input location");
		}
    }
}