package by.epam.basics_of_oop.task1;

public class FileView {
	
	public void printFile(File file) {
		
		System.out.println(file);
		
	}
	
	public void printFiles(Directory directory) {
		
		System.out.println(directory);
		for (TextFile textFile : directory.getFiles())
			System.out.println(textFile + "\n");
		
	}

}