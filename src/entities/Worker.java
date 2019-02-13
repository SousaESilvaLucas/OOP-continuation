package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	/* Attributes */
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts  = new ArrayList<>();
	
	/* Constructors */
	
	public Worker() {
		
	}
	public Worker(String name, WorkerLevel level, Double baseSalary,
			Department department){
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	/* Getters and Setters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/* To String */
	public String toString() {
		return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", department=" + department
				+ ", contracts=" + contracts + "]";
	}
	
	/* Class methods */
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		boolean isItThere = contracts.remove(contract);
		if (isItThere == false)
			System.out.println("This contract was not found");
	}
	
	public Double income(Integer year, Integer month) {
		double income = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract x : contracts) {
			cal.setTime(x.getDate());
			if (cal.get(Calendar.YEAR) == year && cal.get(Calendar.MONTH) +1 == month) {
				income += x.totalValue();
			}
		}
		return income;
	}
}
