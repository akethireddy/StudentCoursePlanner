package studentCoursePlanner.state;

import studentCoursePlanner.util.Results;

/**
 * 
 * @author Abhi
 * State of a graduated student
 */
public class GraduatedState implements CoursePlannerStateI{
	CoursePlanner courseplanner;
	
	/**
	 * Empty constructor
	 */
	public GraduatedState()
	{
		
	}
	
	/**
	 * Constructor with parameters
	 * @param cpIn - Instance of CoursePlanner class
	 */
	public GraduatedState(CoursePlanner cpIn)
	{
		courseplanner=cpIn;
	}
	
	@Override
	public String toString() {
		return "GraduatedState [courseplanner=" + courseplanner
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	/**
	 * Method to send the results to the output file
	 */
	public void waitListCourse()
	{
		Results r=new Results();
		r.PrintResults(courseplanner.ListOfCoursesAssigned);
		System.exit(0);
	}
	public void prereq_validating()
	{
		System.out.println(".prerequisites are already done.Student has graduated\n");
	}
	public void graduating()
	{
		System.out.println("Student has graduated\n");
	}

	
}
