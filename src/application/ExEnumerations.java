package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class ExEnumerations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
		// OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");
		// System.out.println(os1);
		// System.out.println(os2);
		
		Order o1 = new Order(1234, new Date(),OrderStatus.PENDING_PAYMENT);
		System.out.println(o1);
	}

}
