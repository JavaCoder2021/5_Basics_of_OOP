package by.epam.basics_of_oop.task2;

import java.util.List;
import by.epam.basics_of_oop.task2.Payment.Product;

public class PaymentLogic {
	
	public static double getSum(List<Product> productList) {
		
		double sum;
		sum = 0.0;
		
		for (Product product : productList)
			sum += product.getPrice();
		
		return sum;
		
	}

}
