package by.epam.basics_of_oop.task4.bean;

import java.io.Serializable;

public class Treasure implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int sum;
	
	public Treasure() {
		super();
	}	
	
	public Treasure(String name, int sum) {
		super();
		this.name = name;
		this.sum = sum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sum;
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
		Treasure other = (Treasure) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure " + name + " " + sum + "$";
	}	

}
