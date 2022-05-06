package by.epam.basics_of_oop.task5a.bean;

import by.epam.basics_of_oop.task5a.Package;
import java.util.*;

public class Bouquet {

	private Package pack;
	private List<Flower> flowers = new ArrayList<Flower>();

	public Bouquet() {
		super();
	}

	public Bouquet(Package pack, List<Flower> flowers) {
		this.pack = pack;
		this.flowers = flowers;
	}

	public Package getPack() {
		return pack;
	}

	public void setPack(Package pack) {
		this.pack = pack;
	}

	public void addFlower(Flower flower) {
		flowers.add(flower);
	}

	public void removeFlower(Flower flower) {
		flowers.remove(flower);
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void addFlowers(List<Flower> flowers) {
		this.flowers.addAll(flowers);
	}

	public void removeFlowers() {
		flowers.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
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
		Bouquet other = (Bouquet) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (pack != other.pack)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String flowersStr = "";
		for (Flower flower : flowers)
			flowersStr += flower.toString() + ", ";
		flowersStr += "\n";

		return this.getClass().getSimpleName() + "\npackage: " + pack + "\nflowers: " + flowersStr;
	}

}
