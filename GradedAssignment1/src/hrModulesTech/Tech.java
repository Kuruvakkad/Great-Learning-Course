package hrModulesTech;

import hrModulesuper.SuperClass;

public class Tech extends SuperClass {
	public void Tech() {
		System.out.println("Welcome to TECH Department");
		System.out.println();
		String[] Menu = { "1.Todays Work", "2.Deadline", "3.TechStack Information" };
		for (int i = 0; i < Menu.length; i++) {
			System.out.println(Menu[i]);

		}
	}

	public void getTechStackInformation() {
		System.out.println("3.Core Java");
	}

}
