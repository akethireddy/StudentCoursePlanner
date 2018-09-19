package studentCoursePlanner.state;

/**
 * 
 * @author Abhi
 * Class to add courses to waiting list
 */
public class AddingWaitListState implements CoursePlannerStateI{
	CoursePlanner courseplanner;
	
	/**
	 * Empty constructor
	 */
	public AddingWaitListState()
	{
		
	}
	
	/**
	 * Constructor with parameters
	 * @param cpIn - Instance of CoursePlanner class
	 */
	public AddingWaitListState(CoursePlanner cpIn)
	{
		courseplanner=cpIn;
	}
	
	
	@Override
	public String toString() {
		return "AddingWaitListState [courseplanner=" + courseplanner
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	public void waitListCourse()
	{
		System.out.println("No course to add from waiting list\n");
	}
	
	
	public void prereq_validating()
	{
		System.out.println("prerequisite is not done\n");		
	}
	
	/**
	 * Method to add courses to waiting list
	 */
	public void graduating()
	{
		System.out.println("in WL graduating");
		for(int i=0;i<courseplanner.WaitListCourses.length;i++)
		{
			if(courseplanner.WaitListCourses[i]==null)
			{
				courseplanner.WaitListCourses[i]=courseplanner.Courses_list[0];
				courseplanner.Courses_list[0]="0";
				int l;
				for(l=0;l<courseplanner.Courses_list.length-1;l++)
				{
					courseplanner.Courses_list[l]=courseplanner.Courses_list[l+1];
				}
				courseplanner.Courses_list[l]="0";
				courseplanner.setState(courseplanner.getNotGraduatedState());
				return;
			}
		}
		
		
	}	

	
}
