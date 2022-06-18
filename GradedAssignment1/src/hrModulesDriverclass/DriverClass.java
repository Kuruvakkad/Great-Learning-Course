package hrModulesDriverclass;

import java.util.Scanner;

import hrModulesAdmin.Admin;
import hrModulesHr.Hr;
import hrModulesTech.Tech;

public class DriverClass {

	public static void main(String[] args) {
		Admin obj = new Admin();
		Hr obj1 = new Hr();
		Tech obj2 = new Tech();
		Scanner sc = new Scanner(System.in);
		System.out.println("Department list");
		System.out.println("-------------------------");
		System.out.println("Enter an option number to seect the a Department");
		int option;
		do {
			System.out.println();
			System.out.println("-------------------------");
			String[] Menu = { "1.ADMIN DEPARTMENT", "2.HR DEPARTMENT", "3.TECH DEPARTMENT", "0.exit" };

			for (int i = 0; i < Menu.length; i++) {
				System.out.println(Menu[i]);
			}
			System.out.println("-------------------------");

			option = sc.nextInt();
			switch (option) {
			case 0:
				option = 0;
				break;

			case 1: {
				obj.Admin();
				System.out.println(".......");
				obj.getTodaysWork("1.Complete your Document submission");
				obj.getWorkDeadline("2.Complete by EOD");
				System.out.print("Day Status: ");
				obj1.isTodayAHoliday();
			}
				break;
			case 2: {
				obj1.Hr();
				System.out.println(".......");
				obj1.getTodaysWork("1.Fill today’s worksheet and mark your attendance");
				obj1.getWorkDeadline("2.Complete by EOD");
				obj1.activity();
				System.out.print("Day Status: ");
				obj1.isTodayAHoliday();

			}
				break;
			case 3: {
				obj2.Tech();
				System.out.println(".......");
				obj2.getTodaysWork("1.Complete Coding of Module 1");
				obj2.getTodaysWork("2.Complete By EOD");
				obj2.getTechStackInformation();
				System.out.print("Day Status: ");
				obj1.isTodayAHoliday();

			}
				break;
			default:
				System.out.println("Enter a valid option");
			}
		} while (option != 0);
		System.out.println("Exited Successfully !!");
		sc.close();

	}

}
