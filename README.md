# aquent

Assumptions made: 
-	Java 6 or higher is used.
-	Application assumes that the orders placed by customers are not case sensitive, for example, PIZZA and pizza are treated same. So, the application converts the data read from the file into upper case, sorts the data and stores in the output file with the same case with chronological order. 
In case two customers ordered the same item at different time stamps, they are sorted based on the timestamp.
-	All the orders in the text file are represented in different lines.
-	Names of the orders are made same if spelling is same.

Design Decision:
-	This Application is designed by following all the good practices.
-	This Application is designed considering the future extensions to this project.
-	An interface named process is created with three method- getData(), process() and writeData(). The prototype is defined through this interface. Now any method which implements this interface should override all the methods in interface.
-	An abstract class named AbstractClass is created implementing the interface process. This class provides definition to the process() method. This method takes input data as string, uses various data structures like treemap, arraylists etc and sorts the data and returns output data as string.
-	As the application is reading from the file and writing data to file, TextFile class is created extending the abstract class. This class provides the definition for other two methods getData() and writeData(). getData() takes the path, reads the data from input file, stores in the string and returns the string. writeData() takes the output path and data as parameters and writes the data into the file.
-	In future, if database is used instead of file, then we can just create another DataBase class extending the provided AbstractClass and override getData() and writeData() accordingly.

