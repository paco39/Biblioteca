/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paco
 */
public class ConexionTest {
    
    private final Conexion conexion;
    
    public ConexionTest() {
        conexion=new Conexion();
    }
    
    @Test
    public void pruebaConectionExitosa() throws SQLException{
        Connection connection = conexion.obtenerConexion();
        assertNotNull(connection);
    }
    
    @Test
    public void pruebaDesconectaExitoso() throws SQLException{
        Connection connection= conexion.obtenerConexion();
        conexion.desconecta();
        assertTrue(connection.isClosed());
    }

    /**
     * Test of obtenerConexion method, of class Conexion.
     */
    //@Test
    /*public void testObtenerConexion() throws SQLException {
        System.out.println("obtenerConexion");
        Conexion instance = new Conexion();
        Connection expResult = null;
        Connection result = instance.obtenerConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of desconecta method, of class Conexion.
     */
    /*@Test
    public void testDesconecta() {
        System.out.println("desconecta");
        Conexion instance = new Conexion();
        instance.desconecta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
