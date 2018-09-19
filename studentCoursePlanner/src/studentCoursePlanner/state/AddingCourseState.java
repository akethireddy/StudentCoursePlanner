package studentCoursePlanner.state;

/**
 * 
 * @author Abhi
 * AddingCourseState to add courses to the student
 */
public class AddingCourseState implements CoursePlannerStateI{
	CoursePlanner courseplanner;
	
	/**
	 * Empty constructor
	 */
	public AddingCourseState()
	{
		
	}
	
	/**
	 * Constructor with parameters
	 * @param cpIn - Instance of CoursePlanner class
	 */
	public AddingCourseState(CoursePlanner cpIn)
	{
		courseplanner=cpIn;
	}
	
	
	@Override
	public String toString() {
		return "AddingCourseState [courseplanner=" + courseplanner
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	public void waitListCourse()
	{
		System.out.println("No course to add from waiting list\n");
	}
	
	
	public void prereq_validating()
	{
		System.out.println("prerequisite is already done\n");
	}
	
	/**
	 * Method to Add courses to student
	 */
	public void graduating()
	{
		int i=0;
		
		if(courseplanner.listSelector==1)
		{
			System.out.println("in listSelector==1");
			while(courseplanner.WaitListCourses[i]!=null)
			{
			if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=65 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=68))
			{
				for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
				{
					if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=65 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=68)) && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0))
					{
						int k=0;
						while(courseplanner.ListOfCoursesAssigned[k]!=null)
						{
							k++;
						}
							courseplanner.ListOfCoursesAssigned[k]=courseplanner.WaitListCourses[i];
							courseplanner.num_of_courses_assigned++;
							courseplanner.num_of_lp_courses++;
							courseplanner.WaitListCourses[i]="0";
							courseplanner.listSelector=0;
					}
				}
			}
			else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=69 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=72))
			{
				for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
				{
					if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=69 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=72)) && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0))
					{
						int k=0;
						while(courseplanner.ListOfCoursesAssigned[k]!=null)
						{
							k++;
						}
							courseplanner.ListOfCoursesAssigned[k]=courseplanner.WaitListCourses[i];
							courseplanner.num_of_courses_assigned++;
							courseplanner.num_of_ds_courses++;
							courseplanner.WaitListCourses[i]="0";
							courseplanner.listSelector=0;
					}
					
				}
			}
			else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=73 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=76))
			{
				for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
				{
					if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=73 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=76)) && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0))
					{
						int k=0;
						while(courseplanner.ListOfCoursesAssigned[k]!=null)
						{
							k++;
						}
							courseplanner.ListOfCoursesAssigned[k]=courseplanner.WaitListCourses[i];
							courseplanner.num_of_courses_assigned++;
							courseplanner.num_of_hs_courses++;
							courseplanner.WaitListCourses[i]="0";
							courseplanner.listSelector=0;
					}
				}
			}
			else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=77 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=80))
			{
				for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
				{
					if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=77 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=80)) && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0))
					{
						int k=0;
						while(courseplanner.ListOfCoursesAssigned[k]!=null)
						{
							k++;
						}
							courseplanner.ListOfCoursesAssigned[k]=courseplanner.WaitListCourses[i];
							courseplanner.num_of_courses_assigned++;
							courseplanner.num_of_da_courses++;
							courseplanner.WaitListCourses[i]="0";
							courseplanner.listSelector=0;
					}
				}
			}
			else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=81 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=90))
			{
				for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
				{
					if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=81 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=90)) && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0))
					{
						int k=0;
						while(courseplanner.ListOfCoursesAssigned[k]!=null)
						{
							k++;
						}
							courseplanner.ListOfCoursesAssigned[k]=courseplanner.WaitListCourses[i];
							courseplanner.num_of_courses_assigned++;
							courseplanner.num_of_elective_courses++;
							courseplanner.WaitListCourses[i]="0";
							courseplanner.listSelector=0;
					}
				}
			}
		i++;	
		}
			
		}
		
		else if(courseplanner.listSelector==0)
		{
			System.out.println("in listSelector==0");
			if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=65 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=68))
			{
				int x=0;
				for(x=0;x<courseplanner.ListOfCoursesAssigned.length;x++)
				{
					if(courseplanner.ListOfCoursesAssigned[x]==null)
					{
						courseplanner.ListOfCoursesAssigned[x]=courseplanner.Courses_list[0];
						courseplanner.Courses_list[0]="0";
						courseplanner.num_of_courses_assigned++;
						courseplanner.num_of_lp_courses++;
						break;
					}
					
				}
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=69 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=72))
			{
				int x=0;
				for(x=0;x<courseplanner.ListOfCoursesAssigned.length;x++)
				{
					if(courseplanner.ListOfCoursesAssigned[x]==null)
					{
						courseplanner.ListOfCoursesAssigned[x]=courseplanner.Courses_list[0];
						courseplanner.Courses_list[0]="0";
						courseplanner.num_of_courses_assigned++;
						courseplanner.num_of_ds_courses++;
						break;
					}
					
				}
				
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=73 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=76))
			{
				int x=0;
				for(x=0;x<courseplanner.ListOfCoursesAssigned.length;x++)
				{
					if(courseplanner.ListOfCoursesAssigned[x]==null)
					{
						courseplanner.ListOfCoursesAssigned[x]=courseplanner.Courses_list[0];
						courseplanner.Courses_list[0]="0";
						courseplanner.num_of_courses_assigned++;
						courseplanner.num_of_hs_courses++;
						break;
					}
					
				}
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=77 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=80))
			{
				int x=0;
				for(x=0;x<courseplanner.ListOfCoursesAssigned.length;x++)
				{
					if(courseplanner.ListOfCoursesAssigned[x]==null)
					{
						courseplanner.ListOfCoursesAssigned[x]=courseplanner.Courses_list[0];
						courseplanner.Courses_list[0]="0";
						courseplanner.num_of_courses_assigned++;
						courseplanner.num_of_da_courses++;
						break;
					}
					
				}
			}
			else if(((int)courseplanner.Courses_list[0].toUpperCase().charAt(0)>=81 && (int)courseplanner.Courses_list[0].toUpperCase().charAt(0)<=90))
			{
				int x=0;
				for(x=0;x<courseplanner.ListOfCoursesAssigned.length;x++)
				{
					if(courseplanner.ListOfCoursesAssigned[x]==null)
					{
						courseplanner.ListOfCoursesAssigned[x]=courseplanner.Courses_list[0];
						courseplanner.Courses_list[0]="0";
						courseplanner.num_of_courses_assigned++;
						courseplanner.num_of_elective_courses++;
						break;
					}
					
				}
			}
			
			int l;
			for(l=0;l<courseplanner.Courses_list.length-1;l++)
			{
				courseplanner.Courses_list[l]=courseplanner.Courses_list[l+1];
			}
			courseplanner.Courses_list[l]="0";
			
			
		}
		
		if(courseplanner.getNum_of_courses_assigned()>=10 && courseplanner.getNum_of_da_courses()>=2 && courseplanner.getNum_of_ds_courses()>=2 && courseplanner.getNum_of_hs_courses()>=2 && courseplanner.getNum_of_lp_courses()>=2 && courseplanner.getNum_of_elective_courses()>=2)
			courseplanner.setState(courseplanner.getGraduatedState());
		else
			courseplanner.setState(courseplanner.getNotGraduatedState());
		
	}

	
}
