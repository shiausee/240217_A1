//Sem ; A171
//Course : STIW3054
//Group : A
//Task : Asg 2
//Matric : 240217
//Name : Lim Shiau See
package com.uum.a1._a1;

import static com.uum.a1._a1.findFiles.numIssue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Realtime_Asg1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String workingDirectory = System.getProperty("user.dir");

        String absoluteFilePath = "";
        absoluteFilePath = workingDirectory + File.separator;

        System.out.println("Final filepath : " + absoluteFilePath);

        File dir = new File(absoluteFilePath);

        if (dir.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File is already existed!");
        }        findFiles fFile = new findFiles();
        int fileCount = fFile.getFilesCount(dir);
        System.out.println("File Count:" + fileCount);
        int numI = fFile.directory(dir);// because it main class contain "public static void main" it not a issue
        int numIs = numI - 2;
        System.out.println("Number of issue:" + numIs);
    }

}
