package studentCoursePlanner.state;

/**
 * 
 * @author Abhi
 * Initial state of a not graduated student
 */
public class NotGraduatedState implements CoursePlannerStateI{
	
	CoursePlanner courseplanner;
	
	/**
	 * Empty constructor
	 */
	public NotGraduatedState()
	{
		
	}
	
	/**
	 * Constructor with parameters
	 * @param cpIn - Instance of CoursePlanner class
	 */
	public NotGraduatedState(CoursePlanner cpIn)
	{
		courseplanner=cpIn;
	}
	
	@Override
	public String toString() {
		return "NotGraduatedState [courseplanner=" + courseplanner
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	/**
	 * Method to traverse the waiting list and add courses accordingly and change the state
	 */
	public void waitListCourse()
	{	
		if(courseplanner.WaitListCourses[0]==null)
		{
			//System.out.println("n NS state if");
			courseplanner.setState(courseplanner.getPrereqCheckingState());
		}
		else if(courseplanner.WaitListCourses[0]!=null)
		{
			System.out.println("n NS state else if");
			int i=0;
			while(i<courseplanner.WaitListCourses.length && (courseplanner.WaitListCourses[i]!=null))
			{
				System.out.println("n NS state else if-wjhile");
				int traverser=0;
				for(int t=0;t<courseplanner.WaitListCourses.length;t++)
				{
					System.out.println("in while for");
					if(courseplanner.WaitListCourses[t]!=null && !courseplanner.WaitListCourses[t].equals("0"))
					{
						System.out.println("in else ifwhile-for-if");
						traverser=1;
						break;
					}
				}
				if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=65 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=68) && traverser==1)
				{
					System.out.println("n NS state else if while -if");
					if(courseplanner.ListOfCoursesAssigned[0]==null)
					{
						System.out.println("in NG sttae if");
						courseplanner.setState(courseplanner.getPrereqCheckingState());
					}
					else{
						System.out.println("n NS state else if while if else");
						for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
						{
							System.out.println("entered for loop in Graduaye stae");
							if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=65 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=68)))
							{
								if((int)courseplanner.WaitListCourses[i].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
								{
									System.out.println("entersd for -if -if loop- gradaute statre");
									courseplanner.listSelector=1;
									courseplanner.setState(courseplanner.getAddingCourseState());
									//break;
								}
								else
								{
									System.out.println("entersd for -if -else loop- gradaute statre");
									courseplanner.setState(courseplanner.getPrereqCheckingState());
								}
							}
							else
							{
								System.out.println("entersd for -else loop- gradaute statre");
								courseplanner.setState(courseplanner.getPrereqCheckingState());
							}
						}//end of for
					}//end of else
					
				}//end of if
				else if(traverser==0)
				{
					//System.out.println("n NS state else if traveser =0");
					courseplanner.setState(courseplanner.getPrereqCheckingState());
				}
				else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=69 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=72)&& traverser==1)
				{
					//System.out.println("n NS state else if while -if");
					if(courseplanner.ListOfCoursesAssigned[0]==null)
					{
						//System.out.println("in NG sttae if");
						courseplanner.setState(courseplanner.getPrereqCheckingState());
					}
					else{
						//System.out.println("n NS state else if while if else");
						for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
						{
							//System.out.println("entered for loop in Graduaye stae");
							if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=69 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=72)))
							{
								if((int)courseplanner.WaitListCourses[i].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
								{
									//System.out.println("entersd for -if -if loop- gradaute statre");
									courseplanner.setState(courseplanner.getAddingCourseState());
									courseplanner.listSelector=1;
								}
								else
								{
									//System.out.println("entersd for -if -else loop- gradaute statre");
									courseplanner.setState(courseplanner.getPrereqCheckingState());
								}
							}
							else
							{
								//System.out.println("entersd for -else loop- gradaute statre");
								courseplanner.setState(courseplanner.getPrereqCheckingState());
							}
						}//end of for
					}//end of else
				}//end of else if
				else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=73 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=76)&& traverser==1)
				{
					//System.out.println("n NS state else if while -if");
					if(courseplanner.ListOfCoursesAssigned[0]==null)
					{
						//System.out.println("in NG sttae if");
						courseplanner.setState(courseplanner.getPrereqCheckingState());
					}
					else{
						//System.out.println("n NS state else if while if else");
						for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
						{
							//System.out.println("entered for loop in Graduaye stae");
							if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=73 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=76)) )
							{
								if((int)courseplanner.WaitListCourses[i].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
								{
									//System.out.println("entersd for -if -if loop- gradaute statre");
									courseplanner.setState(courseplanner.getAddingCourseState());
									courseplanner.listSelector=1;
								}
								else
								{
									//System.out.println("entersd for -if -else loop- gradaute statre");
									courseplanner.setState(courseplanner.getPrereqCheckingState());
								}
							}
							else
							{
								//System.out.println("entersd for -else loop- gradaute statre");
								courseplanner.setState(courseplanner.getPrereqCheckingState());
							}
						}//end of for
					}//end of else
				}//end of else if
				else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=77 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=80)&& traverser==1)
				{
					//System.out.println("n NS state else if while -if");
					if(courseplanner.ListOfCoursesAssigned[0]==null)
					{
						//System.out.println("in NG sttae if");
						courseplanner.setState(courseplanner.getPrereqCheckingState());
					}
					else{
						//System.out.println("n NS state else if while if else");
						for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
						{
							//System.out.println("entered for loop in Graduaye stae");
							if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=77 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=80)) )
							{
								if((int)courseplanner.WaitListCourses[i].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
								{
									//System.out.println("entersd for -if -if loop- gradaute statre");
									courseplanner.setState(courseplanner.getAddingCourseState());
									courseplanner.listSelector=1;
								}
								else
								{
									//System.out.println("entersd for -if -else loop- gradaute statre");
									courseplanner.setState(courseplanner.getPrereqCheckingState());
								}
							}
							else
							{
								//System.out.println("entersd for -else loop- gradaute statre");
								courseplanner.setState(courseplanner.getPrereqCheckingState());
							}
						}//end of for
					}//end of else
				}
				else if(((int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)>=81 && (int)courseplanner.WaitListCourses[i].toUpperCase().charAt(0)<=90)&& traverser==1)
				{
					//System.out.println("n NS state else if while -if");
					if(courseplanner.ListOfCoursesAssigned[0]==null)
					{
						//System.out.println("in NG sttae if");
						courseplanner.setState(courseplanner.getPrereqCheckingState());
					}
					else{
						//System.out.println("n NS state else if while if else");
						for(int j=0;courseplanner.ListOfCoursesAssigned[j]!=null;j++)
						{
							//System.out.println("entered for loop in Graduaye stae");
							if((((int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)>=81 && (int)courseplanner.ListOfCoursesAssigned[j].toUpperCase().charAt(0)<=90)))
							{
								if((int)courseplanner.WaitListCourses[i].charAt(0)>=(int)courseplanner.ListOfCoursesAssigned[j].charAt(0))
								{
									//System.out.println("entersd for -if -if loop- gradaute statre");
									courseplanner.setState(courseplanner.getAddingCourseState());
									courseplanner.listSelector=1;
								}
								else
								{
									//System.out.println("entersd for -if -else loop- gradaute statre");
									courseplanner.setState(courseplanner.getPrereqCheckingState());
								}
							}
							else
							{
								//System.out.println("entersd for -else loop- gradaute statre");
								courseplanner.setState(courseplanner.getPrereqCheckingState());
							}
						}//end of for
					}//end of else
				}//end of else if
				else
				{
					System.out.println("entersd else loop- gradaute statre");
					courseplanner.setState(courseplanner.getPrereqCheckingState());
					break;
				}
				i++;
			}
		}
	}
	
	public void prereq_validating()
	{
		System.out.println("You have to send a course to check for any pre requisites");
	}
	
	public void graduating()
	{
		System.out.println("You have to take courses to graduate");
	}
	
}