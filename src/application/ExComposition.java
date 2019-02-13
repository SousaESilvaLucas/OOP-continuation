package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ExComposition {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sd1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String depName = sc.next();
		System.out.println("Enter worker's data: ");
		System.out.print("Name: ");
		sc.nextLine();
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, 
				WorkerLevel.valueOf(level), baseSalary, new Department(depName));
		
		System.out.print("How many contracts does the worker have? ");
		int nContracts = sc.nextInt();	
		
		for (int i = 1;i <= nContracts ;i++) {
			System.out.printf("Enter contract #%d data %n",i);
			System.out.print("Data(DD/MM/YYYY): ");
			Date date = sd1.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration(hours): ");
			int duration = sc.nextInt();
			worker.addContract(new HourContract (date, valuePerHour, duration));		
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.next();
		
		/*Separating month and year and parsing to integer*/
		int month = Integer.parseInt(monthYear.substring(0, monthYear.indexOf('/')).trim()); 
		int year = Integer.parseInt(monthYear.substring(monthYear.indexOf('/') + 1).trim());
		
		/*Printing results*/
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for " + monthYear + ": %.2f", worker.income(year, month));
		
		
		sc.close();

	}

}
