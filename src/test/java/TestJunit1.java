import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestJunit1 {


@Test(expected=FileNotFoundException.class)

    public void testApplicationThrowsFileNotFoundException() throws FileNotFoundException {
    TextFile tf=new TextFile();
   String s=tf.getData("C:\\o.txt");
}
@Test
    public void testSorting(){

        String input = "Order\t\t\tTime\nMeat\t\t\t\t1506176687\npizza\t\t\t1477491887\npizza\t\t\t1477491888";

        TreeMap<String, TreeSet<Integer>> expectedMap = new TreeMap<String, TreeSet<Integer>>();
        TreeSet<Integer> timeList = new TreeSet<Integer>();

        timeList.add(1506176687);
        expectedMap.put("Meat", timeList);
        timeList = new TreeSet<Integer>();
        timeList.add(1477491887);
        timeList.add(1477491888);
        expectedMap.put("pizza", timeList);
        String expectedOutput = "";
        for(String key : expectedMap.keySet()) {
            //Collections.sort(content.get(key));
            for(int i : expectedMap.get(key)) {
                expectedOutput += "The item " + key.toUpperCase() + " is ordered at\t" + i + "\n";
            }
        }

        AbstractClass s = new TextFile();

        //String expectedOutput = "The item MEAT is ordered at\t1506176687.\nThe item PIZZA is ordered at\t1477491887.\nThe item PIZZA is ordered at\t1477491888.";
        String actualOutput = s.process(input);


       /* if(actualOutput.equals(expectedOutput.trim())){
        	System.out.println("true");
        }*/

        assertTrue(actualOutput.equals(expectedOutput));

    }
}



