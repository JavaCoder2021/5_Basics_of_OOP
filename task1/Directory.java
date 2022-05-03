package by.epam.basics_of_oop.task1;

import java.io.Serializable;
import java.util.*;

public class Directory implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
    private List<TextFile> files = new ArrayList<TextFile>();
    
	public Directory() {
		super();
	}
    
	public Directory(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TextFile> getFiles() {
		return files;
	}

	public void addFiles(List<TextFile> files) {
		this.files.addAll(files);
	}
	
	public void removeFiles() {
		files.clear();;
	}
	
	public void addFile(TextFile textFile) {
		this.files.add(textFile);
	}
	
	public void removeFile(TextFile textFile) {
		files.remove(textFile);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory: " + name + "\n";
	}    

}