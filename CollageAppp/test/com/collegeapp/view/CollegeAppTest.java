/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.collegeapp.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chick
 */
public class CollegeAppTest {
    
    public CollegeAppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
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
