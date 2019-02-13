package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ExComposition3 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf_birthday = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client's data: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String clientBirthDate = sc.next();
		
		System.out.println("Enter Order Data: ");
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(new Date(),OrderStatus.valueOf(status), 
				new Client(clientName, clientEmail, sdf_birthday.parse(clientBirthDate)));
		
		System.out.print("How many items to this order? ");
		int nItems = sc.nextInt();
		
		for (int i = 1; i <= nItems; i++) {
			System.out.printf("Enter item #%d data: %n",i);
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			order.addItems(new OrderItem(productQuantity,
					productPrice, new Product(productName, productPrice)));
		}
		
		System.out.println();
		System.out.println(order.toString());
		sc.close();
	}

}
