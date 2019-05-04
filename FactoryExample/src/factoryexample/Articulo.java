/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryexample;

/**
 *
 * @author fabm_
 */
public abstract class Articulo {
    private int id;
    private String nombre;
    private TipoArticulo tipoArticulo;
    private long precio;
    private long iva;
    
    public Articulo(int id, String nombre, TipoArticulo tipoArticulo, long precio){
        this.id = id;
        this.nombre = nombre;
        this.tipoArticulo = tipoArticulo;
        this.precio = precio;
        this.iva = 0;
    }
    
    public long getPrecio(){
        return this.precio;
    }
    
    public abstract long calcularIva();
    
    public long getIva(){
        return this.iva;
    }
}
