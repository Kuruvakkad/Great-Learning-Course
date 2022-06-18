package hrModulesuper;

public class SuperClass {
	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String isTodayAHoliday;
	String greeting;

	public void departmentName(String departmentName) {
		this.departmentName = departmentName;
		System.out.println(departmentName);

	}

	public void getTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
		System.out.println(getTodaysWork);

	}

	public void getWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
		System.out.println(getWorkDeadline);

	}

	public void isTodayAHoliday() {
		System.out.println("Today is not Holiday");
	}

	public void greeting(String greeting) {
		this.greeting = greeting;
		System.out.println("Welcome to" + greeting);
	}

}