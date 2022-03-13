package by.epam.basics_of_oop.task2;

import java.util.List;
import by.epam.basics_of_oop.task2.Payment.Product;

public class PaymentView {
	
	public static void allProducts(List<Product> productList) {

		for (Product product : productList)
			System.out.println(product);

	}

	public static void oneProduct(Product product) {

		System.out.println(product);

	}

}
