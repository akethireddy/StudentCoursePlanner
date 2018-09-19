package studentCoursePlanner.driver;

import studentCoursePlanner.util.FileProcessor;
import java.util.ArrayList;
/**
 * 
 * @author Abhi
 *
 *Driver Code
 */
public class Driver {
	public static void main(String[] args) {
	ArrayList<String> listOfFiles=new ArrayList<String>();
	listOfFiles.add(args[0]);
	listOfFiles.add(args[1]);
	FileProcessor fp=new FileProcessor(listOfFiles);
	fp.fileParser();
	fp.fileRead();
	}
}
