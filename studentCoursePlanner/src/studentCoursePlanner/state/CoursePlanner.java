package studentCoursePlanner.state;

import java.util.Arrays;

/**
 * 
 * @author Abhi
 * Abstraction metho which has an instance to all the state
 */
public class CoursePlanner {
	CoursePlannerStateI notGraduatedState;
	CoursePlannerStateI prereqCheckingState;
	CoursePlannerStateI addingCourseState;
	CoursePlannerStateI addingWaitlistState;
	CoursePlannerStateI graduatedState;

	CoursePlannerStateI state=notGraduatedState;
	int num_of_courses_assigned=0;
	int num_of_lp_courses=0;
	int num_of_ds_courses=0;
	int num_of_hs_courses=0;
	int num_of_da_courses=0;
	int num_of_elective_courses=0;
	public String Courses_list[];
	String WaitListCourses[];
	public String ListOfCoursesAssigned[];
	public int listSelector=0;
	
	/**
	 * Empty constructor
	 */
	public CoursePlanner()
	{
		
	}
	
	/**
	 * Constructor with parameters
	 * @param list_of_courses - list of the required courses
	 */
	public CoursePlanner(String[] list_of_courses)
	{
		
		if(list_of_courses[0].length()==0 && list_of_courses[1].length()!=0)
		{
			Courses_list=new String[list_of_courses.length-1];
			WaitListCourses=new String[list_of_courses.length-1];
			ListOfCoursesAssigned=new String[list_of_courses.length-1];
			for(int i=1;i<list_of_courses.length;i++)
			{
				Courses_list[i-1]=list_of_courses[i];
				
			}
			for(int i=0;i<Courses_list.length;i++)
			{
				System.out.println(Courses_list[i]+"+");
			}
		}
		else
		{
			Courses_list=new String[list_of_courses.length];
			WaitListCourses=new String[list_of_courses.length];
			ListOfCoursesAssigned=new String[list_of_courses.length];
			for(int i=0;i<list_of_courses.length;i++)
				Courses_list[i]=list_of_courses[i];
		}
		notGraduatedState=new NotGraduatedState(this);
		prereqCheckingState=new PrereqCheckingState(this);
		addingCourseState=new AddingCourseState(this);
		addingWaitlistState=new AddingWaitListState(this);
		graduatedState=new GraduatedState(this);
		
		if(num_of_courses_assigned>=10 && num_of_lp_courses>=2 && num_of_ds_courses>=2 && num_of_hs_courses>=2 && num_of_da_courses>=2 && num_of_elective_courses>=2)
		{
			state=graduatedState;
		}
		else
		{
			state=notGraduatedState;
		}
		
		/*
		for(int i=0;i<Courses_list.length;i++)
		{
			System.out.println(Courses_list[i]+":");
			
		}
		*/
	}
	
	@Override
	public String toString() {
		return "CoursePlanner [notGraduatedState=" + notGraduatedState
				+ ", prereqCheckingState=" + prereqCheckingState
				+ ", addingCourseState=" + addingCourseState
				+ ", addingWaitlistState=" + addingWaitlistState
				+ ", graduatedState=" + graduatedState + ", state=" + state
				+ ", num_of_courses_assigned=" + num_of_courses_assigned
				+ ", num_of_lp_courses=" + num_of_lp_courses
				+ ", num_of_ds_courses=" + num_of_ds_courses
				+ ", num_of_hs_courses=" + num_of_hs_courses
				+ ", num_of_da_courses=" + num_of_da_courses
				+ ", num_of_elective_courses=" + num_of_elective_courses
				+ ", Courses_list=" + Arrays.toString(Courses_list)
				+ ", WaitListCourses=" + Arrays.toString(WaitListCourses)
				+ ", ListOfCoursesAssigned="
				+ Arrays.toString(ListOfCoursesAssigned) + ", listSelector="
				+ listSelector + "]";
	}
	
	public void waitListCourse()
	{
		state.waitListCourse();
	}
	
	public void prereq_validating()
	{
		state.prereq_validating();
	}
	
	public void graduating()
	{
		state.graduating();
	}
	
	void setState(CoursePlannerStateI state) {
		this.state = state;
		}

	public CoursePlannerStateI getNotGraduatedState() {
		return notGraduatedState;
	}

	public void setNotGraduatedState(CoursePlannerStateI notGraduatedState) {
		this.notGraduatedState = notGraduatedState;
	}

	public CoursePlannerStateI getPrereqCheckingState() {
		return prereqCheckingState;
	}

	public void setPrereqCheckingState(CoursePlannerStateI prereqCheckingState) {
		this.prereqCheckingState = prereqCheckingState;
	}

	public CoursePlannerStateI getAddingCourseState() {
		return addingCourseState;
	}

	public void setAddingCourseState(CoursePlannerStateI addingCourseState) {
		this.addingCourseState = addingCourseState;
	}

	public CoursePlannerStateI getAddingWaitlistState() {
		return addingWaitlistState;
	}

	public void setAddingWaitlistState(CoursePlannerStateI addingWaitlistState) {
		this.addingWaitlistState = addingWaitlistState;
	}

	public CoursePlannerStateI getGraduatedState() {
		return graduatedState;
	}

	public void setGraduatedState(CoursePlannerStateI graduatedState) {
		this.graduatedState = graduatedState;
	}

	public int getNum_of_courses_assigned() {
		return num_of_courses_assigned;
	}

	public void setNum_of_courses_assigned(int num_of_courses_assigned) {
		this.num_of_courses_assigned = num_of_courses_assigned;
	}

	public int getNum_of_lp_courses() {
		return num_of_lp_courses;
	}

	public void setNum_of_lp_courses(int num_of_lp_courses) {
		this.num_of_lp_courses = num_of_lp_courses;
	}

	public int getNum_of_ds_courses() {
		return num_of_ds_courses;
	}

	public void setNum_of_ds_courses(int num_of_ds_courses) {
		this.num_of_ds_courses = num_of_ds_courses;
	}

	public int getNum_of_hs_courses() {
		return num_of_hs_courses;
	}

	public void setNum_of_hs_courses(int num_of_hs_courses) {
		this.num_of_hs_courses = num_of_hs_courses;
	}

	public int getNum_of_da_courses() {
		return num_of_da_courses;
	}

	public void setNum_of_da_courses(int num_of_da_courses) {
		this.num_of_da_courses = num_of_da_courses;
	}

	public int getNum_of_elective_courses() {
		return num_of_elective_courses;
	}

	public void setNum_of_elective_courses(int num_of_elective_courses) {
		this.num_of_elective_courses = num_of_elective_courses;
	}

	public String[] getCourses_list() {
		return Courses_list;
	}

	public void setCourses_list(String[] courses_list) {
		Courses_list = courses_list;
	}

	public String[] getWaitListCourses() {
		return WaitListCourses;
	}

	public void setWaitListCourses(String[] waitListCourses) {
		WaitListCourses = waitListCourses;
	}

	public String[] getListOfCoursesAssigned() {
		return ListOfCoursesAssigned;
	}

	public void setListOfCoursesAssigned(String[] listOfCoursesAssigned) {
		ListOfCoursesAssigned = listOfCoursesAssigned;
	}

	public int getListSelector() {
		return listSelector;
	}

	public void setListSelector(int listSelector) {
		this.listSelector = listSelector;
	}

	
}

