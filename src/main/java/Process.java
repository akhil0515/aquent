import java.io.FileNotFoundException;

public interface Process {
	String getData(String in) throws FileNotFoundException;
	String process(String data);
	void writeData(String out,String content) throws FileNotFoundException;
}
