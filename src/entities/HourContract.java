package entities;

import java.util.Date;

public class HourContract {

	/* Attributes */
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	/* Constructors */
	public HourContract() {
		
	}
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	/* Getters and Setters */
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	/* To String */
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
	
	/* Class Methods */
	public Double totalValue() {
		return hours * valuePerHour	;
	}
	
}
