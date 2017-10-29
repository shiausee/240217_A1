/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.a1._a1;

import static com.uum.a1._a1.findFiles.directory;
import static com.uum.a1._a1.findFiles.getFilesCount;
import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class findFilesTest {

    public findFilesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getFilesCount method, of class findFiles.
     */
    @Test
    public void testGetFilesCount() {
        System.out.println("number of file");
        
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        absoluteFilePath = workingDirectory + File.separator;
        File dir = new File(absoluteFilePath.replace("\\", "/"));
        int result = (findFiles.getFilesCount(dir))-3;
        int expResult = 44;
        assertEquals(expResult, result);
       
    }

    /**
     * Test of directory method, of class findFiles.
     */
    @Test
    public void testDirectory() throws Exception {
        
        System.out.println("number of issue");
       String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        absoluteFilePath = workingDirectory + File.separator;
        File dir = new File(absoluteFilePath.replace("\\", "/"));
        int expResult = 3;
        int result = findFiles.directory(dir);
        assertEquals(expResult, result);
    }

}
