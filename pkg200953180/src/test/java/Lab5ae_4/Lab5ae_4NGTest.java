/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package Lab5ae_4;

import static org.testng.Assert.*;

/**
 *
 * @author Shivank Sinha
 */
public class Lab5ae_4NGTest {
    
    public Lab5ae_4NGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of push method, of class Lab5ae_4.
     */
    @org.testng.annotations.Test
    public void testPush() {
        System.out.println("push");
        int n = 0;
        Lab5ae_4 instance = new Lab5ae_4();
        instance.push(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Lab5ae_4.
     */
    @org.testng.annotations.Test
    public void testPop() {
        System.out.println("pop");
        Lab5ae_4 instance = new Lab5ae_4();
        int expResult = 0;
        int result = instance.pop();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Lab5ae_4.
     */
    @org.testng.annotations.Test
    public void testDisplay() {
        System.out.println("display");
        Lab5ae_4 instance = new Lab5ae_4();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
