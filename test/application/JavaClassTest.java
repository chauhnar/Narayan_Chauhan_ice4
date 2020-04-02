/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class JavaClassTest {
    
    public JavaClassTest() {
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
     * Test of main method, of class JavaClass.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JavaClass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of firstmethod method, of class JavaClass.
     */
    @Test
    public void testFirstmethod() {
        System.out.println("firstmethod");
        int expResult = 0;
        int result = JavaClass.firstmethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of secondmethod method, of class JavaClass.
     */
    @Test
    public void testSecondmethod() {
        System.out.println("secondmethod");
        int expResult = 0;
        int result = JavaClass.secondmethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of thirdmethod method, of class JavaClass.
     */
    @Test
    public void testThirdmethod() {
        System.out.println("thirdmethod");
        JavaClass instance = new JavaClass();
        boolean expResult = false;
        boolean result = instance.thirdmethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
