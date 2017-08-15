import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TextFile extends AbstractClass {
    @Override
	public String getData(String input) throws FileNotFoundException {

    	String sc = new Scanner(new File(input)).useDelimiter("\\Z").next();
		return sc;


	}
	@Override
	public void writeData(String out, String content) throws FileNotFoundException {
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(out)), true));
		System.out.println(content);
	}
}
