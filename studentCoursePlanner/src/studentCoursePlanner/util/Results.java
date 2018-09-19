package studentCoursePlanner.util;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Abhi
 * Class to print the results to output file
 */
public class Results implements FileDisplayInterface{
	
	/**
	 * Empty Constructor
	 */
	public Results()
	{
		
	}
	
	@Override
	public String toString() {
		return "Results [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	/**
	 * Method to print results to output file
	 * @param - List of Assigned courses
	 */
	public void PrintResults(String[] finalCoursesIn)
	{
		int counter=0;
		int c=0;
		FileWriter f1;
		BufferedWriter b1=null;
	
		try {	
			f1 = new FileWriter(FileProcessor.listOfFiles.get(1));
			b1=new BufferedWriter(f1);
			b1.write(FileProcessor.Bnum+" : ");
			
			for(int j=0;j<finalCoursesIn.length;j++)
			{
				b1.write(finalCoursesIn[j]+" ");
				if(finalCoursesIn[j]==null)
					break;
				counter++;
				
				if(counter%3==0)
					c++;
			}
			if(counter%3!=0)
				c++;
			b1.write(" : "+c);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally
		{
			if(b1!=null)
				try {
					b1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
}
