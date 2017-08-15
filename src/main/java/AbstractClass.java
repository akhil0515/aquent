import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public abstract class AbstractClass implements Process {
	
	public void call(String in, String out) throws FileNotFoundException {
		String data = getData(in);
		String cleanData = process(data);
		writeData(out, cleanData);
	}
	
@Override
	public String process(String data) {
		TreeMap<String, ArrayList<Integer>> content = new TreeMap<String, ArrayList<Integer>>();
		for(String line : data.split("\\n")) {
			if(!line.contains("Order")) {
				if(!"".equals(line)) {
					line = line.replaceAll("\\s{2,}", " ").trim();
					String[] orders = line.split("\\s");
					if(orders.length > 1) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						if(content.containsKey(orders[0].toLowerCase())) {
							temp = content.get(orders[0].toLowerCase());
							temp.add(Integer.parseInt(orders[1]));
						} else {
							temp.add(Integer.parseInt(orders[1]));
							content.put(orders[0].toLowerCase(), temp);
						}
					}
				}
			}
		}
		//clean format data -> string
		String answer = "";
		for(String key : content.keySet()) {
			Collections.sort(content.get(key));
			for(int i : content.get(key)) {
				answer += "The item " + key.toUpperCase() + " is ordered at\t" + i + ".\n";
			}
		}
		return answer;
	}
	
	public abstract String getData(String input) throws FileNotFoundException;
	public abstract void writeData(String out, String outputData) throws FileNotFoundException;
}
