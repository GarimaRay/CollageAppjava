/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.collegeapp.view;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author chick
 */
public class CollegeAppNGTest {
    
    public CollegeAppNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of addListToTable method, of class CollegeApp.
     */
    @Test
    public void testAddListToTable() {
        System.out.println("addListToTable");
        CollegeApp instance = new CollegeApp();
        instance.addListToTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startApp method, of class CollegeApp.
     */
    @Test
    public void testStartApp() {
        System.out.println("startApp");
        CollegeApp instance = new CollegeApp();
        instance.startApp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CollegeApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CollegeApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}