package by.epam.basics_of_oop.task2;

public class Main {

	public static void main(String[] args) {

		Payment payment = new Payment();
		
		payment.addProduct(new Payment.Product("Orange", 500.0));
		payment.addProduct(new Payment.Product("Bananas", 700.0));
		
		PaymentShow.allProducts(payment.getProducts());
		
		System.out.println("Sum=" + PaymentLogic.getSum(payment.getProducts()));

	}

}
