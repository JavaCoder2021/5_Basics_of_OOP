package by.epam.basics_of_oop.task4.bean;

import java.io.Serializable;
import java.util.*;

public class Dragon implements Serializable {

	private static final long serialVersionUID = 1L;
	private Set<Treasure> treasures = new HashSet<Treasure>();

	public Dragon() {
		super();
	}

	public Dragon(Set<Treasure> treasures) {
		super();
		this.treasures = treasures;
	}

	public void addTreasure(Treasure treasure) {
		treasures.add(treasure);
	}

	public void removeTreasure(Treasure treasure) {
		treasures.remove(treasure);
	}

	public Set<Treasure> getTreasures() {
		return treasures;
	}

	public void addTreasures(Set<Treasure> treasures) {
		this.treasures.addAll(treasures);
	}

	public void removeTreasures(Set<Treasure> treasures) {
		treasures.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
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
		Dragon other = (Dragon) obj;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [treasures=" + treasures + "]";
	}

}
