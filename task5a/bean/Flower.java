package by.epam.basics_of_oop.task5a.bean;

import by.epam.basics_of_oop.task5a.Color;
import by.epam.basics_of_oop.task5a.Type;

public class Flower {

	private Type type;
	private Color color;

	public Flower() {
		super();
	}

	public Flower(Type type, Color color) {
		super();
		this.type = type;
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Flower other = (Flower) obj;
		if (color != other.color)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return color + " " + type;
	}

}
