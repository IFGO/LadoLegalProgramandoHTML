/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.figuras;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author aluno
 */
public class TrianguloTest {
     public TrianguloTest() {
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
    
    @Test
    public void deveCalcularAreaCorretamente(){
        Triangulo triangulo = new Triangulo(4L,6L,2L,3L);
        
        assertEquals(12L, (long) triangulo.getArea());
        
    }
    
    @Test
    public void deveCalcularPerimetroCorretamente(){
        Triangulo triangulo = new Triangulo(4L,6L,2L,3L);
        assertEquals(9L, (long) triangulo.getPerimetro());
        
        Triangulo triangulo2 = new Triangulo(3L,5L,4L,3L);
        assertEquals(10L, (long) triangulo2.getPerimetro());

        Triangulo triangulo3 = new Triangulo(5L,7L,5L,5L);
        assertEquals(15L, (long) triangulo3.getPerimetro());
    }
}
