/*
Задача 1.
Создать объект класса Текстовый файл, используя классы Файл, Директория. 
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить. 
*/

package javacoder2021;

import by.epam.basics_of_oop.*;
import java.io.File;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        String str = ""
            + "Discover Linguapress online learning resources. \n"
            + "All texts and worksheets are absolutely free for anyone to use. \n"
            + "Linguapress pages can be accessed by anyone, from anywhere. \n"
            + "";
        
        TextFile myFile = new TextFile();
        
        File theDir = myFile.createDirectory("by/epam/text/");
        theDir = myFile.renameDirectory(theDir, "by/epam/textfile/");
        
        File textFile = myFile.createFile(theDir.getPath() + "/" + "TextFile.txt");
        textFile = myFile.renameFile(textFile, theDir.getPath() + "/" + "TextFileRenamed.txt");        
    
        myFile.appendFile(textFile, str);
        myFile.readFile(textFile);
        
        myFile.deleteFile(textFile);
        myFile.deleteDirectory(theDir);    
        
    }

}
