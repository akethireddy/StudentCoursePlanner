package studentCoursePlanner.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import studentCoursePlanner.state.CoursePlanner;

/**
 * 
 * @author Abhi
 * Class to read and validate the input files
 */

public class FileProcessor implements StdoutDisplayInterface{

	public static ArrayList<String> listOfFiles=new ArrayList<String>();
	public static String Bnum;
	/*
	 * Empty constructor
	 */
	public FileProcessor()
	{
		
	}
	
	/*
	 * constructor with parameters
	 * listOfFilesIn - has the array list of files provided as the arguments
	 */
	public FileProcessor(ArrayList<String> listOfFilesIn) 
	{
		listOfFiles=listOfFilesIn;
	}
	
	@Override
	public String toString() {
		return "FileProcessor [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	/**
	 * Method to validate the file
	 */
	public void fileParser()
	{
		File f1=new File(listOfFiles.get(0));
		
		if(listOfFiles.size()!=2 || listOfFiles.get(0).equals("${arg0}") || listOfFiles.get(1).equals("${arg1}"))
		{
			System.err.println("Please enter 2 files. one input file and an output file\n");
			
			System.exit(0);
		}
		else if(f1.exists()==false)
		{
			System.err.println("Input file does not exist at the specified location\n");
			System.exit(0);
		}
		else if(f1.length()==0)
		{	
			System.err.println("Input file is empty");
			System.exit(0);
		}
		else
		{
			return;
		}
		
		return;

	}

/**
 * Method to read the input file
 */
	public void fileRead()
	{
	String str;
	FileReader f1;
	BufferedReader b1=null;
	
	
	try {	
		f1 = new FileReader(listOfFiles.get(0));
		b1=new BufferedReader(f1);
		
		while((str=b1.readLine())!=null)
		{
			
			String[] splitString=str.split(":");
			if(splitString.length==1)
			{
				System.err.println("No courses are provided for the student");
				System.exit(0);
			}
			
			String[] splitCourse=splitString[1].split(" ");
			Bnum=splitString[0];
			CoursePlanner courseplanner=new CoursePlanner(splitCourse);
			int i=0;
			int counter=0;
			while(!courseplanner.Courses_list[i].equals("0") || courseplanner.Courses_list[i]==null)
			{
				if(counter==0)
				{
					courseplanner.waitListCourse(); //goes to non grad state
					counter++;
				}
				if(courseplanner.listSelector==0)
				{
				courseplanner.prereq_validating(); //goes to prereq state
				}
				courseplanner.graduating();  //goes to adding course state
				System.out.println("courses ");
				for(int l=0;l<courseplanner.ListOfCoursesAssigned.length;l++)
					System.out.println(" "+courseplanner.ListOfCoursesAssigned[l]);
				courseplanner.waitListCourse(); 
			}
			/*
			for(int j=0;j<courseplanner.ListOfCoursesAssigned.length;j++)
				System.out.println(courseplanner.ListOfCoursesAssigned[j]+",");
				*/
			Results r=new Results();
			r.PrintResults(courseplanner.ListOfCoursesAssigned);
		}

		f1.close();
		b1.close();
				
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally
	{
		if(b1!=null)
		{
			try {
				b1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}	

}
