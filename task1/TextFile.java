/*
Задача 1.
Создать объект класса Текстовый файл, используя классы Файл, Директория. 
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить. 
*/

package by.epam.basics_of_oop;

import java.io.File;

public class TextFile {
    
    Directory directory = new Directory();
    TextFileReader textFileReader = new TextFileReader();
    
    public File createDirectory(String dir) {
        return directory.createDirectory(dir);
    }
    
    public File renameDirectory(File myDir, String str) {
        return directory.renameDirectory(myDir, str);
    }
    
    public void deleteDirectory(File myDir) {
        directory.deleteDirectory(myDir);
    }
    
    public File createFile(String fileName) {
        return textFileReader.createFile(fileName);
    }
    
    public File renameFile(File myFile, String filename) {
        return textFileReader.renameFile(myFile, filename);
    }
    
    public void appendFile(File myFile, String str) {
        textFileReader.appendFile(myFile, str);
    }
    
    public void readFile(File myFile) {
        textFileReader.readFile(myFile);
    }
    
    public void deleteFile(File myFile) {
        textFileReader.deleteFile(myFile);
    }
        
}
