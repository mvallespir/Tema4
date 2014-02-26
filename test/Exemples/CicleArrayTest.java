/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemples;

import Institut.Modul;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MVC
 */
public class CicleArrayTest {
    
    public CicleArrayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirModul method, of class CicleArray.
     */
    @Test
    public void testAfegirModul() {
        System.out.println("afegirModul");
        Modul nouModul = null;
        CicleArray instance = new CicleArray(null, 0, 0);
        boolean expResult = false;
        boolean result = instance.afegirModul(nouModul);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of tornaModul method, of class CicleArray.
     */
    @Test
    public void testTornaModul() {
        System.out.println("tornaModul");
        String nomModul = "";
        CicleArray instance = new CicleArray(null, 0, 0);
        Modul expResult = null;
        Modul result = instance.tornaModul(nomModul);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarModul method, of class CicleArray.
     */
    @Test
    public void testEliminarModul() {
        System.out.println("eliminarModul");
        String nomModul = "";
        CicleArray instance = new CicleArray(null, 0, 0);
        boolean expResult = false;
        boolean result = instance.eliminarModul(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


}