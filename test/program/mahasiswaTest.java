/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class mahasiswaTest {
    
    public mahasiswaTest() {
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
     * Test of setnim method, of class mahasiswa.
     */
    @Test
    public void testSetnim() {
        System.out.println("setnim");
        String nim = "";
        mahasiswa instance = null;
        instance.setnim(nim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnama method, of class mahasiswa.
     */
    @Test
    public void testSetnama() {
        System.out.println("setnama");
        String nama = "";
        mahasiswa instance = null;
        instance.setnama(nama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setipk method, of class mahasiswa.
     */
    @Test
    public void testSetipk() {
        System.out.println("setipk");
        float ipk = 0.0F;
        mahasiswa instance = null;
        instance.setipk(ipk);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnim method, of class mahasiswa.
     */
    @Test
    public void testGetnim() {
        System.out.println("getnim");
        mahasiswa instance = null;
        String expResult = "";
        String result = instance.getnim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnama method, of class mahasiswa.
     */
    @Test
    public void testGetnama() {
        System.out.println("getnama");
        mahasiswa instance = null;
        String expResult = "";
        String result = instance.getnama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getipk method, of class mahasiswa.
     */
    @Test
    public void testGetipk() {
        System.out.println("getipk");
        mahasiswa instance = null;
        float expResult = 0.0F;
        float result = instance.getipk();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class mahasiswa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        mahasiswa instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
