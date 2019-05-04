/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import factoryexample.Articulo;
import factoryexample.ArticuloFactory;
import factoryexample.TipoArticulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabm_
 */
public class ArticuloTest {
    
    public ArticuloTest() {
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

    //Unit tests for Iva 10.7, Iva empty and Iva 21
    @Test
    public void calcularIva107(){
        ArticuloFactory articuloFactory = new ArticuloFactory();
        Articulo articulo = articuloFactory.create(1, "Router Cisco 2200", new TipoArticulo(1, "INFORMATICO"), 10000, false);
        System.out.println("Unit test calculo IVA 10.7 Articulo informatico");
        System.out.println("Precio del articulo: " + String.valueOf(articulo.getPrecio()));
        System.out.println("Valor del IVA: " + String.valueOf(articulo.calcularIva()));
        assertEquals(1070, articulo.calcularIva());
    }
    
    @Test
    public void calcularIvaEmpty(){
        ArticuloFactory articuloFactory = new ArticuloFactory();
        Articulo articulo = articuloFactory.create(2, "Server BGH IVA Exento", new TipoArticulo(1, "INFORMATICO"), 100000, true);
        System.out.println("Unit test calculo IVA IVA EXENTO Articulo informatico");
        System.out.println("Precio del articulo " + String.valueOf(articulo.getPrecio()));
        System.out.println("Valor del IVA: " + String.valueOf(articulo.calcularIva()));
        assertEquals(0, articulo.calcularIva());
    }
    
    @Test
    public void calcularIva21(){
        ArticuloFactory articuloFactory = new ArticuloFactory();
        Articulo articulo = articuloFactory.create(3, "Pack x 100 resma hojas A4", new TipoArticulo(2, "OFICINA"), 3000, true);
        System.out.println("Unit test calculo IVA IVA 21 Articulo oficina");
        System.out.println("Precio del articulo " + String.valueOf(articulo.getPrecio()));
        System.out.println("Valor del IVA: " + String.valueOf(articulo.calcularIva()));
        assertEquals(630, articulo.calcularIva());
    }
    
}
