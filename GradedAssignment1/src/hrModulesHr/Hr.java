package hrModulesHr;

import hrModulesuper.SuperClass;

public class Hr extends SuperClass {
	public void Hr() {
		System.out.println("Welcome to HR Department");
		System.out.println();
		String[] Menu = { "1.Todays Work", "2.Deadline", "3.Activity" };
		for (int i = 0; i < Menu.length; i++) {
			System.out.println(Menu[i]);

		}
	}

	public void activity() {
		System.out.println("3.Team Lunch");
	}

}
