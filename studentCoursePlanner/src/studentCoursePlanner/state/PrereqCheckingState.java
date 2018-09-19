package studentCoursePlanner.state;

/**
 * 
 * @author Abhi
 * State to check the pre-requisites of a course and change the state accordingly
 */
public class PrereqCheckingState implements CoursePlannerStateI{
	CoursePlanner courseplanner;
	
	/**
	 * Empty constructor
	 */
	public PrereqCheckingState()
	{
		
	}
	
	/**
	 * Constructor with parameters
	 * @param cpIn - Instance of CoursePlanner class
	 */
	public PrereqCheckingState(CoursePlanner cpIn)
	{
		courseplanner=cpIn;
	}
	
	@Override
	public String toString() {
		return "PrereqCheckingState [courseplanner=" + courseplanner
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public void waitListCourse()
	{
		System.out.println("Course from waiting list is not taken\n");
	}
	
	/**
	 * Method to check for pre-requisites if courses and change state accordingly
	 */
	public void prereq_validating()
	{
		if(courseplanner.ListOfCoursesAssigned[0]==null)
		{
			if(courseplanner.Courses_list[0].length()==0)
			{
				System.exit(0);
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<68)&& ((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=65))
			{
				//System.out.println("in prereqq func else if");
				courseplanner.setState(courseplanner.getAddingCourseState());
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<72)&& ((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=69))
			{
				courseplanner.setState(courseplanner.getAddingCourseState());
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<76)&& ((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=73))
			{
				courseplanner.setState(courseplanner.getAddingCourseState());
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<80)&& ((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=77))
			{
				courseplanner.setState(courseplanner.getAddingCourseState());
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=90)&& ((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=81))
			{
				courseplanner.setState(courseplanner.getAddingCourseState());
			}
			else
			{
				//System.out.println("in here- else");
				//System.exit(0);
				courseplanner.setState(courseplanner.getAddingWaitlistState());
			}
			
			
		}
		else if(courseplanner.ListOfCoursesAssigned[0]!=null)
		{			
				if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=65 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=68))
				{
					for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
					{
						if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=65 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=68)))
						{
							if((int)courseplanner.Courses_list[0].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
							{
								courseplanner.setState(courseplanner.getAddingCourseState());
							}
							else
							{
								//System.out.println("in prereq check else if -if - for-if -else");
								courseplanner.setState(courseplanner.getAddingWaitlistState());
						
							}
						}
						else
						{
							courseplanner.setState(courseplanner.getAddingCourseState());
						}
					}
				}
				else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=69 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=72))
				{
					for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
					{
						if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=69 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=72)) )
						{
							if((int)courseplanner.Courses_list[0].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
							{
								courseplanner.setState(courseplanner.getAddingCourseState());
							}
							else
							{
								courseplanner.setState(courseplanner.getAddingWaitlistState());
							}
						}
						else
						{
							courseplanner.setState(courseplanner.getAddingCourseState());
						}
					}
				}
				else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=73 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=76))
				{
					for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
					{
						if((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=73 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=76)
						{
							if((int)courseplanner.Courses_list[0].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
							{
								courseplanner.setState(courseplanner.getAddingCourseState());
							}
							else
							{
								courseplanner.setState(courseplanner.getAddingWaitlistState());
							}
						}
						else
						{
							courseplanner.setState(courseplanner.getAddingCourseState());
						}
					}
				}
				else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=77 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=80))
				{
					for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
					{
						if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=77 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=80)) )
						{
							if((int)courseplanner.Courses_list[0].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
							{
								courseplanner.setState(courseplanner.getAddingCourseState());
							}
							else
							{
								courseplanner.setState(courseplanner.getAddingWaitlistState());
							}
						}
						else
						{
							courseplanner.setState(courseplanner.getAddingCourseState());					
						}
					}
				}
				else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=81 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=90))
				{
					/*for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
					{
						if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=81 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=90)) )
						{
							if((int)courseplanner.Courses_list[0].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
							{							
								courseplanner.setState(courseplanner.getAddingCourseState());
							}
							else
							{								
								courseplanner.setState(courseplanner.getAddingWaitlistState());						
							}
						}
						else
						{						
							courseplanner.setState(courseplanner.getAddingCourseState());					
						}
					}
					*/
					System.out.println("IN pre req last else if");
					courseplanner.setState(courseplanner.getAddingCourseState());
				}
				else if(courseplanner.Courses_list[0].equals("0"))
				{
					System.out.println("All courses assigned");
				}
				else
				{
					System.out.println("IN pre req last else");
				}
		}
		
	}
	public void graduating()
	{
		System.out.println("Student cannot graduate yet\n");
	}

	
	
}