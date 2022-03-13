/*
 * Задача 2.  
 * Создать класс Payment с внутренним классом, 
 * с помощью объектов которого можно сформировать покупку из нескольких товаров. 
 */
package by.epam.basics_of_oop.task2;

import java.util.*;

public class Payment {
    
	private List<Product> productList;
    
	{
		productList = new LinkedList();
	}
	
    public Payment() {
		super();
	}
    
    public Payment(List<Product> products) {
		super();
		this.productList = products;
	}

	public List<Product> getProducts() {
		return productList;
	}

	public void setProducts(List<Product> productList) {
		this.productList = productList;
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}

	public static class Product {
        
		private String name;
		private double price;
		
		public Product() {
			super();
		}
		
		public Product(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + " [name=" + name + ", price=" + price + "]";
		}		
        
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productList == null) ? 0 : productList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (productList == null) {
			if (other.productList != null)
				return false;
		} else if (!productList.equals(other.productList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [productList=" + productList + "]";
	}
    
}
