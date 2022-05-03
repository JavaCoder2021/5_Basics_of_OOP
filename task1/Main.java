/*
 * Задача 1.
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
package by.epam.basics_of_oop.task1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Directory directory = new Directory("Text files");
		FileView view = new FileView();

		TextFile textFile1 = new TextFile("My file1", "Text of file1 here.");
		TextFile textFile2 = new TextFile("My file2", "Text of file2 here.");
		textFile1.addText(" Added text.");
		textFile1.rename("Renamed file");

		directory.addFiles(Arrays.asList(textFile1, textFile2));

		view.printFiles(directory);

	}

}
