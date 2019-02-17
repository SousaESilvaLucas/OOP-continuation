package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ExHeritage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int nEmployees = sc.nextInt();
		
		for (int i = 1;i <= nEmployees; i++) {
			System.out.printf("Employee #%d data %n",i);
			System.out.print("Outsourced? (y/n): ");
			char isOutsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (isOutsourced == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
			}
			else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		for (Employee e : employees)
			System.out.printf(e.getName() + " - $ %.2f %n",e.payment());
		
		sc.close();
	}

}
