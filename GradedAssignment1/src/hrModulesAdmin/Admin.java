package hrModulesAdmin;

import hrModulesuper.SuperClass;

public class Admin extends SuperClass {

	public void Admin() {

		System.out.println("Welcome to ADMIN Department");
		System.out.println();
		String[] Menu = { "1.Todays Work", "2.Deadline" };
		for (int i = 0; i < Menu.length; i++) {
			System.out.println(Menu[i]);

		}

	}

}
