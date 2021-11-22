package by.epam.basics_of_oop;

import java.io.File;

public class Directory {
    
    public File createDirectory(String directory) {
        
        File theDir = new File(directory);
        boolean created = theDir.mkdirs();

        if (!theDir.exists()) 
        {
            
            System.out.println("Creating directory: " + theDir.getName());
            boolean result = false;

            try 
            {
                theDir.mkdir();
                result = true;
            } 
            catch(SecurityException se)
            {
                //handle it
            }        
            if(result) 
            {    
                System.out.println("DIR" + directory + "created!");  
            }
        }        
        
        return theDir;
        
    }
    
    public File renameDirectory(File myDir, String str) {
        
        File newDir = new File(str);
        myDir.renameTo(newDir);
        myDir.delete();
        
        return newDir;
    }    
    
    public void deleteDirectory(File myDir) {
        
        boolean deleted = myDir.delete();
        
        if (deleted)
            System.out.println(myDir.getPath() + "Folder has been deleted!");    
        
    }
    
}
