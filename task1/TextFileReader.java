package by.epam.basics_of_oop.task1;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TextFileReader {
    
    public File createFile(String fileName) {
        File newFile = new File(fileName);
        try {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created!");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        } 
        return newFile;
    }
    
    public File renameFile(File myFile, String filename) {
        File newFile = new File(filename);
        if (myFile.renameTo(newFile)) {
            System.out.println("File renamed successfully!");;
        }
        else {
            System.out.println("The file has not been renamed!");
        }
        return newFile;
    }
    
    public void appendFile(File myFile, String str) {   
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true))) {
            String updatedText = str.replaceAll("\n", System.lineSeparator());
            writer.write(updatedText);
            writer.close();
        }
        catch ( IOException e ) {
            System.out.println(e.getMessage());
        }   
    }
    
    public void readFile(File myFile) {      
        String lineRead;
        System.out.println("---------------------");                
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            
            lineRead = reader.readLine();
            while (lineRead != null) {
                System.out.println(lineRead);
                lineRead = reader.readLine();
            }
            reader.close();
        }    
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------"); 
    }

    public void deleteFile(File myFile) {     
        if(myFile.delete()) {
            System.out.println(myFile.getName() + " the file has been deleted!");
        }
        else 
            System.out.println(myFile.getName() + "was not found in the folder!");
    }
    
}
