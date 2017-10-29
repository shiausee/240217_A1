/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.a1._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class findFiles {

    public static int numIssue ;
    public findFiles() {

    }

    public static int directory(File dir) throws IOException {

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.listFiles() != null) {
                directory(file);
            }
        }
        String[] f = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            for (File file : files) {
                f[i] = file.getAbsolutePath();
                String fileName = f[i];
                if (fileName.endsWith(".java")) {
                    File x = new File(fileName);
                    BufferedReader br = new BufferedReader(new FileReader(x));
                    String st;
                    String in = "public static void main";
                    while ((st = br.readLine()) != null) {
                        if (st.contains(in)) {
                            numIssue ++;
                        }
                    }
                }
            }
            break;
        }
        return numIssue;
    }

    public static int getFilesCount(File file) {
        File[] files = file.listFiles();
        int count = 0;
        for (File f : files) {
            if (f.isDirectory()) {
                count += getFilesCount(f);
            } else {
                count++;
            }
        }
        return count;
    }
}
